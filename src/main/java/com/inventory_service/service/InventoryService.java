package com.inventory_service.service;

import com.inventory_service.entity.Inventory;
import com.inventory_service.repository.InventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InventoryService {

    @Autowired
    private InventoryRepository inventoryRepository;

    public void updateInventory(Long productId, int quantity) {

        Inventory inventoryItem = inventoryRepository.findById(productId).get();

        if(inventoryItem != null) {
            inventoryItem.setQuantity(quantity);
            inventoryRepository.save(inventoryItem);
        }
        else {
            System.out.println("Inventory item not found for productId: " + productId);
        }

    }
}

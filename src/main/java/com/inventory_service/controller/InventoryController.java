package com.inventory_service.controller;

import com.inventory_service.entity.Inventory;
import com.inventory_service.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/inventory")
public class InventoryController {

    @Autowired
    private InventoryService inventoryService;

    @PutMapping("/update")
    private void updateInventory(@RequestParam Long productId, @RequestParam int quantity) {
        inventoryService.updateInventory(productId, quantity);
    }

}

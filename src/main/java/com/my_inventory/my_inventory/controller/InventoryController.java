package com.my_inventory.my_inventory.controller;

import com.my_inventory.my_inventory.entity.Inventory;
import com.my_inventory.my_inventory.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/inventory")
public class InventoryController {
    @Autowired
    private InventoryService inventoryService;

    @PostMapping("/save")
    public Inventory save(@RequestBody Inventory inventory){
        System.out.println(inventory.getName());
        return inventoryService.save(inventory);
    }

    @GetMapping("/get/{id}")
    public Inventory getById(@PathVariable int id){
        return inventoryService.getById(id);
    }
    @GetMapping("/getAll")
    public List<Inventory> getAll(){
        return inventoryService.getAll();
    }

    @DeleteMapping("/delete/{id}")
    public String deleteInventory(@PathVariable int id){
        return inventoryService.deleteInventory(id);
    }

    @PutMapping("/update")
    public Inventory updateInventory(@RequestBody Inventory inventory){
        return inventoryService.updateInventory(inventory);
    }
}

package com.my_inventory.my_inventory.controller;

import com.my_inventory.my_inventory.entity.Inventory;
import com.my_inventory.my_inventory.entity.Product;
import com.my_inventory.my_inventory.service.InventoryService;
import com.my_inventory.my_inventory.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductService productService;
    @Autowired
    private InventoryService inventoryService;

    @GetMapping("/getAll")
    public List<Product> getAll(){
        return productService.getAll();
    }

    @GetMapping("/get/{id}")
    public Product getById(@PathVariable int id){
        return productService.getById(id);
    }

    @PostMapping("/save/{inventory_id}")
    public Product save(@RequestBody Product product, @PathVariable int inventory_id){
        Inventory inventory = inventoryService.getById(inventory_id);
        product.setInventory(inventory);
        return productService.save(product);
    }
}

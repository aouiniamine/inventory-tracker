package com.my_inventory.my_inventory.service;

import com.my_inventory.my_inventory.entity.Inventory;
import com.my_inventory.my_inventory.repository.InventoryRepository;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InventoryService {
    @Autowired
    private InventoryRepository inventoryRepository;

    public Inventory save(Inventory inventory){

        return inventoryRepository.save(inventory);
    }

    public List<Inventory> getAll(){
        return inventoryRepository.findAll();
    }

    public Inventory getById(int id){
        return inventoryRepository.findById(id).orElse(null);
    }

    public String deleteInventory(int id){
        inventoryRepository.deleteById(id);
        return "Inventory is deleted";
    }

    public Inventory updateInventory(Inventory inventory){
        Inventory existingInventory =
                inventoryRepository.findById(inventory.getId()).orElse(null);
        if (existingInventory == null){
            return null;
        }
        return inventoryRepository.save(inventory);
    }
}

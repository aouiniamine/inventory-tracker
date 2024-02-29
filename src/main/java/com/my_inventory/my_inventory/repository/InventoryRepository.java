package com.my_inventory.my_inventory.repository;

import com.my_inventory.my_inventory.entity.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryRepository extends JpaRepository<Inventory, Integer> {
}

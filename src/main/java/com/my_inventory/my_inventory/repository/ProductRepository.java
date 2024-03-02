package com.my_inventory.my_inventory.repository;

import com.my_inventory.my_inventory.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}

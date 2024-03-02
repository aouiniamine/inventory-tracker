package com.my_inventory.my_inventory.service;

import com.my_inventory.my_inventory.entity.Inventory;
import com.my_inventory.my_inventory.entity.Product;
import com.my_inventory.my_inventory.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public Product save(Product product){
        return productRepository.save(product);
    }

    public List<Product> getAll(){
        return productRepository.findAll();
    }

    public Product getById(int id){
        return productRepository.findById(id).orElse(null);
    }

}

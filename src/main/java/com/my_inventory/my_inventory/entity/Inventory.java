package com.my_inventory.my_inventory.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "inventory")
public class Inventory {

    @Id
    @GeneratedValue
    private int id;

    @OneToMany(mappedBy = "inventory")
    private Set<Product> products = new HashSet<>();
    private String name;
    public String getName(){
        return name;
    }


    public int getId() {
        return id;
    }

    public int setId(int id){
        this.id = id;
        return id;
    }
    public Set<Product> getProducts() {
        return products;
    }
    public void addProduct(Product product){
        products.add(product);
    }

}

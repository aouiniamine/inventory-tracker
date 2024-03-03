package com.my_inventory.my_inventory.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "inventory")
public class Inventory {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    @OneToMany(fetch = FetchType.EAGER)
    @JoinColumn(name = "inventory_id", referencedColumnName = "id")
    private List<Product> products;
    public String getName(){
        return name;
    }
    public int getId() {
        return id;
    }
    public List<Product> getProducts() {
        return products;
    }

}

package com.my_inventory.my_inventory.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


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
}

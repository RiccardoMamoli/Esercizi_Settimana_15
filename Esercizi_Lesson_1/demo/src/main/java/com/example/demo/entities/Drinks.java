package com.example.demo.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

public class Drinks extends MenuItem{
    private double size_drink;

    public Drinks(String name, int calories, double price, double size_drink) {
        super(name, calories, price);
        this.size_drink = size_drink;
    }
}

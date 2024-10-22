package com.example.demo.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

public class Topping extends MenuItem {
    public Topping(String name, int calories, double price) {
        super(name, calories, price);
    }
}

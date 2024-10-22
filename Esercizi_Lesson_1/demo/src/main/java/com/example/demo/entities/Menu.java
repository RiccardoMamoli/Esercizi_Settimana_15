package com.example.demo.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString

public class Menu {
    List<Pizzas> list_pizza;
    List<Topping> list_topping;
    List<Drinks> list_drinks;

    public void printPizza() {
        list_pizza.forEach(pizzas -> {
            System.out.println("----- Pizza -----");
            System.out.println("Nome: " + pizzas.getName());
            System.out.println("Calorie: " + pizzas.getCalories());
            System.out.println("Prezzo:" + pizzas.getPrice());
            System.out.println("Ingredienti: ");
            List<Topping> listaTopping = pizzas.getLista_topping();
            listaTopping.forEach(topping -> {
                System.out.println("- " + topping.getName());
            });
        });
    }

    public void printMenu(){
        System.out.println("-------------- MENU -------------- ");
        printPizza();
    }

    public Menu(List<Pizzas> list_pizza, List<Topping> list_topping, List<Drinks> list_drinks) {
        this.list_pizza = list_pizza;
        this.list_topping = list_topping;
        this.list_drinks = list_drinks;
    }
}

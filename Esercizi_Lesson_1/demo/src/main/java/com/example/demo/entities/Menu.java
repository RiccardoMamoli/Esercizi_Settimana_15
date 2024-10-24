package com.example.demo.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@ToString

public class Menu {
    private final List<Pizzas> list_pizza;
    private final List<Topping> list_topping;
    private final List<Drinks> list_drinks;

    public Menu(List<Pizzas> list_pizza, List<Topping> list_topping, List<Drinks> list_drinks) {
        this.list_pizza = list_pizza;
        this.list_topping = list_topping;
        this.list_drinks = list_drinks;
    }

    public void printPizza() {
        System.out.println("----- Pizza -----");
        list_pizza.forEach(pizzas -> {
            System.out.println(" ");
            System.out.println("Nome: " + pizzas.getName());
            System.out.println("Calorie: " + pizzas.getCalories());
            System.out.println("Prezzo:" + pizzas.getPrice());
            System.out.println("Ingredienti: ");
            List<Topping> listaTopping = pizzas.getLista_topping();
            listaTopping.forEach(topping -> {
                System.out.println("- " + topping.getName());

            });
            System.out.println(" ");
        });
    }

    public void printDrinks() {
        System.out.println("----- Drink -----");
        list_drinks.forEach(drink -> {
            System.out.println(" ");
            System.out.println("Nome: " + drink.getName());
            System.out.println("Calorie: " + drink.getCalories());
            System.out.println("Prezzo:" + drink.getPrice());
            System.out.println(" ");
        });
    }

    public void printToppings() {
        System.out.println("----- Topping -----");
        list_topping.forEach(top -> {
            System.out.println(" ");
            System.out.println("Nome: " + top.getName());
            System.out.println("Calorie: " + top.getCalories());
            System.out.println("Prezzo:" + top.getPrice());
            System.out.println(" ");
        });
    }

    public void printMenu(){
        System.out.println("-------------- MENU -------------- ");
        printPizza();
        printDrinks();
        printToppings();
    }

}

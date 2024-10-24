package com.example.demo;


import com.example.demo.entities.Drinks;
import com.example.demo.entities.Menu;
import com.example.demo.entities.Pizzas;
import com.example.demo.entities.Topping;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class MenuConfig {

    @Bean(name = "Topping_Cheese")
    public Topping topping_cheese() {
     return new Topping("Cheese",92,0.69);
    }

    @Bean(name = "Topping_Tomato")
    public Topping topping_tomato() {
        return new Topping("Tomato",92,0.00);
    }

    @Bean(name = "Topping_Ananas")
    public Topping topping_ananas() {
        return new Topping("Ananas",92,0.00);
    }

    @Bean(name = "Topping_Ham")
    public Topping topping_ham(){
        return new Topping("Ham", 35, 0.99);
    }

    @Bean(name = "Topping_Salami")
    public Topping topping_salami(){
        return new Topping("Salami", 86, 0.99);
    }

    @Bean(name = "Topping_Onion")
    public Topping topping_onion(){
        return new Topping("Onion", 22, 0.69);
    }


    @Bean(name = "Pizza_Margherita")
    public Pizzas pizza_margherita(){
        List<Topping> lista_topping = new ArrayList<>();
        lista_topping.add(topping_cheese());
        lista_topping.add(topping_tomato());
        return new Pizzas("Pizza Margherita", 1104,4.99, lista_topping);
    }

    @Bean(name = "Pizza_Hawaian")
    public Pizzas pizza_hawaian(){
        List<Topping> lista_topping = new ArrayList<>();
        lista_topping.add(topping_tomato());
        lista_topping.add(topping_cheese());
        lista_topping.add(topping_ham());
        lista_topping.add(topping_ananas());
        return new Pizzas("Hawaian Pizza", 1024, 6.49, lista_topping);

    }

    @Bean(name = "Pizza_Salami")
    public Pizzas salami_pizza() {
        List<Topping> lista_topping = new ArrayList<>();
        lista_topping.add(topping_tomato());
        lista_topping.add(topping_cheese());
        lista_topping.add(topping_salami());
        return new Pizzas("Salami Pizza", 1160, 5.99, lista_topping);
    }

    @Bean(name = "Lemonade")
    public Drinks lemonade(){
        return new Drinks("Lemonade", 128, 1.29, 0.33);
    }

    @Bean(name = "Water")
    public Drinks water(){
        return new Drinks("Water", 0,1.29,0.5);
    }

    @Bean(name = "Wine")
    public Drinks wine(){
        return new Drinks("Wine", 607, 7.49, 0.75);
    }

    @Bean(name = "Menu")
    public Menu menu(){
        List<Pizzas> list_pizzas = new ArrayList<>();
        List<Drinks> list_drinks = new ArrayList<>();
        List<Topping> list_topping = new ArrayList<>();

        list_topping.add(topping_salami());
        list_topping.add(topping_onion());
        list_topping.add(topping_cheese());
        list_topping.add(topping_ananas());
        list_topping.add(topping_tomato());
        list_drinks.add(wine());
        list_drinks.add(lemonade());
        list_drinks.add(water());
        list_pizzas.add(pizza_hawaian());
        list_pizzas.add(pizza_margherita());
        list_pizzas.add(salami_pizza());

        return new Menu(list_pizzas,list_topping, list_drinks);
    }



}

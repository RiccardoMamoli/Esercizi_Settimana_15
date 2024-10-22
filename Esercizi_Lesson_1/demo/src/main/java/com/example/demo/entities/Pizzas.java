package com.example.demo.entities;



import java.util.List;



public class Pizzas extends MenuItem{

    private List<Topping> lista_topping;

    public Pizzas(String name, int calories, double price, List<Topping> lista_topping) {
        super(name, calories, price);
        this.lista_topping = lista_topping;
    }

    public List<Topping> getLista_topping() {
        return lista_topping;
    }

    public void setLista_topping(List<Topping> lista_topping) {
        this.lista_topping = lista_topping;
    }
}

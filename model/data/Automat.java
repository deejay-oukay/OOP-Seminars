package model.data;

import java.util.ArrayList;

// SOLID
// O - Если будет необходим новый фунционал для этого класса, то необходимо будет наследовать новый класс от этого уже в новом классе реализовать новый функционал
public class Automat {
    protected ArrayList<Product> products = new ArrayList<>();
    private static int nextId = 1;
    private int id;
    private String name;

    public Automat(String name) {
        this.id = nextId;
        nextId++;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void addProduct2Automat(Product product) {
        products.add(product);
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "\n" + getClass().getName() + ": id=" + id + ", name=" + name;
    }
}

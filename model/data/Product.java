package model.data;

// SOLID
// O - Если будет необходим новый фунционал для этого класса, то необходимо будет наследовать новый класс от этого уже в новом классе реализовать новый функционал
public abstract class Product {
    private static int nextId = 1;
    private int id;
    private String name;

    public Product(String name) {
        this.id = nextId;
        nextId++;
        this.name = name;
    }

    @Override
    public String toString() {
        return "\n" + this.getClass().getName() + ": id=" + id + ", name=" + name;
    }

    public int getId() {
        return id;
    }
}

package model.data;

import model.service.Heavy;

// SOLID
// I - для товар, для которых может быть важен вес используем интерфейс, пригодный для продуктов с весом
public class Food extends Product implements Heavy {
    private double weight;

    public Food(String name, double weight) {
        super(name);
        this.weight = weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    };

    @Override
    public String toString() {
        return super.toString() + ", weight=" + weight;
    }

}

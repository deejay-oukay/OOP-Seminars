package model.data;

import model.service.Liquid;

// SOLID
// I - для товар, для которых может быть важен объём используем интерфейс, пригодный для продуктов с объёмом
public class Beverage extends Product implements Liquid {
    private double volume;

    public Beverage(String name, double volume) {
        super(name);
        this.volume = volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    };

    @Override
    public String toString() {
        return super.toString() + ", volume=" + volume;
    }

}

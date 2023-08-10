package model.data;

import model.service.Hot;

// SOLID
// I - для товар, для которых может быть важна температура используем интерфейс, пригодный для продуктов с температурой
// I - здесь же через наследование от родительского класса доступен подходящий интерфейс с объёмом
public class HotBeverage extends Beverage implements Hot {
    int temperature;

    public HotBeverage(String name, double volume, int temperature) {
        super(name, volume);
        this.temperature = temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    };

    @Override
    public String toString() {
        return super.toString() + ", temperature=" + temperature;
    }

}

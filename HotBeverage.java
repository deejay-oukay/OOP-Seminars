import java.util.Calendar;

public class HotBeverage extends Beverage {
    int temperature;

    public HotBeverage(String name, int price, int quanity, Calendar bestBefore, double volume, int temperature) {
        super(name, price, quanity, bestBefore, volume);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return super.toString() + ", temperature=" + temperature;
    }

}

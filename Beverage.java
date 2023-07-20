import java.util.Calendar;

public class Beverage extends Product {
    private double volume;

    public Beverage(String name, int price, int quanity, Calendar bestBefore, double volume) {
        super(name, price, quanity, bestBefore);
        this.volume = volume;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Product [name=" + getName() + ", price=" + getPrice() + ", quanity=" + getQuanity() + ", bestBefore="
                + getBestBefore().get(Calendar.YEAR) + '.' + getBestBefore().get(Calendar.MONTH) + '.'
                + getBestBefore().get(Calendar.DAY_OF_MONTH) + ", volume=" + volume + "]";
    }

}

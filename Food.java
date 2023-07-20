import java.util.Calendar;

public class Food extends Product {
    private double weight;

    public Food(String name, int price, int quanity, Calendar bestBefore, double weight) {
        super(name, price, quanity, bestBefore);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Product [name=" + getName() + ", price=" + getPrice() + ", quanity=" + getQuanity() + ", bestBefore="
                + getBestBefore().get(Calendar.YEAR) + '.' + getBestBefore().get(Calendar.MONTH) + '.'
                + getBestBefore().get(Calendar.DAY_OF_MONTH) + ", weight=" + weight + "]";
    }

}

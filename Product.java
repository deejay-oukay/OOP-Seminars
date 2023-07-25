import java.util.Calendar;

public abstract class Product {
    private String name;
    private int price;
    private int quanity;
    private Calendar bestBefore;

    public Product(String name, int price, int quanity, Calendar bestBefore) {
        this.name = name;
        this.price = price;
        this.quanity = quanity;
        this.bestBefore = bestBefore;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getQuanity() {
        return quanity;
    }

    public Calendar getBestBefore() {
        return bestBefore;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setQuanity(int quanity) {
        this.quanity = quanity;
    }

    public void setBestBefore(Calendar bestBefore) {
        this.bestBefore = bestBefore;
    }

    @Override
    public String toString() {
        return "Product [name=" + name + ", price=" + price + ", quanity=" + quanity + ", bestBefore="
                + bestBefore.get(Calendar.YEAR) + '.' + bestBefore.get(Calendar.MONTH) + '.'
                + bestBefore.get(Calendar.DAY_OF_MONTH) + "]";
    }
}

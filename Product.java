import java.util.Calendar;

public abstract class Product implements Comparable<Product> {
    private String name;
    private int price;
    private int quanity;
    private Calendar bestBefore;
    static String sortMode = "price";

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

    @Override
    public int compareTo(Product o) {
        if (sortMode == "price") {
            if (this.getPrice() == o.getPrice())
                return 0;
            if (this.getPrice() < o.getPrice())
                return -1;
            return 1;
        }
        if (sortMode == "quanity") {
            if (this.getQuanity() == o.getQuanity())
                return 0;
            if (this.getQuanity() < o.getQuanity())
                return -1;
            return 1;
        }
        return 0;
    }
}

import java.util.ArrayList;

public class Order {
    private ArrayList<Product> list;
    private Human person;
    private double amount;

    public Order(ArrayList<Product> list, Human person) {
        this.list = list;
        this.person = person;
        double amount = 0;
        for (Product product : list) {
            amount += product.getPrice();
        }
        this.amount = amount;
        System.out.println(toString());
    }

    @Override
    public String toString() {
        String result = "Товары в заказе от " + person.getName() + ":";
        for (Product product : list) {
            result += "\n- " + product.getName();
        }
        result += "\nОбщая стоимость: " + amount + "\n";
        return result;
    }

}

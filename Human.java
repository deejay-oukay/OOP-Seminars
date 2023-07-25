import java.util.ArrayList;
import java.util.List;

public class Human extends Actor implements ActorBehavoir {

    private double money;
    // private Automat nearestAutomat;

    public Human(String name, boolean isMakeOrder, boolean isTakeOrder, double money) {
        super(name, isMakeOrder, isTakeOrder);
        this.money = money;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    @Override
    public void setMakeOrder(boolean isMake) {
        this.isMakeOrder = isMake;
    }

    @Override
    public void setTakeOrder(boolean isTake) {
        this.isTakeOrder = isTake;
    }

    public boolean isMakeOrder() {
        return isMakeOrder;
    }

    public boolean isTakeOrder() {
        return isTakeOrder;
    }

    // public void findNearestAutomat() {
    // Product p1 = new Food("Twix", 100, 5, new GregorianCalendar(2023, 8, 20),
    // .3);
    // Product p2 = new Beverage("Pepsi", 300, 7, new GregorianCalendar(2023, 10,
    // 20), .33);
    // List<Product> list = new ArrayList<>();
    // list.add(p1);
    // list.add(p2);

    // Automat automat = new Automat();
    // automat.initProducts(list);
    // this.nearestAutomat = automat;
    // }

    // @Override
    public Order MakeOrder(List<String> deList, Automat nearestAutomat) {
        ArrayList<Product> shoppingList = new ArrayList<>();
        Product shopingProduct;
        for (String nameProduct : deList) {
            shopingProduct = nearestAutomat.getProduct(nameProduct);
            if (shopingProduct != null)
                shoppingList.add(shopingProduct);
        }
        setMakeOrder(true);
        return nearestAutomat.createOrder(shoppingList, this);
    }

}

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

public class Seminar1 {
    // Реализуйте класс Товар, содержащий данные о товаре, и ТорговыйАвтомат,
    // содержащий в себе методы initProducts (List <Product>) сохраняющий в себе
    // список исходных продуктов и getProduct(String name)

    public static void main(String[] args) {
        Product p1 = new Food("Twix", 100, 5, new GregorianCalendar(2023, 8, 20), .3);
        Product p2 = new Beverage("Pepsi", 300, 7, new GregorianCalendar(2023, 10, 20), .33);

        Automat a1 = new Automat();
        List<Product> list1 = new ArrayList<>();
        list1.add(p1);
        list1.add(p2);
        a1.initProducts(list1);

        System.out.println(a1.getProduct("Twix").toString());
        System.out.println(a1.getProduct("Pepsi").toString());

        HotBeverage p3 = new HotBeverage("Capuchino", 150, 10, new GregorianCalendar(2023, 8, 23), 1, 100);
        HotBeverage p4 = new HotBeverage("Cacao", 100, 5, new GregorianCalendar(2023, 7, 20), 2, 90);

        HotAutomat a2 = new HotAutomat();
        List<HotBeverage> list2 = new ArrayList<>();
        list2.add(p3);
        list2.add(p4);
        a2.initBeverages(list2);

        System.out.println(a2.getProduct("Capuchino", 1, 100).toString());

        HotAutomat a3 = new HotAutomat();
        List<HotBeverage> list3 = new ArrayList<>();
        list3.add(p4);
        a3.initBeverages(list3);

        System.out.println(a2.getProduct("Cacao", 2, 90).toString());

    }
}
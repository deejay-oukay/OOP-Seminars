import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

public class Seminar1 {
    // Реализуйте класс Товар, содержащий данные о товаре, и ТорговыйАвтомат,
    // содержащий в себе методы initProducts (List <Product>) сохраняющий в себе
    // список исходных продуктов и getProduct(String name)

    public static void main(String[] args) {
        Product p1 = new Food("Twix", 100, 5, new GregorianCalendar(2023, 8, 20));
        Product p2 = new Food("Mars", 200, 3, new GregorianCalendar(2023, 9, 20));
        Product p3 = new Food("Sneakers", 300, 7, new GregorianCalendar(2023, 10, 20));

        Automat a1 = new Automat();
        List<Product> tempList = new ArrayList<>();
        tempList.add(p1);
        tempList.add(p2);
        tempList.add(p3);
        a1.initProducts(tempList);

        System.out.println(a1.getProduct("Sneakers").toString());
    }
}
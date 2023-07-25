import java.util.ArrayList;
import java.util.List;

public class Automat {
    private List<Product> listProduct;

    public void initProducts(List<Product> myList) {
        listProduct = myList;
    }

    public Product getProduct(String name) {
        for (Product product : listProduct) {
            if (product.getName().equals(name))
                return product;
        }
        return null;
    }

    public void changeQuantity(String name) {
        for (Product product : listProduct) {
            if (product.getName().equals(name))
                product.setQuanity(product.getQuanity() - 1);
        }
    }

    public Order createOrder(ArrayList<Product> shoppingList, Human person) {
        ArrayList<Product> list = new ArrayList<>();
        for (Product product : shoppingList) {
            if (product.getQuanity() > 0)
                list.add(product);
            else
                System.out.println(
                        "Продукт " + product.getName() + " не был добавлен в заказ, т.к. он закончился :-(\n");
            // уменьшение количества этого товара в автомате
            changeQuantity(product.getName());
        }
        if (list.isEmpty())
            return null;
        else
            return new Order(list, person);
    }
}

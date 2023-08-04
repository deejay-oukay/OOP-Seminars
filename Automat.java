import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Automat implements Iterable<Product>, Service<Automat, Product> {
    protected List<Product> listProduct;

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

    public List<Product> getProducts() {
        return listProduct;
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

    @Override
    public Iterator<Product> iterator() {
        return new Iterator<Product>() {
            private int counter = 0;

            @Override
            public boolean hasNext() {
                return (counter < listProduct.size());
            }

            @Override
            public Product next() {
                if (!hasNext()) {
                    return null;
                }
                return listProduct.get(counter++);
            }
        };
    }

    // вариант с указанием автомата (на мой взгляд нелогичный)
    @Override
    public void addProduct2Automat(Automat automat, Product product) {
        automat.listProduct.add(product);
    }

    @Override
    // вариант без указания автомата
    public void addProduct2Automat(Product product) {
        listProduct.add(product);
    }
}

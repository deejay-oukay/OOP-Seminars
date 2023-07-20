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
}

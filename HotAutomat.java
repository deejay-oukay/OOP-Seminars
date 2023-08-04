import java.util.List;

public class HotAutomat extends Automat {

    protected List<HotBeverage> listProduct;

    public void initBeverages(List<HotBeverage> myList) {
        listProduct = myList;
    }

    public HotBeverage getProduct(String name, int volume, int temperature) {
        for (HotBeverage product : listProduct) {
            if (product.getName().equals(name) && (product.getVolume() == volume)
                    && (product.getTemperature() == temperature))
                return product;
        }
        return null;
    }

    public List<HotBeverage> getHots() {
        return listProduct;
    }

}
import java.util.List;

public interface ActorBehavoir {
    void setMakeOrder(boolean isMake);

    void setTakeOrder(boolean isTake);

    boolean isMakeOrder();

    boolean isTakeOrder();

    Order MakeOrder(List<String> my_List, Automat nearestAutomat);
}

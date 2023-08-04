import java.util.Comparator;

public class UserNameComparator<T extends User> implements Comparator<T> {

    public int compare(T o1, T o2) {
        return o1.getName().compareTo(o2.getName());
    }

    @Override
    public Comparator<T> reversed() {
        return Comparator.super.reversed();
    }
}

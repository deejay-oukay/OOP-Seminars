import java.util.List;

public class UserComparator<T extends User> /* implements Comparable<UserComparator> */ {
    private List<T> listOfItems;

    public List<T> getListOfItems() {
        return listOfItems;
    }

    public void addItem(T item) {
        this.listOfItems.add(0, item);
    }

    // public int compareTo(User otherUser) {
    // return (int) this.getAge() - otherUser.getAge();
    // }

    @Override
    public String toString() {
        return "UserComparator [listOfItems=" + listOfItems + "]";
    }

}

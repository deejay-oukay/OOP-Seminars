import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Добавляем продукты в автоматы (Семинар 1)
        Food f1 = new Food("Twix", 100, 1, new GregorianCalendar(2023, 8, 20),
                .7);
        // Product f2 = new Food("Mars", 300, 10, new GregorianCalendar(2023, 8, 25),
        // .5);
        // Product f3 = new Food("Sneakers", 200, 15, new GregorianCalendar(2023, 8,
        // 30), .3);

        Automat a1 = new Automat();
        List<Product> list1 = new ArrayList<>();
        list1.add(f1);
        // list1.add(f2);
        // list1.add(f3);
        a1.initProducts(list1);

        // System.out.println(a1.getProduct("Twix").toString());
        // System.out.println(a1.getProduct("Pepsi").toString());

        HotBeverage h1 = new HotBeverage("Capuchino", 150, 10, new GregorianCalendar(2023, 8, 23), 1, 100);
        // HotBeverage h2 = new HotBeverage("Cacao", 100, 5, new
        // GregorianCalendar(2023,7, 20), 2, 90);

        HotAutomat a2 = new HotAutomat();
        List<HotBeverage> list2 = new ArrayList<>();
        list2.add(h1);
        // list2.add(h2);

        a2.initBeverages(list2);
        // System.out.println(a2.getProduct("Capuchino", 1, 100).toString());

        // HotAutomat a3 = new HotAutomat();
        // List<HotBeverage> list3 = new ArrayList<>();
        // list3.add(h2);
        // a3.initBeverages(list3);
        // System.out.println(a2.getProduct("Cacao", 2, 90).toString());

        // Создаём заказ (Семинар 2)
        // Human man = new Human("Konstantin", false, false, 10000);
        // Human woman = new Human("Tatyana", false, false, 1000);

        // List<String> list2 = new ArrayList<>();
        // list2.add("Twix");
        // list2.add("Sneakers");

        // List<String> list3 = new ArrayList<>();
        // list3.add("Mars");
        // list3.add("Twix");

        // man.MakeOrder(list2, a1);
        // woman.MakeOrder(list3, a1);

        // // Сравниваем товары в автомате (Семинар 3)
        // System.out.println("Все товары в автомате без сортировки");
        // for (Product prod : a1.getProducts())
        // System.out.println(prod.toString());
        // System.out.println("Все товары в автомате, отсортированные по цене");
        // Collections.sort(a1.getProducts());
        // for (Product prod : a1.getProducts())
        // System.out.println(prod.toString());
        // System.out.println("Все товары в автомате, отсортированные по количеству");
        // // меняем поле, по которому нужна сортировка
        // Product.sortMode = "quanity";
        // Collections.sort(a1.getProducts());
        // for (Product prod : a1.getProducts())
        // System.out.println(prod.toString());

        // Добавляем продукты в автомат "через сервис" (Семинар 4)
        Food p2 = new Food("Mars", 300, 10, new GregorianCalendar(2023, 8, 25), .5);
        Food p3 = new Food("Sneakers", 200, 15, new GregorianCalendar(2023, 8, 30), .3);

        Beverage b1 = new Beverage("Pepsi", 70, 3, new GregorianCalendar(2023, 9, 30), .33);
        Beverage b2 = new Beverage("Sprite", 75, 30, new GregorianCalendar(2023, 9, 20), .5);

        HotBeverage h2 = new HotBeverage("Cacao", 100, 5, new GregorianCalendar(2023, 7, 20), 2, 90);
        HotBeverage h3 = new HotBeverage("Tea", 10, 50, new GregorianCalendar(2023, 10, 20), 3, 75);

        // используем оба варианта по очереди
        a1.addProduct2Automat(a1, p2);
        a1.addProduct2Automat(p3);
        a1.addProduct2Automat(a1, b1);
        a1.addProduct2Automat(b2);

        // a2.addProduct2Automat(a2, h2);
        // a2.addProduct2Automat(h3);

        // список товаров в автомате
        System.out.println(a1.getProducts());
        System.out.println("-----------");
        System.out.println(a2.getHots());
        System.out.println("-----------");
    }

    public static void main4Seminar(String[] args) {
        Student stud1 = new Student("Вася", "Васильев", 1, 5);
        Student stud2 = new Student("Яков", "Иванов", 2, 1);
        Student stud3 = new Student("Петя", "Петров", 3, 3);
        Student stud4 = new Student("Вася", "Петров", 4, 2);

        List<Student> studentsList = new ArrayList<>();
        studentsList.add(stud1);
        studentsList.add(stud2);
        studentsList.add(stud3);
        studentsList.add(stud4);

        studentsList.sort(new UserNameComparator<>());
        // System.out.println(studentsList);

        studentsList.sort(new UserNameComparator<>().reversed());
        // System.out.println(studentsList);

        UserNameComparator<User> comp = new UserNameComparator<>();

        studentsList.sort(comp);
        // System.out.println(studentsList);

        Teacher teacher1 = new Teacher("Олег", "Олегов", 10, "Математика", 4.5);
        Teacher teacher2 = new Teacher("Кирилл", "Кириллов", 10, "Математика", 4.5);

        List<Teacher> teachersList = new ArrayList<>();
        teachersList.add(teacher1);
        teachersList.add(teacher2);

        teachersList.sort(new UserNameComparator<>());
        teachersList.sort(new UserNameComparator<>().reversed());

        teachersList.sort(comp);
        // System.out.println(teachersList);

        List<User> usersList = new ArrayList<>();
        usersList.add(stud1);
        usersList.add(stud2);
        usersList.add(stud3);
        usersList.add(stud4);
        usersList.add(teacher1);
        usersList.add(teacher2);

        usersList.sort(new UserNameComparator<>());
        usersList.sort(new UserNameComparator<>().reversed());

        usersList.sort(comp);
        // System.out.println("=============");
        // System.out.println(usersList);
        stud1.print();
        teacher1.print();
    }
}

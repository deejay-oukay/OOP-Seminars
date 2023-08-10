package controller;

import java.util.ArrayList;

import model.data.Automat;
import model.data.Beverage;
import model.data.DataBase;
import model.data.Food;
import model.data.HotAutomat;
import model.data.HotBeverage;
import model.data.Product;
import view.MainView;

// SOLID
// S - Этот класс отвечает только за выполнение команд, запрошенных пользователем
public class MainController {
    private MainView view = new MainView();
    private DataBase db = new DataBase();

    public void createAutomat() {
        Automat automat = new Automat(view.AskParam("название"));
        db.Add(automat);
    }

    // SOLID
    // L - В этом методе вместо класса Automat можно использовать
    // его потомка - HotAutomat. Но, возможно, придётся повозиться с типизацией
    public void createHotAutomat() {
        Automat automat = new HotAutomat(view.AskParam("название"));
        db.Add(automat);
    }

    // SOLID
    // L - В трёх ниже следующих методах вместо класса Product можно использовать
    // более подходящего потомка. Но, возможно, придётся повозиться с типизацией
    public void createFood() {
        Product product = new Food(view.AskParam("название"), Double.parseDouble(view.AskParam("вес")));
        db.Add(product);
    }

    public void createBeverage() {
        Product product = new Beverage(view.AskParam("название"), Double.parseDouble(view.AskParam("объём")));
        db.Add(product);
    }

    public void createHotBeverage() {
        Product product = new HotBeverage(view.AskParam("название"), Double.parseDouble(view.AskParam("объём")),
                Integer.parseInt(view.AskParam("температуру")));
        db.Add(product);
    }

    public ArrayList<Automat> getAutomats() {
        return db.getAutomats();
    }

    public ArrayList<Product> getProducts() {
        return db.getProducts();
    }

    public void addProduct2Automat() {
        Product product = getProductFromDataBase(Integer.parseInt(view.AskParam("ID продукта")));
        Automat automat = getAutomatFromDataBase(Integer.parseInt(view.AskParam("ID автомата")));
        if (product.equals(null))
            view.Error("Указанный продукт не найден в БД");
        else if (automat.equals(null))
            view.Error("Указанный автомат не найден в БД");
        else
            automat.addProduct2Automat(product);
    }

    public Product getProductFromDataBase(int id) {
        ArrayList<Product> products = db.getProducts();
        for (Product product : products) {
            if (product.getId() == id)
                return product;
        }
        return null;
    }

    public Automat getAutomatFromDataBase(int id) {
        ArrayList<Automat> automats = db.getAutomats();
        for (Automat automat : automats) {
            if (automat.getId() == id)
                return automat;
        }
        return null;
    }

    public ArrayList<Product> getProductsFromAutomat() {
        Automat automat = getAutomatFromDataBase(Integer.parseInt(view.AskParam("ID автомата")));
        if (automat.equals(null)) {
            view.Error("Указанный автомат не найден в БД");
            return null;
        }
        return automat.getProducts();
    }
}

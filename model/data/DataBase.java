package model.data;

import java.util.ArrayList;

import view.MainView;

// SOLID
// S - Этот класс отвечает только за работу с данными
public class DataBase<T> {
    private MainView view = new MainView();
    private ArrayList<Automat> automats = new ArrayList<>();
    private ArrayList<Product> products = new ArrayList<>();

    public void Add(T data) {
        if (data instanceof Automat)
            automats.add((Automat) data);
        else if (data instanceof Product)
            products.add((Product) data);
        else
            view.Error("Добавить данные в БД не удалось: некорректный тип данных");
    }

    public ArrayList<Automat> getAutomats() {
        return automats;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

}

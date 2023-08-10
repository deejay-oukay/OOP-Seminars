package model.data;

import java.util.ArrayList;

public class HotAutomat extends Automat {
    protected ArrayList<HotBeverage> products = new ArrayList<>();

    public HotAutomat(String name) {
        super(name);
    }

}
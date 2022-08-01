package model;

import javafx.collections.ObservableList;
import view.tm.RoomsTm;

public class LocalMeal {

    private String Name;
    private Double Price;

    public LocalMeal() {
    }

    public LocalMeal(String name, Double price) {
        Name = name;
        Price = price;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Double getPrice() {
        return Price;
    }

    public void setPrice(Double price) {
        Price = price;
    }

    @Override
    public String toString() {
        return "LocalMeal{" +
                "Name='" + Name + '\'' +
                ", Price=" + Price +
                '}';
    }
}

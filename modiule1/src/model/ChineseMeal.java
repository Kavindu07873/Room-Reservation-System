package model;

import javafx.scene.control.Button;
import view.tm.ChineseMealTM;

public class ChineseMeal extends ChineseMealTM {

    private String Name;
    private Double Price;

    public ChineseMeal(String name, Double price, Button btn) {
    }

    public ChineseMeal(String name, Double price) {
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
        return "ChineseMeal{" +
                "Name='" + Name + '\'' +
                ", Price=" + Price +
                '}';
    }
}

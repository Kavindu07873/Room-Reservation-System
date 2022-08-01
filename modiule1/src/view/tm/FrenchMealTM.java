package view.tm;

import javafx.scene.control.Button;

public class FrenchMealTM {

    private String Name;
    private Double Price;
    private Button btn;

    public FrenchMealTM() {
    }

    public FrenchMealTM(String name, Double price, Button btn) {
        Name = name;
        Price = price;
        this.btn = btn;
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

    public Button getBtn() {
        return btn;
    }

    public void setBtn(Button btn) {
        this.btn = btn;
    }

    @Override
    public String toString() {
        return "FrenchMealTM{" +
                "Name='" + Name + '\'' +
                ", Price=" + Price +
                ", btn=" + btn +
                '}';
    }
}

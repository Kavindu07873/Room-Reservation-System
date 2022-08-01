package view.tm;

import javafx.scene.control.Button;

import java.awt.*;

public class QuadRoomTM {

     private String No;
    private Double Price;
  private String Option;
private Button btn;

    public QuadRoomTM() {
    }

    public QuadRoomTM(String no, Double price, String option, Button btn) {
        No = no;
        Price = price;
        Option = option;
        this.btn = btn;
    }

    public String getNo() {
        return No;
    }

    public void setNo(String no) {
        No = no;
    }

    public Double getPrice() {
        return Price;
    }

    public void setPrice(Double price) {
        Price = price;
    }

    public String getOption() {
        return Option;
    }

    public void setOption(String option) {
        Option = option;
    }

    public Button getBtn() {
        return btn;
    }

    public void setBtn(Button btn) {
        this.btn = btn;
    }

    @Override
    public String toString() {
        return "QuadRoomTM{" +
                "No='" + No + '\'' +
                ", Price=" + Price +
                ", Option='" + Option + '\'' +
                ", btn=" + btn +
                '}';
    }
}

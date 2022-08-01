package view.tm;

import javafx.scene.control.Button;

public class DoubleRoomtm extends RoomsTm{
    private String No;
    private Double Price;
    private String Option;
    private Button btn;


    public DoubleRoomtm(String name, Double price, Button btn) {
    }

    public DoubleRoomtm(String no, Double price, String option, Button btn) {
        No = no;
        Price = price;
        Option = option;
        this.btn = btn;
    }

    @Override
    public String getNo() {
        return No;
    }

    @Override
    public void setNo(String no) {
        No = no;
    }

    @Override
    public Double getPrice() {
        return Price;
    }

    @Override
    public void setPrice(Double price) {
        Price = price;
    }

    @Override
    public String getOption() {
        return Option;
    }

    @Override
    public void setOption(String option) {
        Option = option;
    }

    @Override
    public Button getBtn() {
        return btn;
    }

    @Override
    public void setBtn(Button btn) {
        this.btn = btn;
    }

    @Override
    public String toString() {
        return "DoubleRoomtm{" +
                "No='" + No + '\'' +
                ", Price=" + Price +
                ", Option='" + Option + '\'' +
                ", btn=" + btn +
                '}';
    }
}

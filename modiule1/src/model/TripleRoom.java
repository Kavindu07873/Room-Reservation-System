package model;

import javafx.scene.control.Button;
import view.tm.TripleRoomTm;

public class TripleRoom {


    private String No;
    private Double Price;
    private String Option;

    public TripleRoom() {
    }

    public TripleRoom(String no, Double price, String option) {
        No = no;
        Price = price;
        Option = option;
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

    @Override
    public String toString() {
        return "TripleRoom{" +
                "No='" + No + '\'' +
                ", Price=" + Price +
                ", Option='" + Option + '\'' +
                '}';
    }
}
package model;

import javafx.collections.ObservableList;
import view.tm.RoomsTm;

public class Rooms {
        private String No;
        private Double Price;
        private String Option;

    public Rooms() {
    }

    public Rooms(String no, Double price, String option) {
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
        return "Rooms{" +
                "No='" + No + '\'' +
                ", Price=" + Price +
                ", Option='" + Option + '\'' +
                '}';
    }
}

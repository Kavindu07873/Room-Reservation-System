package model;

public class Quadroom {
    private String No;
    private Double Price;
    private String Option;


    public Quadroom() {
    }

    public Quadroom(String no, Double price, String option) {
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
        return "Quadroom{" +
                "No='" + No + '\'' +
                ", Price=" + Price +
                ", Option='" + Option + '\'' +
                '}';
    }
}

package model;

public class DoubleRoom  {
  private String No;
  private Double Price;
   private String Option;

    public DoubleRoom() {
    }

    public DoubleRoom(String no, Double price, String option) {
        No = no;
        Price = price;
        Option = option;
    }

    public static void remove(DoubleRoom d) {
    }

    public static void add(DoubleRoom d1) {
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
        return "DoubleRoom{" +
                "No='" + No + '\'' +
                ", Price=" + Price +
                ", Option='" + Option + '\'' +
                '}';
    }
}

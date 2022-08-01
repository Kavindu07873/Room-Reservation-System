package model;

public class FrenchMeal {

    private String Name;
    private Double Price;

    public FrenchMeal() {
    }

    public FrenchMeal(String name, Double price) {
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
        return "FrenchMeal{" +
                "Name='" + Name + '\'' +
                ", Price=" + Price +
                '}';
    }
}

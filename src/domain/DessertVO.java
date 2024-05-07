package src;

public class DessertVO extends DishVO implements Cloneable {
    public DessertVO(int number, String name, float price) {
        super(number, name, null, price);
    }
    public DessertVO() {
        this(0, null, 0.0f);
    }
    public String getNameOfDish() {
        return " - " + name;
    }
    public int getNumberOfDish() {
        return number;
    }
}

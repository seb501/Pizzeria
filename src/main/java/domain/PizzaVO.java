package domain;

import java.util.Arrays;

public class PizzaVO extends DishVO implements Cloneable {
  private int size;


  public int getSize() {
    return size;
  }
  public void setSize(int size) {
    if (size == 1 || size == 2) {
      this.size = size;
    }else
      this.size = 1;

  }

  public PizzaVO(int number, String name, String[] ingredients, float price, int size) {
    super(number, name, ingredients, price);
    this.setSize(size);

  }
  public PizzaVO(int number, String name, String[] ingredients, float price) {
    this(number, name, ingredients, price, 0);
  }
  public PizzaVO() {
    this(0, null, null, 0.0f, 0);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (!super.equals(obj))
      return false;
    if (getClass() != obj.getClass())
      return false;
    PizzaVO pizza = (PizzaVO) obj;

    if(size != pizza.getSize())
      return false;

    return true;
  }



  @Override
  public String toString() {
    return "PizzaVO: Name=" + getNameOfDish() + ", Ingredients=" + Arrays.toString(ingredients) + ", Price=" + price +", Size=" + size +", Number=" + getNumberOfDish();
  }


  public String getNameOfDish() {
    String groesse;
    if (size == 1) {
      groesse = "Normal";
    }if (size == 2){
        groesse = "Mittel";

    }else
      groesse = "Groß";

    return " - Pizza " + name + " - " + groesse;
  }
  public int getNumberOfDish() {
    return number*10 + size;
  }


}


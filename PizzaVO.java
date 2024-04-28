
import java.util.Arrays;
public class PizzaVO extends DishVO implements Cloneable {
  private int size;

  public int getSize() {
    return size;
  }
  public void setSize(int size) {
    if (size == 1 || size == 2 || size == 3) {
      this.size = size;
    }else
      this.size = 1;

  }

  public PizzaVO(String name, String[] ingredients, float price, int size) {
    super(name, ingredients, price);
    this.setSize(size);

  }
  public PizzaVO ( String name, String[] ingredients, float price) {
    this(name, ingredients, price, 0);
  }
  public PizzaVO() {
    this(null, null, 0.0f, 0);
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

//  @Override
//  public int hashCode() {
//    final int prime = 31;
//    int result = super.hashCode();
//    result = prime * result + size;
//    return result;
//  }

  @Override
  public String toString() {
    return "PizzaVO: Name=" + getNameOfDish() + ", Ingredients=" + Arrays.toString(ingredients) + ", Price=" + price +", Size=" + size;
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


}


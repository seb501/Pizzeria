package domain;

public class PastaVO extends DishVO implements Cloneable {
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

  public PastaVO(int number, String name, String[] ingredients, float price) {
    super(number, name, ingredients, price);
    this.setSize(size);
  }

  public PastaVO() {this(0, null, null, 0.0f);}

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (!super.equals(obj))
      return false;
    if (getClass() != obj.getClass())
      return false;
    PastaVO other = (PastaVO) obj;
    return true;
  }

  public String getNameOfDish() {
    String groesse;
    if (size == 1) {
      groesse = "Normal";
    }if (size == 2){
      groesse = "Mittel";

    }else
      groesse = "Groß";

    return " - Pasta " + name + " - " + groesse;
  }

  public int getNumberOfDish() {
    return size * 100 +  number;
  }

}

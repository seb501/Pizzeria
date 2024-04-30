import java.util.Arrays;
public abstract class DishVO implements Comparable<DishVO>, Cloneable {

  protected String name;
  protected String [] ingredients;
  protected float price;


  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public float getPrice() {
    return price;
  }
  public void setPrice(float price) {
    if (price>= 0.0f) {
      this.price = price;
    }else
      this.price = 0.0f;
  }

  public String[] getIngredients() {
    return ingredients;
  }
  public void setIngredients(String[] ingredients) {
    this.ingredients = ingredients;
  }
  public DishVO(String name, String [] ingredients, float price) {
    this.setIngredients(ingredients);
    this.setName(name);
    this.setPrice(price);
  }
  public DishVO(String name, float price) {
    this(name, null, price);
  }
  public DishVO() {
    this(null, null, 0.0f);
  }

  public abstract String getNameOfDish();

  @Override
  public boolean equals(Object obj) {
    DishVO dish;

    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if(this.getClass() != obj.getClass())
      return false;

    dish = (DishVO) obj;


    if(price != dish.getPrice())
      return false;

    if(!(Arrays.equals(ingredients,dish.getIngredients())))
      return false;

    if(name == null) {
      if(dish.getName() != null) {
        return false;
      }
    }
    else {
      if(! name.equals(dish.getName())) {
        return false;
      }
    }
    return true;
  }
  
  @Override
  public String toString() {
    return "DishVO: Name=" + getNameOfDish() + ", Ingredients=" + ingredientsToString() + ", Price=" + price;
  }

  public String ingredientsToString() {
    String result = "";
    if (ingredients == null) {
      return result;
    }else {
      for (int i = 0; i<ingredients.length -1; i++) {
        for (String element : ingredients) {
          result = result + element + ", " ;
        }
      }
      result = result + ingredients[ingredients.length -1];
      return result;
    }

  }

  @Override
  public int compareTo(DishVO d){
    return getNameOfDish().compareTo(d.getNameOfDish());
  }

  @Override
  public Object clone() {
    DishVO dish = null;
    try {
      dish = (DishVO) super.clone();
    } catch (CloneNotSupportedException e) {
      // Should not happen because of Cloneable     
      throw new InternalError();
    }
    return dish;
  }

}

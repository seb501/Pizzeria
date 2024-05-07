package src;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
public class MenuVO {
  private List<DishVO> dishes;
  private static final int NUMBER_OF_DISHES = 18;

  public MenuVO() {
    initMenu();
  }

  /**
   * Method to initialize the menu and create all objects of dishes.
   *
   */

    private void initMenu() {
      this.dishes = new ArrayList<DishVO>();
      dishes.add(new PizzaVO(30, "Popeye", new String[] { "Schinken","Spinat", "Champignon", "Ei" }, 7.00f, 1));
      dishes.add(new PizzaVO(30, "Popeye", new String[] { "Schinken","Spinat", "Champignon", "Ei" }, 8.90f, 2));
      dishes.add(new PizzaVO(31, "Hawaii", new String[] { "Schinken","Ananas", "Curry" }, 5.80f, 1));
      dishes.add(new PizzaVO(31, "Hawaii", new String[] { "Schinken","Ananas", "Curry" }, 7.40f, 2));
      dishes.add(new PizzaVO(32, "Prima", new String[] { "Schinken","Salami", "Zwiebeln", "Ei" }, 7.00f, 1));
      dishes.add(new PizzaVO(32, "Prima", new String[] { "Schinken","Salami", "Zwiebeln", "Ei" }, 8.90f, 2));

      dishes.add(new PastaVO(11, "Napoli", new String[] { "Tomatensauce" },5.60f));
      dishes.add(new PastaVO(11, "Napoli", new String[] { "Tomatensauce" },5.60f));
      dishes.add(new PastaVO(11, "Napoli", new String[] { "Tomatensauce" },5.60f));
      dishes.add(new PastaVO(12, "Bolognese", new String[] { "Hackfleischsauce" }, 6.40f));
      dishes.add(new PastaVO(12, "Bolognese", new String[] { "Hackfleischsauce" }, 6.40f));
      dishes.add(new PastaVO(12, "Bolognese", new String[] { "Hackfleischsauce" }, 6.40f));
      dishes.add(new PastaVO(13, "alla Panna", new String[] { "Schinken","Sahne" }, 6.40f));
      dishes.add(new PastaVO(13, "alla Panna", new String[] { "Schinken","Sahne" }, 6.40f));
      dishes.add(new PastaVO(13, "alla Panna", new String[] { "Schinken" ,"Sahne" }, 6.40f));

      dishes.add(new DessertVO(21, "Hausgemachter Obstsalat", 2.30f));
      dishes.add(new DessertVO(22, "Hausgemachte Pannacotta", 2.60f));
      dishes.add(new DessertVO(23, "Hausgemachtes Tiramisu", 2.80f));

    }
/*
  private void initMenu() {
    this.dishes = new ArrayList<>();
    // Hier würden die Gerichte hinzugefügt werden, basierend auf Ihren Daten.
    // Beispiel:
    // dishes.add(new Pizza("Margherita", ingredients, price));
    // dishes.add(new Pasta("Spaghetti Carbonara", ingredients, price));
    // dishes.add(new Dessert("Tiramisu", ingredients, price));
  }

  public void addDish(MenuItem dish) {
    dishes.add(dish);
  }

  public void removeDish(MenuItem dish) {
    dishes.remove(dish);
  }

  public String toString() {
    DecimalFormat dFormat = new DecimalFormat(".00");
    StringBuilder sb = new StringBuilder();
    sb.append("MENU PIZZA PRONTO\n\n");

    for (MenuItem dish : dishes) {
      sb.append(dish.getDescription());
      sb.append("\n\tPrice:\t\t\t" + dFormat.format(dish.getPrice()) + " Euro\n");
    }

    return sb.toString();
  }*/


}

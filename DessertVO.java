public class DessertVO extends DishVO {
    private String name;
    private float price;

    public DessertVO(String name, float price) {
       // this.name = name;
       // this.price = price;
        super(name, price);
    }

    public DessertVO() {
        this( null, 0.00f);
    }

    @Override
    public String getNameOfDish() {
        return this.name;
    }

    public  void setName(String name){
        this.name = name;
    }

    public void setPrice(float price){
        this.price = price;
    }

}

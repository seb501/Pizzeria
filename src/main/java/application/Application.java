package application;

public class Application {
    public static void main(String[] args) {
        // Create an instance of the view class
        PizzeriaView view = new PizzeriaView();
        PizzeriaController controller = new PizzeriaController(view);
    }
}


import static org.junit.jupiter.api.Assertions.*;



import application.PizzeriaController;
import application.PizzeriaView;
import org.junit.jupiter.api.Test;

public class PizzeriaControllerTest {

    @Test
    public void testOrderButtonClicked() {
        // Create a mock PizzeriaView
        PizzeriaView view = new PizzeriaView();

        // Create an instance of the controller class
        PizzeriaController controller = new PizzeriaController(view);

        // Simulate clicking the order button
        view.getOrderField().setText("Test order"); // Set text in order field
        view.getOrderButton().doClick(); // Simulate button click

        // Verify that the orderArea text has been updated correctly
        assertEquals("New Order: Test order", view.getOrderArea().getText().trim());
    }
}

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PizzeriaController {
    private PizzeriaView view;

    public PizzeriaController(PizzeriaView view) {
        this.view = view;

        // Attach action listener to the orderButton
        view.getOrderButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Retrieve text from orderArea and append it to the orderArea
                String newText = view.getOrderArea().getText() + "\n" + view.getOrderField().getText();
                view.getOrderArea().setText(newText);
                // Clear the text field after placing the order
                view.getOrderField().setText("");
            }
        });
    }
}

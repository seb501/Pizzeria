package src;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BestellungController {
  private BestellungView view;

  public BestellungController(BestellungView view) {
    this.view = view;

    // Attach action listener to the orderButton
    view.getBestellenButton().addActionListener(new ActionListener() {
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

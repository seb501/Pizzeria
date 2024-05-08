package domain;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PizzeriaController {
    private PizzeriaView view;

    public PizzeriaController(PizzeriaView view) {
        this.view = view;

        // Attach action listener to the orderButton
//        view.getOrderButton().addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                // Retrieve text from orderArea and append it to the orderArea
//                String newText = view.getOrderArea().getText() + "\n" + view.getOrderField().getText();
//                view.getOrderArea().setText(newText);
//                // Clear the text field after placing the order
//                view.getOrderField().setText("");
//            }
//        });
        view.getMenuButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Hier wird ein neuer View geöffnet
                MenuView newView = new MenuView();
                MenuController controller = new MenuController(newView);
                //newView.setVisible(true);
            }
        });
        view.getKundenButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Hier wird ein neuer View geöffnet
                KundenView newView = new KundenView();
                KundenController controller = new KundenController(newView);
                //newView.setVisible(true);
            }
        });
        view.getBestellungButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Hier wird ein neuer View geöffnet
                BestellungView newView = new BestellungView();
                BestellungController controller = new BestellungController(newView);
                //newView.setVisible(true);
            }
        });
        view.getMitarbeiterButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Hier wird ein neuer View geöffnet
                MitarbeiterView newView = new MitarbeiterView();
                MitarbeiterController controller = new MitarbeiterController(newView);
                //newView.setVisible(true);
            }
        });
    }
}

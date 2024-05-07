package src;

import javax.swing.*;
import java.awt.*;

public class GuiCardLayout {

    public GuiCardLayout() {
      init();
    }

    private void init() {
      //erstellt Frame, CardLayout, MainPanel und ButtonPanel
      JFrame frame = new JFrame();
      CardLayout cl = new CardLayout();
      JPanel mainPanel = new JPanel(cl);
      JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));

      //erstellt Buttons
      JButton nextButt = new JButton("wechseln");
      nextButt.addActionListener(e -> cl.next(mainPanel));
      JButton KundeButton = new JButton("Kunde");
      KundeButton.addActionListener(e -> cl.show(mainPanel, "KUNDE"));
      JButton MitarbeiterButton = new JButton("Mitarbeiter");
      MitarbeiterButton.addActionListener(e -> cl.show(mainPanel, "MITARBEITER"));
      JButton BestellungButton = new JButton("Bestellung");
      BestellungButton.addActionListener(e -> cl.show(mainPanel, "BESTELLUNG"));
      JButton MenuButton = new JButton("Menu");
      MenuButton.addActionListener(e -> cl.show(mainPanel, "MENU"));

      KundenView newKundenView = new KundenView();
      KundenController kundenController = new KundenController(newKundenView);
      BestellungView newBestellungView = new BestellungView();
      BestellungController bestellungController = new BestellungController(newBestellungView);
      MitarbeiterView newMitarbeiterView = new MitarbeiterView();
      MitarbeiterController mitarbeiterController = new MitarbeiterController(newMitarbeiterView);
      MenuView newMenuView = new MenuView();
      MenuController menuController = new MenuController(newMenuView);

      //Fügt Button und Panel hinzu
      buttonPanel.add(KundeButton);
      buttonPanel.add(nextButt);
      buttonPanel.add(BestellungButton);
      buttonPanel.add(MitarbeiterButton);
      buttonPanel.add(MenuButton);

      mainPanel.add(newMenuView, "MENU");
      mainPanel.add(newKundenView, "KUNDE");
      mainPanel.add(newBestellungView, "BESTELLUNG");
      mainPanel.add(newMitarbeiterView, "MITARBEITER");


      //Bestimmt die Frame Eigenschaften
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.add(mainPanel, BorderLayout.CENTER);
      frame.add(buttonPanel, BorderLayout.SOUTH);
      frame.setTitle("CardLayout");
      frame.pack();
      frame.setLocationRelativeTo(null);
      frame.setVisible(true);
      frame.setSize(400, 250);

    }

    public static void main(String[] args) {
      SwingUtilities.invokeLater(() -> new GuiCardLayout());
    }
  }


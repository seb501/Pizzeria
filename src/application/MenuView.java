package src;

import javax.swing.*;
import java.awt.*;

public class MenuView extends JPanel {
  private JTextArea orderArea;
  private JTextField orderField;
  private JButton gerichtHinzufuegenButton;
  // Add more components as needed

  public MenuView() {


    orderArea = new JTextArea(10,20);
    orderArea.setEditable(false);
    orderField = new JTextField(20);
    gerichtHinzufuegenButton = new JButton("Gericht hinzufuegen");

    // Initialize and add more components to the panel

    GridBagConstraints gbc = new GridBagConstraints();
    gbc.gridx = 0;
    gbc.gridy = 0;
    gbc.anchor = GridBagConstraints.LINE_START; // Align component to the start of its display area
    gbc.insets = new Insets(0, 0, 10, 0); // Add vertical gap
    add(orderArea, gbc);

    gbc.gridy = 1;
    gbc.insets = new Insets(0, 0, 10, 0);
    add(orderField, gbc);
    gbc.gridy = 2;
    gbc.insets = new Insets(0, 120, 0, 0); // Reset insets for button
    add(gerichtHinzufuegenButton, gbc);

  }

  // Add methods to handle events and update UI as needed
  public JButton getGerichtHinzufuegenButton(){
    return gerichtHinzufuegenButton;
  }
  public JTextField getOrderField(){
    return orderField;
  }
  public JTextArea getOrderArea(){
    return orderArea;
  }
}

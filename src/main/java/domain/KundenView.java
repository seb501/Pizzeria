package domain;

import javax.swing.*;
import java.awt.*;


public class KundenView extends JPanel{
//  private JFrame frame;
//  private JPanel panelGlobal, panelLeft, panelRight;
  private JTextArea orderArea;
  private JTextField orderField;
  private JButton kundeHinzufuegenButton;
  // Add more components as needed

  public KundenView() {
    // Initialize Swing components
//    frame = new JFrame("Pizzeria App");
//    panelGlobal = new JPanel(new GridLayout(1,2));

    orderArea = new JTextArea(10,20);
    orderArea.setEditable(false);
    orderField = new JTextField(20);
//    panelLeft = new JPanel();
//    panelRight = new JPanel(new GridBagLayout());
    kundeHinzufuegenButton = new JButton("Kunde hinzufuegen");

    // Initialize and add more components to the panel

    GridBagConstraints gbc = new GridBagConstraints();
    gbc.gridx = 0;
    gbc.gridy = 0;
    gbc.anchor = GridBagConstraints.LINE_START; // Align component to the start of its display area
    gbc.insets = new Insets(0, 0, 10, 0); // Add vertical ga
    add(orderArea, gbc);

    gbc.gridy = 1;
    gbc.insets = new Insets(0, 0, 10, 0);
    add(orderField,gbc);
//    panelRight.add(orderField, gbc);
    gbc.gridy = 2;
    gbc.insets = new Insets(0, 120, 0, 0); // Reset insets for button
    add(kundeHinzufuegenButton, gbc);

    // Add components to the panel
//    panelGlobal.add(panelLeft);
//    panelGlobal.add(panelRight);

    // Add more components to the panel as needed

    // Add panel to the frame
//    frame.getContentPane().add(panelGlobal);

    // Set frame properties
//    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//    frame.setSize(640,480);
//    frame.setResizable(false);
//    frame.setVisible(true);
  }

  // Add methods to handle events and update UI as needed
  public JButton getKundeHinzufuegenButton(){
    return kundeHinzufuegenButton;
  }
  public JTextField getOrderField(){
    return orderField;
  }
  public JTextArea getOrderArea(){
    return orderArea;
  }

}

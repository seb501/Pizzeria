package application;

import javax.swing.*;
import java.awt.*;

public class PizzeriaView {
    // Declare Swing components
    private JFrame frame;
    private JPanel panelGlobal, panelLeft, panelRight;
    private JTextArea orderArea;
    private JTextField orderField;
    //private JButton orderButton;
    private JButton menuButton;
    private JButton kundenButton;
    private JButton bestellungButton;
    private JButton mitarbeiterButton;

    // Add more components as needed

    public PizzeriaView() {
        // Initialize Swing components
        frame = new JFrame("Pizzeria App");
        panelGlobal = new JPanel(new GridLayout(1,2));
        
        orderArea = new JTextArea(10,20);
        orderArea.setEditable(false);
        orderField = new JTextField(20);
        panelLeft = new JPanel();
        panelRight = new JPanel(new GridBagLayout());
        //orderButton = new JButton("Place Order");
        menuButton = new JButton("Menu");
        kundenButton = new JButton("Kunden");
        bestellungButton = new JButton("Bestellung");
        mitarbeiterButton = new JButton("Mitarbeiter");
        
        // Initialize and add more components to the panel

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.LINE_START; // Align component to the start of its display area
        gbc.insets = new Insets(0, 0, 10, 0); // Add vertical gap
        panelRight.add(orderArea, gbc);

        gbc.gridy = 1;
        gbc.insets = new Insets(0, 0, 10, 0);
        panelRight.add(orderField, gbc);

        gbc.gridy = 2;
        gbc.insets = new Insets(0, 0, 0, 120); // Reset insets for button
        panelRight.add(menuButton, gbc);
        gbc.insets = new Insets(0, 120, 0, 0); // Reset insets for button
        panelRight.add(kundenButton, gbc);
        gbc.insets = new Insets(0, 0, 0, 120); // Reset insets for button
        panelLeft.add(bestellungButton, gbc);
        gbc.insets = new Insets(0, 120, 0, 0); // Reset insets for button
        panelLeft.add(mitarbeiterButton, gbc);
        
        // Add components to the panel
        panelGlobal.add(panelLeft);
        panelGlobal.add(panelRight);
        
        // Add more components to the panel as needed

        // Add panel to the frame
        frame.getContentPane().add(panelGlobal);

        // Set frame properties
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(640,480);
        frame.setResizable(false);
        frame.setVisible(true);
    }

    // Add methods to handle events and update UI as needed
    //public JButton getOrderButton(){
      //  return orderButton;
    //}
    public JTextField getOrderField(){
        return orderField;
    }
    public JTextArea getOrderArea(){
        return orderArea;
    }
    public JButton getMenuButton(){
        return menuButton;
    }
    public JButton getBestellungButton(){return bestellungButton;}
    public JButton getKundenButton(){
        return kundenButton;
    }
    public JButton getMitarbeiterButton(){
        return mitarbeiterButton;
    }
}

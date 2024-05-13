package application;

import javax.swing.*;
import java.awt.*;


public class KundenView extends JPanel{
//  private JFrame frame;
  private JPanel panelGlobal, panelLeft, panelRight;
  private JTextArea kundenListe;
  private JTextField vornamenFeld;
  private JTextField nachnamenFeld;
  private JTextField strasseFeld;
  private JTextField nummerFeld;
  private JLabel vornameLabel;
  private JLabel nachnameLabel;
  private JLabel strasseLabel;
  private JLabel nummerLabel;
  private JButton kundeHinzufuegenButton;
  // Add more components as needed

  public KundenView() {
    // Initialize Swing components
//    frame = new JFrame("Pizzeria App");
    panelGlobal = new JPanel(new GridLayout(1,2));

    kundenListe = new JTextArea(30, 20);
    kundenListe.setEditable(false);
    vornamenFeld = new JTextField(20);
    nachnamenFeld = new JTextField(20);
    strasseFeld = new JTextField(15);
    nummerFeld = new JTextField(5);
    vornameLabel = new JLabel("Vorname:");
    nachnameLabel = new JLabel("Nachname:");
    strasseLabel = new JLabel("Strasse:");
    nummerLabel = new JLabel("Nr.:");


    panelLeft = new JPanel(new GridBagLayout());
    panelRight = new JPanel(new GridBagLayout());
    kundeHinzufuegenButton = new JButton("Kunde hinzufuegen");

    // Initialize and add more components to the panel

    GridBagConstraints gbc = new GridBagConstraints();

    gbc.gridx = 0;
    gbc.gridy = 0;
    gbc.anchor = GridBagConstraints.LINE_START; // Align component to the start of its display area
    gbc.insets = new Insets(0, 0, 10, 0);
    panelRight.add(kundenListe, gbc);

    gbc.gridy = 0;
    gbc.insets = new Insets(0, 0, 10, 0);
    panelLeft.add(vornameLabel, gbc);

    gbc.gridy = 1;
    gbc.insets = new Insets(0, 0, 10, 0);
    panelLeft.add(vornamenFeld, gbc);

    gbc.gridy = 2;
    gbc.insets = new Insets(0, 0, 10, 0);
    panelLeft.add(nachnameLabel, gbc);

    gbc.gridy = 3;
    gbc.insets = new Insets(0, 0, 10, 0);
    panelLeft.add(nachnamenFeld, gbc);

    gbc.gridy = 4;
    gbc.insets = new Insets(0, 0, 10, 5);
    panelLeft.add(strasseLabel, gbc);

    gbc.gridy = 5;
    gbc.insets = new Insets(0, 0, 10, 5);
    panelLeft.add(strasseFeld, gbc);

    gbc.gridy = 4;
    gbc.insets = new Insets(0, 160, 10, 0);
    panelLeft.add(nummerLabel, gbc);

    gbc.gridy = 5;
    gbc.insets = new Insets(0, 160, 10, 0);
    panelLeft.add(nummerFeld, gbc);

    gbc.gridy = 6;
    gbc.insets = new Insets(0, 0, 120, 0); // Reset insets for button
    panelLeft.add(kundeHinzufuegenButton, gbc);

    //Add components to the panel
    panelGlobal.add(panelLeft);
    panelGlobal.add(panelRight);

    // Add more components to the panel as needed

    // Add panel to the frame
    add(panelGlobal);

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
  public JTextField getOrderField(){return vornamenFeld;}
  public JTextArea getOrderArea(){
    return kundenListe;
  }
  public JTextField getNachnamenFeld(){return nachnamenFeld;}
  public JTextField getStrasseFeld(){return strasseFeld;}
  public JTextField getNummerFeld(){return nummerFeld;}


}

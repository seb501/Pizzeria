package application;

import javax.swing.*;
import java.awt.*;


public class KundenView extends JPanel{

  private final JButton kundeHinzufuegenButton;
  private final JTextArea kundenListe;
  private final JTextField nachnamenFeld;
  private final JTextField vornamenFeld;
  private final JTextField strasseFeld;
  private final JTextField nummerFeld;
  private final JTextField ortFeld;
  private final JTextField telefonnummerFeld;
  private final JTextField jahrFeld;


  final JComboBox<String> dropdownTage;
  final JComboBox<String> dropdownMonate;
  final JComboBox<String> dropdownGeschlecht;
  // Add more components as needed

  public KundenView() {
    JPanel panelGlobal = new JPanel(new GridLayout(1, 2));
    JPanel panelLeft = new JPanel(new GridBagLayout());
    JPanel panelRight = new JPanel(new GridBagLayout());
    kundeHinzufuegenButton = new JButton("Kunde hinzufuegen");

    kundenListe = new JTextArea(30, 30);
    kundenListe.setEditable(false);

    //Eingabefelder
     vornamenFeld = new JTextField(20);
     nachnamenFeld = new JTextField(20);
     strasseFeld = new JTextField(15);
     nummerFeld = new JTextField(5);
     ortFeld = new JTextField(15);
     telefonnummerFeld = new JTextField(20);
     jahrFeld = new JTextField(10);

    //Label
    JLabel vornameLabel = new JLabel("Vorname:");
    JLabel nachnameLabel = new JLabel("Nachname:");
    JLabel strasseLabel = new JLabel("Strasse:");
    JLabel nummerLabel = new JLabel("Nr.:");
    JLabel ortLabel = new JLabel("Ort:");
    JLabel telefonnummerLabel = new JLabel("Tel.Nr.:");
    JLabel geburtstagLabel = new JLabel("Geburtstag:");
    JLabel geschlechtLabel = new JLabel("Geschlecht:");

    //Dropdown-menues
    String[] monate = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"};
    dropdownMonate = new JComboBox<>(monate);
    String[] tage = new String[31];
    for (int i = 0; i < 31; i++) {tage[i] = Integer.toString(i + 1);}
    dropdownTage = new JComboBox<>(tage);
    String[] geschlecht = {"männlich", "weiblich", "divers"};
    dropdownGeschlecht = new JComboBox<>(geschlecht);



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
    gbc.insets = new Insets(0, 0, 10, 0);
    panelLeft.add(ortLabel, gbc);

    gbc.gridy = 7;
    gbc.insets = new Insets(0, 0, 10, 0);
    panelLeft.add(ortFeld, gbc);

    gbc.gridy = 8;
    gbc.insets = new Insets(0, 0, 10, 0);
    panelLeft.add(telefonnummerLabel, gbc);

    gbc.gridy = 9;
    gbc.insets = new Insets(0, 0, 10, 0);
    panelLeft.add(telefonnummerFeld, gbc);

    gbc.gridy = 10;
    gbc.insets = new Insets(0, 0, 10, 0);
    panelLeft.add(geburtstagLabel, gbc);

    gbc.gridy = 11;
    gbc.insets = new Insets(0, 80, 10, 0);
    panelLeft.add(dropdownMonate, gbc);

    gbc.gridy = 11;
    gbc.insets = new Insets(0, 0, 10, 0);
    panelLeft.add(dropdownTage, gbc);

    gbc.gridy = 11;
    gbc.insets = new Insets(0, 160, 10, 0);
    panelLeft.add(jahrFeld, gbc);

    gbc.gridy = 12;
    gbc.insets = new Insets(0, 0, 10, 0);
    panelLeft.add(geschlechtLabel, gbc);

    gbc.gridy = 13;
    gbc.insets = new Insets(0, 0, 10, 0);
    panelLeft.add(dropdownGeschlecht, gbc);

    gbc.gridy = 14;
    gbc.insets = new Insets(0, 0, 120, 0);
    panelLeft.add(kundeHinzufuegenButton, gbc);

    //Add components to the panel
    panelGlobal.add(panelLeft);
    panelGlobal.add(panelRight);

    // Add panel to the frame
    add(panelGlobal);

  }

  // Add methods to handle events and update UI as needed
  public JButton getKundeHinzufuegenButton(){
    return kundeHinzufuegenButton;
  }
  public JTextArea getOrderArea(){return kundenListe;}
  public JTextField getOrderField(){return vornamenFeld;}
  public JTextField getNachnamenFeld(){return nachnamenFeld;}
  public JTextField getStrasseFeld(){return strasseFeld;}
  public JTextField getNummerFeld(){return nummerFeld;}
  public JTextField getOrtFeld() {return ortFeld;}
  public JTextField getTelefonnummerFeld() {return telefonnummerFeld;}
  public JTextField getJahrFeld() {return jahrFeld;}
  public JComboBox<String> getDropdownTage() {return dropdownTage;}
  public JComboBox<String> getDropdownMonate() {return dropdownMonate;}
  public JComboBox<String> getDropdownGeschlecht() {return dropdownGeschlecht;}




}

package Zahlenraten;

import javax.swing.*;
import java.util.Random;

public class Zahlenraten { //Klasse erstellt und Zahlenraten genannt

    public static void main(String[] args){ // Main Methode erstellt

        int min=1; //Variable 1 erstellt
        int max=10; // Variable 2 erstellt

        Random rnd = new Random(); //neue instanz aus random
        int zufallszahl = rnd.nextInt(max - min + 1) + min; // Generiert eine Zufallszahl zwischen 1 und 10 und setzt diese als variable zufallszahl

        System.out.println(zufallszahl); //Ausgabe der Zufallszahl

        if (zufallszahl % 2 == 0) // if und modulo um herauszufinden ob zahl gerade ist oder nicht
        {
            JOptionPane.showMessageDialog(null, "Die Zahl ist gerade"); // wenn zahl gerade dann diese ausgabe
        }
            else{
            JOptionPane.showMessageDialog(null, "Deine Zahl ist ungerade");// ansonsten diese
            }
    }
}

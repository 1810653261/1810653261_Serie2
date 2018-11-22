package Zahlenraten;

import javax.swing.*;
import java.util.Random;

public class Zahlenraten { //Klasse erstellt und Zahlenraten genannt

    public static void main(String[] args){ // Main Methode erstellt

        int min=1; //Variable 1 erstellt
        int max=10; // Variable 2 erstellt
        String Rückgabe=JOptionPane.showInputDialog("Es soll vom Benutzer eine Ganzzahl eingegeben werden,die zwischen den zuvor definierten min und max Werten liegt.");
        int Rückgabe1=Integer.parseInt(Rückgabe);

        Random rnd = new Random(); //neue instanz aus random
        int zufallszahl = rnd.nextInt(max - min + 1) + min; // Generiert eine Zufallszahl zwischen 1 und 10 und setzt diese als variable zufallszahl

        if (Rückgabe1 == zufallszahl) // Sie schlägt fehl da die variable Rückgabe den Datentyp String besitzt
        {
            JOptionPane.showMessageDialog(null, "Die Zahl ist richtig");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "deine antwort ist falsch");
        }


            if (zufallszahl - Rückgabe1 <2 && zufallszahl - Rückgabe1 >-2)
            {
                JOptionPane.showMessageDialog(null, "War Knapp, probiers gleich nochmal");
            }




       /* if (zufallszahl % 2 == 0) // if und modulo um herauszufinden ob zahl gerade ist oder nicht
        {
            JOptionPane.showMessageDialog(null, "Die Zahl ist gerade"); // wenn zahl gerade dann diese ausgabe
        }
            else{
            JOptionPane.showMessageDialog(null, "Deine Zahl ist ungerade");// ansonsten diese
            }*/
    }
}


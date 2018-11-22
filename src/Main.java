import javax.swing.*;

public class Main {

    public static void main(String[] args) { //main Methode

        String name = JOptionPane.showInputDialog("name"); //String name um namensabfrage zu machen

        int zahl = Integer.parseInt(JOptionPane.showInputDialog("Gib dein alter an")); // alters abfrage um danach volljährigkeit zu bestimmen
        if (zahl < 18) {
            JOptionPane.showMessageDialog(null, "du bist nicht volljährig"); // Ausgabe wenn man nicht volljährig ist
        }


    }
}
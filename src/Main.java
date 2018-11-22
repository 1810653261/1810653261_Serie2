import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        String name = JOptionPane.showInputDialog("name");

        int zahl = Integer.parseInt(JOptionPane.showInputDialog("Gib dein alter an"));
        if (zahl < 18) {
            JOptionPane.showMessageDialog(null, "du bist nicht volljährig");
        }


    }
}
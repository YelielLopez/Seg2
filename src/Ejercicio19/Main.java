package Ejercicio19;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Welcome to AutoCrash");

        int selection = Integer.parseInt(JOptionPane.showInputDialog(null, "Please write your car model"));

        EnterpriseAuto model = new EnterpriseAuto();

        switch (selection) {
            case 119:
                model.setModel119(selection);
                JOptionPane.showMessageDialog(null, "Model " + model.getModel119() + " is defective, carry guarantee");
                break;
            case 179:
                model.setModel179(selection);
                JOptionPane.showMessageDialog(null, "Model " + model.getModel179() + " is defective, carry guarantee");
                break;
            case 189:
                model.setModel189(selection);
                JOptionPane.showMessageDialog(null, "Model " + model.getModel189() + " is defective, carry guarantee");
                break;
            case 195:
                model.setModel195(selection);
                JOptionPane.showMessageDialog(null, "Model " + model.getModel195() + " is defective, carry guarantee");
                break;
            case 221:
                model.setModel221(selection);
                JOptionPane.showMessageDialog(null, "Model " + model.getModel221() + " is defective, carry guarantee");
                break;
            case 780:
                model.setModel780(selection);
                JOptionPane.showMessageDialog(null, "Model " + model.getModel780() + " is defective, carry guarantee");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Model " + selection + " is not defective, enjoy your car");
                break;
        }
    }
}

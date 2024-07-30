package Ejercicio18;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Computadora computer = new Computadora();

        JOptionPane.showMessageDialog(null, "Good Morning! Welcome to your Apple Assistance Program");

        int response = Integer.parseInt(JOptionPane.showInputDialog(null, "Does your computer beep at startup?\n 1. Yes\n 2. No"));

        if (response == 1) {
            computer.setStatus(true);
            int response4 = Integer.parseInt(JOptionPane.showInputDialog(null, "Does the unit spin?\n 1. Yes\n 2. No"));

            if (response4 == 1) {
                JOptionPane.showMessageDialog(null, "Please contact technical support");
            } else {
                computer.setStatus(false);
                JOptionPane.showMessageDialog(null, "Check the unit's contacts");
            }

            int response2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Does the hard drive spin?\n1. Yes\n 2. No"));

            if (response2 == 1) {
                JOptionPane.showMessageDialog(null, "It is damaged");
            } else {
                computer.setStatus(false);
                JOptionPane.showMessageDialog(null, "Please check the unit's contacts");
            }
        } else if (response == 2) {
            int response3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Does the hard drive spin?\n 1. Yes\n 2. No"));

            if (response3 == 2) {
                JOptionPane.showMessageDialog(null, "Bring the PC for repair at the central office");
            } else if (response3 == 1) {
                JOptionPane.showMessageDialog(null, "Check the speaker connections");
            } else {
                computer.setStatus(false);
                JOptionPane.showMessageDialog(null, "No error detected via the Vanguard system");
            }
        }
    }
}

package Ejercicio15;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        gym myGym = new gym();

        JOptionPane.showMessageDialog(null, "Good morning! Welcome to Gymnasium El Despenque.");
        String input = JOptionPane.showInputDialog(null,
                "Please enter the subscription you want to pay for:\n\n1. 15 Days $18000\n2. 30 Days $35000\n3. 3 Months $86000\n4. 6 Months $211000\n5. 1 Year $400000");
        int subscriptionChoice = Integer.parseInt(input);

        switch (subscriptionChoice) {
            case 1:
                myGym.setMonthlyFee(18000);
                JOptionPane.showMessageDialog(null, "Welcome to Gymnasium El Despenque! You have subscribed for 15 days at a cost of $18,000.");
                break;
            case 2:
                myGym.setMonthlyFee(35000);
                JOptionPane.showMessageDialog(null, "Welcome to Gymnasium El Despenque! You have subscribed for 30 days at a cost of $35,000.");
                break;
            case 3:
                myGym.setMonthlyFee(86000);
                JOptionPane.showMessageDialog(null, "Welcome to Gymnasium El Despenque! You have subscribed for 3 months at a cost of $86,000.");
                break;
            case 4:
                myGym.setMonthlyFee(211000);
                JOptionPane.showMessageDialog(null, "Welcome to Gymnasium El Despenque! You have subscribed for 6 months at a cost of $211,000.");
                break;
            case 5:
                myGym.setMonthlyFee(400000);
                JOptionPane.showMessageDialog(null, "Welcome to Gymnasium El Despenque! You have subscribed for 1 year at a cost of $400,000.");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Invalid option.");
                break;
        }

        int monthlyFee = myGym.getMonthlyFee();
        JOptionPane.showMessageDialog(null, "Monthly fee: $" + monthlyFee);
    }
}

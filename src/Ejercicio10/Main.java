package Ejercicio10;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        WashingMachinesEnterprise washingMachine = new WashingMachinesEnterprise();
        WashingMachinesEnterprise wash = new WashingMachinesEnterprise(12, 6);
        washingMachine.setLargeWasherCost(4000);
        washingMachine.setSmallWasherCost(3000);

        int quantity = Integer.parseInt(JOptionPane.showInputDialog(null, "Good morning! Please enter the number of washing machines needed:"));
        int selection = Integer.parseInt(JOptionPane.showInputDialog(null, "Please choose the washer size:\n\n1. Large Washer: $4000 per hour\n2. Small Washer: $3000 per hour"));

        boolean isLarge = (selection == 1);
        washingMachine.printCostDetails(quantity, isLarge);
        System.out.println(wash);
    }
}

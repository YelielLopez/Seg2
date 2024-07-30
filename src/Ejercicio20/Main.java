package Ejercicio20;

import javax.swing.*;
public class Main {
    public static void main(String[] args) {
        String operator = JOptionPane.showInputDialog(null, "Please enter your operator: Claro, Tigo or Movistar");
        CeluMovil celuMovil = new CeluMovil(operator);
        if (celuMovil.getFixedCharge() == 0) {
            JOptionPane.showMessageDialog(null, "Invalid operator entered. Please restart the application.");
            return;
        }
        String inputMinutes = JOptionPane.showInputDialog(null, "Please enter the number of international minutes:");
        int internationalMinutes = Integer.parseInt(inputMinutes);
        int includeDataPackage = JOptionPane.showConfirmDialog(null, "Do you want to include a data package?", "Data Package", JOptionPane.YES_NO_OPTION);
        int totalCost = celuMovil.calculateTotalCost(internationalMinutes, includeDataPackage == JOptionPane.YES_OPTION);
        StringBuilder message = new StringBuilder();
        message.append("Operator: ").append(celuMovil.getOperator()).append("\n");
        message.append("Fixed charge: $").append(celuMovil.getFixedCharge()).append("\n");
        message.append("International call rate: $").append(celuMovil.getInternationalCallRate()).append(" per minute\n");
        message.append("Data package rate: $").append(celuMovil.getDataPackageRate()).append("\n");
        message.append("Total cost: $").append(totalCost).append("\n");
        JOptionPane.showMessageDialog(null, message.toString());
    }
}

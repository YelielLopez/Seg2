package Ejercicio10;
import javax.swing.*;
public class WashingMachinesEnterprise {
    private int largeWasherCost;
    private int smallWasherCost;
    private double discount = 0.03;

    public int getLargeWasherCost() {
        return largeWasherCost;
    }

    public void setLargeWasherCost(int largeWasherCost) {
        this.largeWasherCost = largeWasherCost;
    }

    public int getSmallWasherCost() {
        return smallWasherCost;
    }

    public void setSmallWasherCost(int smallWasherCost) {
        this.smallWasherCost = smallWasherCost;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double calculateTotalCost(int quantity, boolean isLarge) {
        int cost = isLarge ? largeWasherCost * quantity : smallWasherCost * quantity;
        if (quantity >= 3) {
            cost -= cost * discount;
        }
        return cost;
    }

    public void printCostDetails(int quantity, boolean isLarge) {
        double totalCost = calculateTotalCost(quantity, isLarge);
        String formattedValue = String.format("%.0f", totalCost);
        String message = "You must pay $" + formattedValue + " for the service.";
        JOptionPane.showMessageDialog(null, message);
    }
}

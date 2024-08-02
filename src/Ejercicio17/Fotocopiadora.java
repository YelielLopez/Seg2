package Ejercicio17;

import javax.swing.JOptionPane;

public class Fotocopiadora {
    public static void main(String[] args) {
        PriceCalculator calculator = new PriceCalculator();

        PriceCalculator calculator2 = new PriceCalculator(6);
        JOptionPane.showMessageDialog(null, "Good Morning and Welcome to Malacopia");

        int quantity = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of copies you want to print"));


        calculator.setQuantity(quantity);

        int price = calculator.calculatePrice();
        String message = (price != -1) ? "You must pay $" + (price / quantity) + " per copy, Total to Pay " + price : "Cannot print that amount of copies: " + quantity;
        JOptionPane.showMessageDialog(null, message);

        System.out.println(calculator2);
    }
}

package Ejercicio21;

import javax.swing.*;

public class Main {
        public static void main(String[] args) {
                JOptionPane.showMessageDialog(null, "Welcome to Sandwichera el Reflujo");
                String input = JOptionPane.showInputDialog(null, "Please choose the size of your sandwich:\n1. Large Sandwich (12000)\n2. Small Sandwich (6000)");
                int selection = Integer.parseInt(input);
                SandwichOrder order = new SandwichOrder();
                order.setSize(selection);
                String inputJalapenos = JOptionPane.showInputDialog(null, "Would you like to add jalapeños to your sandwich?\n1. Yes\n2. No");
                order.setJalapenos(Integer.parseInt(inputJalapenos) == 1);
                String inputBacon = JOptionPane.showInputDialog(null, "Would you like to add bacon to your sandwich?\n1. Yes\n2. No");
                order.setBacon(Integer.parseInt(inputBacon) == 1);
                String inputTurkey = JOptionPane.showInputDialog(null, "Would you like to add turkey to your sandwich?\n1. Yes\n2. No");
                order.setTurkey(Integer.parseInt(inputTurkey) == 1);
                String inputCheese = JOptionPane.showInputDialog(null, "Would you like to add cheese to your sandwich?\n1. Yes\n2. No");
                order.setCheese(Integer.parseInt(inputCheese) == 1);
                int baseCost = (selection == 1) ? 12000 : 6000;
                int ingredientCost = (order.hasJalapenos() ? 0 : 0) + (order.hasBacon() ? 3000 : 0) + (order.hasTurkey() ? 3000 : 0) + (order.hasCheese() ? 2500 : 0);
                int totalCost = baseCost + ingredientCost;
                JOptionPane.showMessageDialog(null, "Your order is on its way. Total cost: " + totalCost);
        }
}

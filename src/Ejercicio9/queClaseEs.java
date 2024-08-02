package Ejercicio9;
import javax.swing.*;
public class queClaseEs {
    private int positive;
    private int negative;

    public queClaseEs(int positive, int negative) {
        this.positive = positive;
        this.negative = negative;
    }

    public queClaseEs() {
    }

    public int getPositive() {
        return positive;
    }

    public void setPositive(int positive) {
        this.positive = positive;
    }

    public int getNegative() {
        return negative;
    }

    public void setNegative(int negative) {
        this.negative = negative;
    }

    public void checkNumber() {
        if (positive >= 0) {
            JOptionPane.showMessageDialog(null, "The number " + positive + " is a positive number");
        } else {
            JOptionPane.showMessageDialog(null, "The number " + positive + " is a negative number");
        }
    }
}

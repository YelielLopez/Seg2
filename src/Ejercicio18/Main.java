package Ejercicio18;

import javax.swing.*;

public class Main {
    public class ComputerStatusApp {
        public static void main(String[] args) {

            int beepResponse = JOptionPane.showConfirmDialog(null, "¿La computadora emite un pitido al iniciarse?", "Entrada", JOptionPane.YES_NO_OPTION);
            boolean beep = (beepResponse == JOptionPane.YES_OPTION);

            int hardDriveResponse = JOptionPane.showConfirmDialog(null, "¿El disco duro gira?", "Entrada", JOptionPane.YES_NO_OPTION);
            boolean hardDriveSpin = (hardDriveResponse == JOptionPane.YES_OPTION);


            Computer computer = new Computer(beep, hardDriveSpin);


            JOptionPane.showMessageDialog(null, computer.getStatus());
        }
    }
}
package Ratings;

import javax.swing.*;

public class MainRating {
        public static void main(String[] args) {
            Rating rating = new Rating();


            rating.setFisics(Double.parseDouble(JOptionPane.showInputDialog("Ingrese la calificación de Física:")));
            rating.setQuimic(Double.parseDouble(JOptionPane.showInputDialog("Ingrese la calificación de Química:")));
            rating.setBiology(Double.parseDouble(JOptionPane.showInputDialog("Ingrese la calificación de Biología:")));
            rating.setMath(Double.parseDouble(JOptionPane.showInputDialog("Ingrese la calificación de Matemáticas:")));
            rating.setInformatic(Double.parseDouble(JOptionPane.showInputDialog("Ingrese la calificación de Informática:")));


            double average = rating.calcEverage();


            String ratings = rating.getRating(average);


            JOptionPane.showMessageDialog(null, "Promedio: " + average + "\nCalificación: " + ratings);
        }
}



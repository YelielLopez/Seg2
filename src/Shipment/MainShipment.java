package Shipment;

import javax.swing.*;

public class MainShipment {

    public static void main(String[] args) {
        Shipment shipment = new Shipment();

        shipment.trackingNumber = Integer.parseInt(JOptionPane.showInputDialog("Enter the tracking number:"));
        shipment.clientID = JOptionPane.showInputDialog("Enter the client's ID:");
        shipment.setDate(JOptionPane.showInputDialog("Enter the date:"));
        shipment.setPackagingType(JOptionPane.showInputDialog("Enter the type of packaging:"));
        shipment.setWeight(Double.parseDouble(JOptionPane.showInputDialog("Enter the weight:")));
        shipment.setOriginCity(JOptionPane.showInputDialog("Enter the origin city:"));
        shipment.setDestinationCity(JOptionPane.showInputDialog("Enter the destination city:"));
        shipment.setCost(Double.parseDouble(JOptionPane.showInputDialog("Enter the cost:")));
        shipment.setShipmentStatus(JOptionPane.showInputDialog("Enter the shipment status:"));


        double costPerKilo = shipment.calculateCostPerKilo();


        String results = "Tracking Number: " + shipment.trackingNumber + "\n" +
                "Client ID: " + shipment.clientID + "\n" +
                "Date: " + shipment.getDate() + "\n" +
                "Type of Packaging: " + shipment.getPackagingType() + "\n" +
                "Weight: " + shipment.getWeight() + "\n" +
                "Origin City: " + shipment.getOriginCity() + "\n" +
                "Destination City: " + shipment.getDestinationCity() + "\n" +
                "Cost: " + shipment.getCost() + "\n" +
                "Shipment Status: " + shipment.getShipmentStatus() + "\n" +
                "Cost per Kilogram: " + costPerKilo;
        JOptionPane.showMessageDialog(null, results);

        // Verify the delivery status
        shipment.verifyDelivery();
    }
}

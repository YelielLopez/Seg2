package Shipment;

import javax.swing.*;

    public class Shipment {

        public int trackingNumber;
        public String clientID;

        private String date;
        private String packagingType;
        private double weight;
        private String originCity;
        private String destinationCity;
        private double cost;
        private String shipmentStatus;


        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }


        public String getPackagingType() {
            return packagingType;
        }

        public void setPackagingType(String packagingType) {
            this.packagingType = packagingType;
        }


        public double getWeight() {
            return weight;
        }

        public void setWeight(double weight) {
            this.weight = weight;
        }


        public String getOriginCity() {
            return originCity;
        }

        public void setOriginCity(String originCity) {
            this.originCity = originCity;
        }


        public String getDestinationCity() {
            return destinationCity;
        }

        public void setDestinationCity(String destinationCity) {
            this.destinationCity = destinationCity;
        }


        public double getCost() {
            return cost;
        }

        public void setCost(double cost) {
            this.cost = cost;
        }


        public String getShipmentStatus() {
            return shipmentStatus;
        }

        public void setShipmentStatus(String shipmentStatus) {
            this.shipmentStatus = shipmentStatus;
        }


        public double calculateCostPerKilo() {
            return cost / weight;
        }


        public void verifyDelivery() {
            if (shipmentStatus.equalsIgnoreCase("delivered")) {
                JOptionPane.showMessageDialog(null, "The shipment has been delivered.");
            } else {
                JOptionPane.showMessageDialog(null, "The shipment is still in transit.");
            }
        }
}

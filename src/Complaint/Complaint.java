package Complaint;

import javax.swing.*;
    public class Complaint {
        public int complaintNumber;
        public String complaintDescription;

        private String personName;
        private String subject;
        private String complaintStatus;



        public Complaint(int complaintNumber, String complaintDescription, String personName, String subject, String complaintStatus) {
            this.complaintNumber = complaintNumber;
            this.complaintDescription = complaintDescription;
            this.personName = personName;
            this.subject = subject;
            this.complaintStatus = complaintStatus;
        }

        public Complaint() {
        }

        public String getPersonName() {
            return personName;
        }

        public void setPersonName(String personName) {
            this.personName = personName;
        }


        public String getSubject() {
            return subject;
        }

        public void setSubject(String subject) {
            this.subject = subject;
        }

        public String getComplaintStatus() {
            return complaintStatus;
        }

        public void setComplaintStatus(String complaintStatus) {
            this.complaintStatus = complaintStatus;
        }

        public void validateComplaintStatus() {
            if (complaintStatus.equalsIgnoreCase("resolved")) {
                JOptionPane.showMessageDialog(null, "The complaint has been resolved.");
            } else {
                JOptionPane.showMessageDialog(null, "The complaint is still pending.");
            }
        }

        public void complaintReceiptMessage() {
            String message = "Complaint Number: " + complaintNumber + "\n" +
                    "Complaint Description: " + complaintDescription + "\n" +
                    "Person Name: " + personName + "\n" +
                    "Subject: " + subject + "\n" +
                    "Complaint Status: " + complaintStatus;
            JOptionPane.showMessageDialog(null, message);
        }
    }

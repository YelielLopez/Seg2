package Complaint;

import javax.swing.*;

public class MainComplaint {
    public static void main(String[] args) {
        Complaint complaint = new Complaint();

        complaint.complaintNumber = Integer.parseInt(JOptionPane.showInputDialog("Enter the complaint number:"));
        complaint.complaintDescription = JOptionPane.showInputDialog("Enter the complaint description:");
        complaint.setPersonName(JOptionPane.showInputDialog("Enter the person's name:"));
        complaint.setSubject(JOptionPane.showInputDialog("Enter the subject of the complaint:"));
        complaint.setComplaintStatus(JOptionPane.showInputDialog("Enter the status of the complaint:"));

        complaint.validateComplaintStatus();

        complaint.complaintReceiptMessage();
    }
}

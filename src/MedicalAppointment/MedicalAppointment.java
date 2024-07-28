package MedicalAppointment;

import javax.swing.*;

    public class MedicalAppointment {

        public String appointmentCode;
        public String date;
        public String time;
        public String office;
        public String doctorName;
        public String patientName;
        private String medicalCenter;


        public void createAppointment() {
            appointmentCode = JOptionPane.showInputDialog("Enter the appointment code:");
            date = JOptionPane.showInputDialog("Enter the appointment date:");
            time = JOptionPane.showInputDialog("Enter the appointment time:");
            office = JOptionPane.showInputDialog("Enter the appointment office:");
            doctorName = JOptionPane.showInputDialog("Enter the doctor's name:");
            patientName = JOptionPane.showInputDialog("Enter the patient's name:");
            setMedicalCenter(JOptionPane.showInputDialog("Enter the medical center name:"));
        }


        public void consultAppointmentDetails() {
            String appointmentDetails = "Appointment Code: " + appointmentCode + "\n" +
                    "Date: " + date + "\n" +
                    "Time: " + time + "\n" +
                    "Office: " + office + "\n" +
                    "Doctor's Name: " + doctorName + "\n" +
                    "Patient's Name: " + patientName + "\n" +
                    "Medical Center: " + getMedicalCenter();
            JOptionPane.showMessageDialog(null, appointmentDetails);
        }


        public void changeTime() {
            time = JOptionPane.showInputDialog("Enter the new appointment time:");
            JOptionPane.showMessageDialog(null, "The appointment time has been updated to: " + time);
        }


        public String getMedicalCenter() {
            return medicalCenter;
        }

        public void setMedicalCenter(String medicalCenter) {
            this.medicalCenter = medicalCenter;
        }
}

package MedicalAppointment;

public class MainMedicalAppointment {

    public static void main(String[] args) {
        MedicalAppointment appointment = new MedicalAppointment();

        appointment.createAppointment();

        appointment.consultAppointmentDetails();

        appointment.changeTime();


        appointment.consultAppointmentDetails();
    }
}


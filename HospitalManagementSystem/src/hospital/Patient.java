package hospital;

/**
 * The hospital.Patient class extends the hospital.Person class and represents a patient with additional attributes and functionality.
 * This class includes a unique identifier for the patient and the ability to manage appointment bookings.
 */
public class Patient extends Person {
    /**
     * A unique identifier associated with the patient.
     * This field is used to distinguish individual patients in the system.
     */
    public int patientID;

    /**
     * Constructs a new hospital.Patient object by extending the hospital.Person class and including a patient-specific unique identifier.
     *
     * @param personID The unique identifier for the person.
     * @param name The name of the patient.
     * @param age The age of the patient.
     * @param gender The gender of the patient.
     * @param address The address of the patient.
     * @param contactDetails The contact details of the patient.
     * @param patientID The unique identifier associated with the patient.
     */
    public Patient(int personID, String name, int age, String gender, String address, int contactDetails, int patientID) {
        super(personID, name, age, gender, address, contactDetails);
        this.patientID = patientID;
    }

    /**
     * Books an appointment for the patient. Determines if the given appointment is
     * already booked or available for booking and prints appropriate messages.
     *
     * @param appointment The Appointment object representing the appointment to be
     *                    booked. This parameter can be null, indicating that no
     *                    appointment has been scheduled.
     */
    public void bookAppointment(Appointment appointment) {
        if (appointment != null) {
            System.out.println("The appointment is already booked.");
        } else {
            System.out.println("The appointment is available for booking.");
        }
    }
}

package hospital;

/**
 * The hospital.Doctor class represents a medical professional who extends the hospital.Person class.
 * It includes additional attributes and functionalities specific to a doctor, 
 * such as a unique doctor ID and the department they work in.
 */
public class Doctor extends Person {

    /**
     * Represents a unique identifier for a doctor.
     * This ID is used to distinguish individual doctors within the system.
     */
    public int doctorID;

    /**
     * Represents the department in which the doctor is assigned.
     * This variable is used to categorize the doctor's area of specialization
     * and indicates the field of medicine they practice.
     */
    public String department;

    /**
     * Constructs a new Doctor instance by extending the Person class and adding doctor-specific attributes.
     *
     * @param personID The unique identifier for the person.
     * @param name The name of the doctor.
     * @param age The age of the doctor.
     * @param gender The gender of the doctor.
     * @param address The address of the doctor.
     * @param contactDetails The contact details of the doctor.
     * @param doctorID The unique identifier associated with the doctor.
     * @param department The department in which the doctor is assigned.
     */
    public Doctor(int personID, String name, int age, String gender, String address, int contactDetails, int doctorID, String department){
        super(personID, name, age, gender, address, contactDetails);
        this.doctorID = doctorID;
        this.department = department;
    }

    /**
     * Displays the details of a patient based on their unique identifier.
     *
     * @param patientID The unique identifier of the patient whose details are to be retrieved and displayed.
     */
    public void seePatientDetails(int patientID) {
        String patientDetails = "hospital.Patient ID: " + patientID + "\n"
                + "Name: John Doe\n"
                + "Age: 30\n"
                + "Gender: Male\n"
                + "Condition: Flu\n"
                + "hospital.Treatment Plan: Rest and hydration";

        System.out.println("hospital.Patient Details:\n" + patientDetails);
    }

    /**
     * Prescribes treatment for a patient based on their unique identifier and a specified message.
     *
     * @param patientID The unique identifier of the patient for whom the treatment is prescribed.
     * @param message The message that details the prescribed treatment or instructions for the patient.
     */
    public String prescribeTreatment(int patientID, String message) {
        return "ID: " + patientID + "Message: " + message;
    }
}

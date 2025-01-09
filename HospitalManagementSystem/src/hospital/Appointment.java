package hospital;
/**
 * Represents an appointment with an identifier, date, and time.
 */
public class Appointment {
    /**
     * The unique identifier for the appointment.
     */
    public int appointmentID;
    /**
     * The date of the appointment represented as an integer.
     * Typically used to store the appointment's scheduled date in a numerical format.
     */
    public int appointmentDate;
    /**
     * The time of the appointment represented as an integer.
     * Typically used to store the scheduled time of the appointment in a numerical format.
     */
    public int appointmentTime;

    /**
     * Initializes a new instance of the Appointment class with the specified ID, date, and time.
     *
     * @param appointmentID the unique identifier for the appointment
     * @param appointmentDate the date of the appointment
     * @param appointmentTime the time of the appointment
     */
    public Appointment(int appointmentID, int appointmentDate, int appointmentTime) {
        this.appointmentID = appointmentID;
        this.appointmentDate = appointmentDate;
        this.appointmentTime = appointmentTime;
    }

    /**
     * Reschedules the appointment to a new date and time.
     *
     * @param newDate the new date for the appointment
     * @param newTime the new time for the appointment
     */
    public void rescheduleAppointment(int newDate, int newTime) {
        this.appointmentDate = newDate;
        this.appointmentTime = newTime;
    }

    /**
     * Cancels the appointment by resetting the appointment date and time to default values.
     * After cancellation, the appointment's date and time will be set to 0.
     */
    public void cancelAppointment() {
        this.appointmentDate = 0;
        this.appointmentTime = 0;
    }

    /**
     * Retrieves the details of the appointment, including its ID, date, and time.
     *
     * @return a string containing the appointment's ID, date, and time, formatted as:
     *         "Appointment ID: [appointmentID]
     *          Appointment Date: [appointmentDate]
     *          Appointment Time: [appointmentTime]"
     */
    public String viewAppointmentDetails() {
        return "Appointment ID: " + appointmentID + "\nAppointment Date: " + appointmentDate + "\nAppointment Time: " + appointmentTime;
    }
}

package hospital;

/**
 * Represents a medical treatment with an identifier, type, and description.
 */
public class Treatment {
    /**
     * The unique identifier for a medical treatment.
     * This field is used to distinguish one treatment from another.
     */
    public int treatmentID;
    /**
     * Represents the type of the medical treatment.
     * This field defines the category or nature of the treatment (e.g., surgical, therapeutic).
     */
    public String type;
    /**
     * Provides additional details or information about the medical treatment.
     * This field may describe the procedure, purpose, or outcome associated with the treatment.
     */
    public String description;

    /**
     * Constructs a new hospital.Treatment instance with the specified identifier, type, and description.
     *
     * @param treatmentID the unique identifier for the medical treatment
     * @param type the type of the medical treatment (e.g., surgical, therapeutic)
     * @param description additional details or information about the medical treatment
     */
    public Treatment(int treatmentID, String type, String description) {
        this.treatmentID = treatmentID;
        this.type = type;
        this.description = description;
    }

    /**
     * Updates the description of the medical treatment.
     *
     * @param description the new description to be set for the medical treatment
     * @return the updated description of the medical treatment
     */
    public String updateDescription(String description) {
        this.description = description;
        return this.description;
    }

    /**
     * Returns a formatted string containing the treatment details, including the treatment ID, type, and description.
     *
     * @return a string representation of the treatment details
     */
    public String viewTreatementDetails() {
        return "hospital.Treatment ID: " + treatmentID + "\nType: " + type + "\nDescription: " + description;
    }
}

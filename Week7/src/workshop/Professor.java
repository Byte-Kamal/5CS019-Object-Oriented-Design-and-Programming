package workshop;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a professor, which is a subclass of the Person class.
 * A professor has additional attributes such as salary, staff number,
 * years of service, the number of classes taught, and a list of supervised students.
 */
public class Professor extends Person {
    int salary;
    protected int staffNumber;
    private int yearsOfService;
    public int numberOfClasses;
    private final List<Student> supervisedStudents; // Use List for flexibility

    /**
     * Constructs a Professor object with specified details, including name, phone number,
     * email address, residential address, salary, staff number, and the number of classes
     * taught by the professor.
     *
     * @param name The name of the professor.
     * @param phoneNumber The phone number of the professor.
     * @param emailAddress The email address of the professor.
     * @param address The residential address of the professor as an Address object.
     * @param salary The annual salary of the professor.
     * @param staffNumber The unique identification number assigned to the professor.
     * @param numberOfClasses The number of classes the professor teaches.
     */
    public Professor(String name, String phoneNumber, String emailAddress, Address address, int salary, int staffNumber,
                     int numberOfClasses) {
        super(name, phoneNumber, emailAddress, address);
        this.salary = salary;
        this.staffNumber = staffNumber;
        this.numberOfClasses = numberOfClasses;
        this.supervisedStudents = new ArrayList<>();
    }

    /**
     * Sets the number of years of service for the professor.
     *
     * @param yearsOfService The number of years the professor has been in service.
     */
    public void setYearsOfService(int yearsOfService){
        this.yearsOfService = yearsOfService;
    }

    /**
     * Retrieves the number of years the professor has been in service.
     *
     * @return the number of years of service as an integer.
     */
    public int getYearsOfService(){
        return this.yearsOfService;
    }

    /**
     * Retrieves the list of students supervised by the professor.
     *
     * @return a list of workshop.Student objects representing the students supervised by the professor.
     */
    public List<Student> getSupervisedStudents(){
        return this.supervisedStudents;
    }
}

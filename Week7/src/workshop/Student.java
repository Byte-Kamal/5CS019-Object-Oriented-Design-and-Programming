package workshop;

import java.util.Objects;

/**
 * Represents a student who extends the basic personal information functionality
 * of a Person with student-specific details. This class includes attributes
 * such as student number, average mark, and the number of seminars they have taken.
 * It also provides methods to determine eligibility for enrollment and retrieve
 * the number of seminars attended.
 */
public class Student extends Person {
    public int studentNumber;
    public int averageMark;
    private final int seminarsTaken;

    /**
     * Creates a Student object with specified details, including student number,
     * average marks, number of seminars taken, personal information, and address.
     *
     * @param studentNumber The unique identification number for the student.
     * @param averageMark The average mark obtained by the student.
     * @param seminarsTaken The total number of seminars the student has attended.
     * @param name The name of the student.
     * @param phoneNumber The phone number of the student.
     * @param emailAddress The email address of the student.
     * @param address The residential address of the student, represented as an Address object.
     */
    public Student(int studentNumber, int averageMark, int seminarsTaken, String name, String phoneNumber,
                   String emailAddress, Address address){
        super(name, phoneNumber, emailAddress, address);
        this.studentNumber = studentNumber;
        this.averageMark = averageMark;
        this.seminarsTaken = seminarsTaken;
    }

    /**
     * Determines if a student is eligible to enroll based on the specified country.
     *
     * @param country the country to be checked for eligibility.
     * @return true if the country matches the eligibility criteria, false otherwise.
     */
    public boolean isEligibleToEnroll(String country){
        return Objects.equals(country, "Nepal");
    }

    /**
     * Retrieves the number of seminars taken by the student.
     *
     * @return the number of seminars attended as an integer.
     */
    public int getSeminarsTaken(){
        return this.seminarsTaken;
    }
}

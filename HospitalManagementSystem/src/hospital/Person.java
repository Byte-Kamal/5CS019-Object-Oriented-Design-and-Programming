package hospital;

/**
 * Represents a person with attributes including their unique ID, name, age, gender,
 * address, and contact details.
 */
public class Person {
    public int personID;
    public String name;
    public int age;
    public String gender;
    public String address;
    public int contactDetails;

    /**
     * Constructs a new Person object with specified attributes.
     *
     * @param personID      The unique identifier for the person.
     * @param name          The name of the person.
     * @param age           The age of the person.
     * @param gender        The gender of the person.
     * @param address       The residential address of the person.
     * @param contactDetails The contact details of the person.
     */
    Person(int personID, String name, int age, String gender, String address, int contactDetails){
        this.personID = personID;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.contactDetails = contactDetails;
    }

    /**
     * Retrieves the personal details of a person, including their ID, name, age, gender, address,
     * and contact details as a single string.
     *
     * @return a string representation of the person's details composed of personID, name, age,
     * gender, address, and contactDetails fields concatenated with spaces in between.
     */
    public String viewPersonalDetails(){
        return personID + " " + name + " " + age + " " + gender + " " + address + " " + contactDetails;
    }

}

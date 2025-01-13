package workshop;

import java.util.Scanner;
import java.util.Objects;

/**
 * Represents a person with basic personal information, including name, phone number,
 * email address, and a residential address. This class also provides methods
 * to retrieve the address and simulate the process of purchasing a parking pass.
 */
public class Person {
    public String name;
    public String phoneNumber;
    public String emailAddress;
    private final Address address;

    /**
     * Constructs a workshop.Person object with specific details, including name, phone number,
     * email address, and residential address.
     *
     * @param name The name of the person.
     * @param phoneNumber The phone number of the person.
     * @param emailAddress The email address of the person.
     * @param address The residential address of the person as an workshop.Address object.
     */
    public Person(String name, String phoneNumber, String emailAddress, Address address){
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
        this.address = address;
    }

    /**
     * Retrieves the residential address of the person.
     *
     * @return an workshop.Address object representing the person's residential address.
     */
    public Address getAddress(){
        return this.address;
    }

    /**
     * Simulates the process of determining whether a user has a parking pass.
     * This method prompts the user to input their parking pass status, processes their response,
     * and prints a message indicating whether they have a parking pass or not.
     */
    public void purchaseParkingPass(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you have parking pass? (Y/N)");
        String parkingPass = scanner.nextLine();
        if (Objects.equals(parkingPass, "Y")){
            System.out.println("User have parking pass!");
        } else{
            System.out.println("User don't have parking pass!");
        }
    }
}

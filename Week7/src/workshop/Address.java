package workshop;

/**
 * Represents a physical address with details such as street, city, state, postal code, and country.
 * This class provides methods to construct an address, validate its fields,
 * and output the address as a formatted string.
 */
public class Address{
    public String street;
    public String city;
    public String state;
    public int postalCode;
    public String country;

    /**
     * Constructs an workshop.Address object with specified details such as street, city, state,
     * postal code, and country.
     *
     * @param street The street part of the address.
     * @param city The city part of the address.
     * @param state The state part of the address.
     * @param postalCode The postal code or ZIP code of the address.
     * @param country The country part of the address.
     */
    public Address(String street, String city, String state, int postalCode, String country){
        this.street = street;
        this.city = city;
        this.state = state;
        this.postalCode = postalCode;
        this.country = country;
    }

    /**
     * Validates whether the address fields are properly set.
     * Specifically, checks if street, city, state, and country are not null.
     *
     * @return true if all required address fields (street, city, state, and country) are not null, false otherwise.
     */
    private boolean validate(){
        return street != null && city != null && state != null && country != null;
    }

    /**
     * Returns the address details formatted as a single label string.
     *
     * @return a string representing the address in the format "Street: [street] City: [city] State: [state] Postal Code: [postalCode] Country: [country]"
     */
    public String outputAsLabel(){
        return "Street: " + this.street + "City: " + this.city + "State: " + this.state + "Postal Code: " + this.postalCode + "Country: " + this.country;
    }
}

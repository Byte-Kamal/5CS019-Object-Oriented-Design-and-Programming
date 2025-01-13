package shoppingCart;

/**
 * Represents a customer in the shopping cart system.
 * The customer can perform various operations such as registration, login,
 * viewing products, adding items to the cart, and performing checkout.
 */
public class Customer {
    public int customerId;
    public String name;
    public String email;
    private String password;

    /**
     * Constructs a Customer object with the specified details.
     *
     * @param customerId the unique identifier of the customer
     * @param name the name of the customer
     * @param email the email address of the customer
     * @param password the password for the customer's account
     */
    public Customer(int customerId, String name, String email, String password) {
        this.customerId = customerId;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    /**
     * Retrieves the password associated with the customer.
     *
     * @return the password of the customer
     */
    public String getPassword() {
        return password;
    }

    /**
     * Updates the password for the customer's account.
     *
     * @param password the new password to be set for the customer
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Registers a new customer in the shopping cart system.
     * This method typically involves saving customer information such as name,
     * email, and password to a persistent storage or database.
     * Further implementation details may include validations and notifications.
     */
    public void register() {
        
    }

    /**
     * Facilitates the login process for a customer in the shopping cart system.
     * This method allows a customer to authenticate their credentials and gain access
     * to various functionalities such as viewing products, managing the cart,
     * and performing purchases.
     *
     * Implementation may include user input validation, password verification
     * via a secure mechanism, and session management procedures.
     */
    public void login() {

    }

    /**
     * Displays a list of available products in the shopping cart system.
     * This method provides the customer with an overview of products they can browse
     * and potentially add to their shopping cart.
     *
     * Implementation may involve retrieving product details such as name, price,
     * and stock status from the storage or database and presenting them in
     * a user-friendly format.
     */
    public void viewProducts(){

    }

    /**
     * Adds a selected product to the customer's shopping cart.
     * This method allows the customer to specify a product and its quantity
     * to be included in the shopping cart.
     *
     * Implementation may involve verifying the product's availability,
     * updating cart details in the shopping cart system, and recalculating
     * the total price of items in the cart.
     */
    public void addToCart(){

    }

    /**
     * Finalizes the shopping process for the customer in the shopping cart system.
     * This method completes the order by processing the selected items in the
     * customer's cart, calculating the total cost, and confirming the purchase.
     *
     * Implementation may include verifying the cart's contents, checking product
     * availability, updating stock levels, and generating a receipt or confirmation.
     * Additional operations could involve payment processing or interacting with
     * external systems, depending on the system architecture.
     */
    public void checkout(){
        
    }
}

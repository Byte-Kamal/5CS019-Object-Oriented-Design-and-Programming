package shoppingCart;

/**
 * Represents a product in the shopping cart system.
 * A Product contains information such as its unique identifier, name, price,
 * and available stock quantity. It provides methods to retrieve details and
 * check its availability.
 */
public class Product {
    public int productId;
    public String name;
    public double price;
    public int stockQuantity;

    /**
     * Constructs a Product object with the specified details.
     *
     * @param productId the unique identifier of the product
     * @param name the name of the product
     * @param price the price of the product
     * @param stockQuantity the available stock quantity of the product
     */
    public Product(int productId, String name, double price, int stockQuantity) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }

    /**
     * Prints the details of the product to the standard output.
     * This method displays the product's unique identifier, name, price,
     * and available stock quantity in a formatted manner.
     */
    public void getDetails() {
        System.out.println("Product Id: " + productId + "\nProduct Name: " + name + "\nProduct Price: " + price + "\nProduct Stock Quantity: " + stockQuantity);
    }

    /**
     * Checks the availability of the product based on its stock quantity.
     * Prints a message indicating whether the product is available
     * or out of stock.
     *
     * This method evaluates the value of the stock quantity and decides
     * the availability status. If the stock quantity is greater than 0,
     * the product is considered available; otherwise, it is considered
     * out of stock.
     */
    public void checkAvailability(){
        if (stockQuantity > 0) {
            System.out.println("Product is available");
        } else {
            System.out.println("Product is out of stock");
        }
    }
}

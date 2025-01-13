package shoppingCart;

import java.util.HashMap;
import java.util.Map;

/**
 * Represents a shopping cart that allows customers to manage and store products
 * they intend to purchase. The ShoppingCart provides functionality such as
 * adding and removing products, calculating the total price, and viewing the
 * contents of the cart.
 */
public class ShoppingCart {
    private final Map<Product, Integer> cartItems;
    private double totalPrice;

    /**
     * Constructs a ShoppingCart instance with an initial total price.
     *
     * @param totalPrice the initial total price of the shopping cart
     */
    public ShoppingCart(double totalPrice) {
        this.cartItems = new HashMap<>();
        this.totalPrice = totalPrice;
    }

    /**
     * Adds a product and its specified quantity to the shopping cart.
     * If the product already exists in the cart, the specified quantity
     * will be added to the existing quantity.
     *
     * @param product the product to be added to the shopping cart
     * @param quantity the quantity of the product to be added
     */
    public void addProduct(Product product, int quantity) {
        cartItems.put(product, cartItems.getOrDefault(product, 0) + quantity);
    }

    /**
     * Removes the specified quantity of a product from the shopping cart.
     * If the quantity to be removed is greater than or equal to the current quantity
     * of the product in the cart, the product will be removed entirely.
     * Otherwise, the remaining quantity is updated.
     *
     * @param product the product to be removed from the shopping cart
     * @param quantity the quantity of the product to be removed
     */
    public void removeProduct(Product product, int quantity) {
        if (cartItems.containsKey(product)) {
            int currentQuantity = cartItems.get(product) - quantity;
            if (currentQuantity <= 0) {
                cartItems.remove(product);
            } else {
                cartItems.put(product, currentQuantity);
            }
        }
    }

    /**
     * Calculates the total price of all products in the shopping cart.
     * This method iterates through the entries of the cart items, multiplying the price
     * of each product by its associated quantity, and accumulates the resulting values.
     * The computed total price is then stored in the cart's total price attribute.
     */
    public void calculateTotalPrice() {
        double totalPrice = 0;
        for (Map.Entry<Product, Integer> entry : cartItems.entrySet()) {
            totalPrice += entry.getKey().price * entry.getValue();
        }
        this.totalPrice = totalPrice;
    }

    /**
     * Displays the items in the shopping cart, including the product name and its quantity.
     * Iterates through the cart items and prints each product's name and the corresponding quantity
     * to the standard output in a formatted manner.
     */
    public void viewCartItems() {
        for (Map.Entry<Product, Integer> entry : cartItems.entrySet()) {
            System.out.println("Product: " + entry.getKey().name + ", Quantity: " + entry.getValue());
        }
    }
}

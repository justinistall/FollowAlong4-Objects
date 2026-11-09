
package part17;

// This class stores pizza ingredients.
public class Pizza {

    // Store the type of bread.
    String bread;

    // Store the sauce.
    String sauce;

    // Store the cheese.
    String cheese;

    // Store the topping.
    String topping;

    // Constructor with four ingredients.
    public Pizza(String bread, String sauce, String cheese, String topping) {

        // Save the bread.
        this.bread = bread;

        // Save the sauce.
        this.sauce = sauce;

        // Save the cheese.
        this.cheese = cheese;

        // Save the topping.
        this.topping = topping;
    }

    // Constructor with three ingredients.
    public Pizza(String bread, String sauce, String cheese) {

        // Call the four-ingredient constructor.
        this(bread, sauce, cheese, null);
    }

    // Constructor with two ingredients.
    public Pizza(String bread, String sauce) {

        // Call the four-ingredient constructor.
        this(bread, sauce, null, null);
    }

    // Constructor with one ingredient.
    public Pizza(String bread) {

        // Call the four-ingredient constructor.
        this(bread, null, null, null);
    }
}

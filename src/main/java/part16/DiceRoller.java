
package part16;

// Import the Random class.
import java.util.Random;

// Create the DiceRoller class.
public class DiceRoller {

    // Store the random number generator.
    Random random;

    // Store the dice result.
    int number;

    // Create the constructor.
    public DiceRoller() {

        // Initialize the random generator.
        random = new Random();

        // Roll the dice.
        roll();
    }

    // Create a method to roll the dice.
    public void roll() {

        // Generate a random number between 1 and 6.
        number = random.nextInt(6) + 1;

        // Print the number.
        System.out.println(number);
    }
}

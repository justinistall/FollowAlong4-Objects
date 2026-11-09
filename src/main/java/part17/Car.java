
package part17;

// This class represents a car.
public class Car {

    // Store the car's make.
    String make = "Chevrolet";

    // Store the car's model.
    String model = "Corvette";

    // Store the car's year.
    int year = 2020;

    // Store the car's color.
    String color = "Blue";

    // Override the default toString method.
    @Override
    public String toString() {

        // Return the car's information as text.
        return make + "\n" + model + "\n" + year + "\n" + color;
    }
}

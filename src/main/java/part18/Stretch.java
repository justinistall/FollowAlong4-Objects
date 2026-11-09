package part18;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=13181s
//        rewatch from about 3:39:40 for arrays of objects,
//        and from about 3:46:10 for passing an object to a method
// Guide: GUIDE.md in this folder, steps 2–9
//
// SECTION C — Stretch. Do Stretch A, then Stretch B. The README says what each one should print.
// Stretch B2 also adds a method to your Garage class.
//
// There is no main method here yet. Typing it is part of the stretch.




// This class runs the stretch exercises.
public class Stretch {

    // This is where the program starts.
    public static void main(String[] args) {

        // STRETCH A - ARRAY OF OBJECTS

        // Create three food objects.
        Food food1 = new Food("Pizza");
        Food food2 = new Food("Burger");
        Food food3 = new Food("Chicken");

        // Put the foods into an array.
        Food[] foods = {food1, food2, food3};

        // Go through every food in the array.
        for (Food food : foods) {

            // Print each food's name.
            System.out.println(food.name);
        }

        // STRETCH B - PASSING OBJECTS

        // Create a garage object.
        Garage garage = new Garage();

        // Create two car objects.
        Car car1 = new Car("Honda");
        Car car2 = new Car("BMW");

        // Park the first car.
        garage.park(car1);

        // Park the second car.
        garage.park(car2);
    }
}

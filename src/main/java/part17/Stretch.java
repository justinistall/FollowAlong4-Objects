package part17;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=12528s
//        rewatch from about 3:28:50 if you forget how overloaded constructors work,
//        and from about 3:35:20 for toString
// Guide: GUIDE.md in this folder, steps 4–12
//
// SECTION C — Stretch. Do Stretch A, then Stretch B. The README says what each one should print.
// Stretch B2 and B3 also change your Pizza and Car classes.
//
// There is no main method here yet. Typing it is part of the stretch.




// This class runs the stretch exercises.
public class Stretch {

    // This is where the program starts.
    public static void main(String[] args) {

        // STRETCH A - OVERLOADED CONSTRUCTORS

        // Create a pizza with four ingredients.
        Pizza pizza1 = new Pizza("Thick crust", "Tomato", "Mozzarella", "Pepperoni");

        // Create a pizza with three ingredients.
        Pizza pizza2 = new Pizza("Thin crust", "Tomato", "Cheddar");

        // Create a pizza with two ingredients.
        Pizza pizza3 = new Pizza("Regular crust", "BBQ");

        // Create a pizza with one ingredient.
        Pizza pizza4 = new Pizza("Stuffed crust");

        // Print the ingredients of each pizza.
        System.out.println(pizza1.bread + ", " + pizza1.sauce + ", "
                + pizza1.cheese + ", " + pizza1.topping);

        // Print the second pizza.
        System.out.println(pizza2.bread + ", " + pizza2.sauce + ", "
                + pizza2.cheese);

        // Print the third pizza.
        System.out.println(pizza3.bread + ", " + pizza3.sauce);

        // Print the fourth pizza.
        System.out.println(pizza4.bread);

        // STRETCH B - TOSTRING

        // Print a pizza using its toString method.
        System.out.println(pizza1.toString());
    }
}

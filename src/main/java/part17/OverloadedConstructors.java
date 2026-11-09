package part17;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=12340s
//        starts at about 3:25:40 — stop at about 3:32:05, before "the toString method"
// Guide: GUIDE.md in this folder, steps 1–7
//
// Part 17, topic 1 — overloaded constructors
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called OverloadedConstructors.
//    Leave the "package part17;" line and the class line alone. Type everything else yourself.
//    You also make a new class called Pizza. The README shows how.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. Do this in Pizza.java too.




// This class starts the program.
public class OverloadedConstructors {

    // This is where the program begins.
    public static void main(String[] args) {

        // Create a pizza with all four ingredients.
        Pizza pizza1 = new Pizza("Thick crust", "Tomato", "Mozzarella", "Pepperoni");

        // Create a pizza with three ingredients.
        Pizza pizza2 = new Pizza("Thin crust", "Tomato", "Cheddar");

        // Create a pizza with two ingredients.
        Pizza pizza3 = new Pizza("Regular crust", "BBQ");

        // Create a pizza with only a crust.
        Pizza pizza4 = new Pizza("Stuffed crust");

        // Print the first pizza's ingredients.
        System.out.println(pizza1.bread);
        System.out.println(pizza1.sauce);
        System.out.println(pizza1.cheese);
        System.out.println(pizza1.topping);

        // Print the second pizza's ingredients.
        System.out.println(pizza2.bread);
        System.out.println(pizza2.sauce);
        System.out.println(pizza2.cheese);

        // Print the third pizza's ingredients.
        System.out.println(pizza3.bread);
        System.out.println(pizza3.sauce);

        // Print the fourth pizza's crust.
        System.out.println(pizza4.bread);
    }
}

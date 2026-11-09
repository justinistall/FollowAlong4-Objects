package part19;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=13857s
//        rewatch from about 3:51:00 for static variables,
//        and from about 3:54:50 for static methods and Math.round
// Guide: GUIDE.md in this folder, steps 3–9
//
// SECTION C — Stretch. Do Stretch A, then Stretch B. The README says what each one should print.
// Stretch B3 also adds to your Friend class.
//
// There is no main method here yet. Typing it is part of the stretch.




// This class runs the stretch exercises.
public class Stretch {

    // This is where the program starts.
    public static void main(String[] args) {

        // STRETCH A - STATIC VARIABLES

        // Create three friends.
        Friend friend1 = new Friend("Justin");
        Friend friend2 = new Friend("John");
        Friend friend3 = new Friend("Mike");

        // Print how many friends were created.
        System.out.println("Total friends: " + Friend.numberOfFriends);

        // STRETCH B - STATIC METHODS

        // Display the number of friends.
        Friend.displayFriends();

        // Create a decimal number.
        double number = 7.6;

        // Round the number using Math.round.
        long roundedNumber = Math.round(number);

        // Print the rounded number.
        System.out.println("Rounded number: " + roundedNumber);

        // Create another decimal number.
        double secondNumber = 4.3;

        // Round the second number.
        long secondRounded = Math.round(secondNumber);

        // Print the second result.
        System.out.println("Second rounded number: " + secondRounded);
    }
}

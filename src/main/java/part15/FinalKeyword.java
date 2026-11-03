package part15;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=10635s
//        starts at about 2:57:15 — stop at about 2:59:12, when he says
//        "if you would like a copy of this code"
// Guide: GUIDE.md in this folder, Video 1 — the same lesson, written out step by step
//
// Part 15, video 1 — the final keyword
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called FinalKeyword.
//    Leave the "package part15;" line and the "public class FinalKeyword" line alone.
//    Type everything else yourself.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. The README shows an example.




public class FinalKeyword {

    // Start the program
    public static void main(String[] args) {

        // Create a final variable for pi
        final double PI = 3.14159;

        // Print the value of pi
        System.out.println(PI);

        // Create a final variable for age
        final int AGE = 20;

        // Print the age
        System.out.println(AGE);

        // Create a final String variable
        final String NAME = "Justin";

        // Print the name
        System.out.println(NAME);

        // Create a radius variable
        double radius = 5.0;

        // Calculate the area of a circle
        double area = PI * radius * radius;

        // Print the area
        System.out.println("Area: " + area);

        // Create a regular variable
        int number = 10;

        // Change the regular variable
        number = 20;

        // Print the new number
        System.out.println(number);

        // Final variables cannot be changed after assignment
        // PI = 3.14; would cause an error
    }
}

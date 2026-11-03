package part15;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=10635s
// Guide: GUIDE.md in this folder
//
// SECTION D — Challenge. Finish the two methods below. Then run ChallengeTest until every
// test is green. Change only the lines marked YOUR CODE.
// You learned everything you need for these in parts 06 and 07: if, else, &&, ||, %.




public class Challenge {

    // Check how good the party is
    public static int partyRating(int snacks, int drinks) {

        // Bad party if snacks or drinks are less than 5
        if (snacks < 5 || drinks < 5) {
            return 0;
        }

        // Great party if one is at least double the other
        else if (snacks >= 2 * drinks || drinks >= 2 * snacks) {
            return 2;
        }

        // Otherwise it is a good party
        else {
            return 1;
        }
    }

    // Check if a number is Fizz, Buzz, or FizzBuzz
    public static String fizzBuzz(int n) {

        // Check if divisible by both 3 and 5
        if (n % 3 == 0 && n % 5 == 0) {
            return "FizzBuzz";
        }

        // Check if divisible by 3
        else if (n % 3 == 0) {
            return "Fizz";
        }

        // Check if divisible by 5
        else if (n % 5 == 0) {
            return "Buzz";
        }

        // Otherwise return the number as text
        else {
            return String.valueOf(n);
        }
    }

    // Main method to run the program
    public static void main(String[] args) {

        // Test partyRating
        System.out.println(partyRating(6, 8));
        System.out.println(partyRating(3, 8));
        System.out.println(partyRating(20, 6));

        // Test fizzBuzz
        System.out.println(fizzBuzz(15));
        System.out.println(fizzBuzz(9));
        System.out.println(fizzBuzz(10));
        System.out.println(fizzBuzz(7));
    }
}

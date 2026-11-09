package part18;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=13478s
//        (passing things to a method, then using them — same idea as park(car))
//
// SECTION D — Challenge. Two methods plus a helper. The test in src/test/java/part18/ChallengeTest.java
// checks all three. Change only the lines marked YOUR CODE. The README explains each one.




public class Challenge {

    // Add only numbers that are not repeated.
    public static int uniqueSum(int a, int b, int c) {
        int sum = 0;

        if (a != b && a != c) {
            sum += a;
        }

        if (b != a && b != c) {
            sum += b;
        }

        if (c != a && c != b) {
            sum += c;
        }

        return sum;
    }

    // Add the numbers after checking for teens.
    public static int sumWithoutTeens(int a, int b, int c) {
        return fixTeen(a) + fixTeen(b) + fixTeen(c);
    }

    // Return 0 for teens except 15 and 16.
    public static int fixTeen(int n) {
        if (n >= 13 && n <= 19 && n != 15 && n != 16) {
            return 0;
        }

        return n;
    }
}

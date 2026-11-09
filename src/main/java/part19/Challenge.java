package part19;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=13800s
//        (these are static methods — you call them with the class name, like Math.round)
//
// SECTION D — Challenge. Two methods plus a helper. The test in src/test/java/part19/ChallengeTest.java
// checks all three. Change only the lines marked YOUR CODE. The README explains each one.




public class Challenge {

    // Round all three numbers and add them together.
    public static int roundedTotal(int a, int b, int c) {
        return round10(a) + round10(b) + round10(c);
    }

    // Round a number to the nearest 10.
    public static int round10(int n) {
        int remainder = n % 10;

        if (remainder >= 5) {
            return n + (10 - remainder);
        } else {
            return n - remainder;
        }
    }

    // Check if the bricks can make the exact wall length.
    public static boolean canBuildWall(int small, int big, int goal) {
        if (small < 0 || big < 0 || goal < 0) {
            return false;
        }

        if ((long) small + 5L * big < goal) {
            return false;
        }

        int bigNeeded = Math.min(big, goal / 5);
        int remaining = goal - bigNeeded * 5;

        return remaining <= small;
    }
}

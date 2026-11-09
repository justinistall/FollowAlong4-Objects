package part20;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo
//        (no video in this part — it is a checkpoint. Use it to look things up)

// No video in this part — it is a checkpoint.
//
// SECTION D — Challenge. Two methods. The test in src/test/java/part20/ChallengeTest.java checks them.
// Change only the lines marked YOUR CODE. The README explains each one.




public class Challenge {

    // Check the lottery ticket numbers.
    public static int ticketResult(int a, int b, int c) {

        // All three numbers match.
        if (a == b && b == c) {
            return 10;
        }

        // Both b and c are different from a.
        if (a != b && a != c) {
            return 5;
        }

        // Otherwise, no points.
        return 0;
    }

    // Check if two strings appear the same number of times.
    public static boolean sameCount(String s, String x, String y) {

        // Count how many times x appears.
        int countX = 0;

        // Count how many times y appears.
        int countY = 0;

        // Check each possible starting position for x.
        for (int i = 0; i <= s.length() - x.length(); i++) {
            if (s.startsWith(x, i)) {
                countX++;
            }
        }

        // Check each possible starting position for y.
        for (int i = 0; i <= s.length() - y.length(); i++) {
            if (s.startsWith(y, i)) {
                countY++;
            }
        }

        // Return true if the counts match.
        return countX == countY;
    }
}

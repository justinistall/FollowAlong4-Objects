package part16;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=11407s
// Guide: GUIDE.md in this folder
//
// SECTION D — Challenge. Finish the two methods below. Then run ChallengeTest until every
// test is green. Change only the lines marked YOUR CODE.
// You need a for loop (part 08) and String methods like charAt and indexOf (part 11).




public class Challenge {

    // Repeat every letter twice
    public static String doubleLetters(String s) {

        // Start with an empty String
        String result = "";

        // Go through each character
        for (int i = 0; i < s.length(); i++) {

            // Add each character twice
            result += s.charAt(i);
            result += s.charAt(i);
        }

        // Return the new String
        return result;
    }

    // Count how many times a word appears without overlaps
    public static int countWord(String s, String word) {

        // Start counting at zero
        int count = 0;

        // Start searching at the beginning
        int index = 0;

        // Avoid searching for an empty word
        if (word.isEmpty()) {
            return 0;
        }

        // Search for the word
        while ((index = s.indexOf(word, index)) != -1) {

            // Add one when the word is found
            count++;

            // Move past the word to avoid overlaps
            index += word.length();
        }

        // Return how many times the word appeared
        return count;
    }

    // Main method to run the program
    public static void main(String[] args) {

        // Test doubleLetters
        System.out.println(doubleLetters("hi"));
        System.out.println(doubleLetters("Java"));
        System.out.println(doubleLetters(""));

        // Test countWord
        System.out.println(countWord("hi hi hi", "hi"));
        System.out.println(countWord("aaaa", "aa"));
        System.out.println(countWord("hello", "bye"));
    }
}

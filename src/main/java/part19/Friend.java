
package part19;

// This class stores information about friends.
public class Friend {

    // Store the name of each friend.
    String name;

    // Count how many friend objects are created.
    static int numberOfFriends;

    // This constructor runs when a friend is created.
    public Friend(String name) {

        // Save the friend's name.
        this.name = name;

        // Increase the shared friend count by one.
        numberOfFriends++;
    }

    // This static method displays the total friend count.
    public static void displayFriends() {

        // Print the total number of friends.
        System.out.println("You have " + numberOfFriends + " friends.");
    }
}

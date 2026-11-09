package part18;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=13121s
//        starts at about 3:38:40 — stop at about 3:44:15, at "that's the basics of arrays of objects"
// Guide: GUIDE.md in this folder, steps 1–6
//
// Part 18, topic 1 — an array of objects
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide) in this class.
//    His class is called Main. Yours is called ArrayOfObjects.
//    Leave the "package part18;" line and the class line alone. Type everything else yourself.
//    You also make a new class called Food. The README shows how.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    saying in YOUR OWN WORDS what that line does. Do this in Food.java too.




// This class runs the program.
public class ArrayOfObjects {

    // This is where the program starts.
    public static void main(String[] args) {

        // Create three food objects.
        Food food1 = new Food("Pizza");
        Food food2 = new Food("Hamburger");
        Food food3 = new Food("Hotdog");

        // Put the food objects into an array.
        Food[] refrigerator = {food1, food2, food3};

        // Print the name of each food.
        for (Food food : refrigerator) {

            // Display the food name.
            System.out.println(food.name);
        }
    }
}

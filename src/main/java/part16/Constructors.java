package part16;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=11407s
//        starts at about 3:10:07 — stop at about 3:19:32, when he says
//        "if you would like a copy of all this code"
// Guide: GUIDE.md in this folder, Video 1 — the same lesson, written out step by step
//
// Part 16, video 1 — constructors
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide).
//    His class with main is called Main. Yours is called Constructors.
//    Leave the "package part16;" line and the "public class Constructors" line alone.
//    He also has a second class called Human. YOU make that file too:
//    right-click the part16 folder -> New -> Java Class -> type Human -> Enter.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    in THIS file AND in Human.java, saying in YOUR OWN WORDS what that line does.




public class Constructors {

    // This is where the program starts running.
    public static void main(String[] args) {

        // Create a human named Rick who is 30 years old.
        Human human1 = new Human("Rick", 30, 70.5);

        // Create another human named Morty who is 15.
        Human human2 = new Human("Morty", 15, 50.0);

        // Print the first human's name.
        System.out.println(human1.name);

        // Print the second human's name.
        System.out.println(human2.name);

        // Make the first human eat.
        human1.eat();

        // Make the second human drink.
        human2.drink();
    }
}

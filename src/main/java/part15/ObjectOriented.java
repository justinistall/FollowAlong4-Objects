package part15;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=10770s
//        starts at about 2:59:30 — stop at about 3:09:48, when he says
//        "if you would like a copy of all this code"
// Guide: GUIDE.md in this folder, Video 2 — the same lesson, written out step by step
//
// Part 15, video 2 — objects (object-oriented programming)
//
// SECTION A — FOLLOW ALONG: type the code from the video (or the guide).
//    His class with main is called Main. Yours is called ObjectOriented.
//    Leave the "package part15;" line and the "public class ObjectOriented" line alone.
//    He also makes a second class called Car. YOU make that file too:
//    right-click the part15 folder -> New -> Java Class -> type Car -> Enter.
//
// SECTION B — COMMENTS: when you finish, put a // comment ABOVE every line of code,
//    in THIS file AND in Car.java, saying in YOUR OWN WORDS what that line does.


public class ObjectOriented {

    // Main method to run the program
    public static void main(String[] args) {

        // STRETCH A - CONSTRUCTORS AND THIS

        // Create a counter object
        Counter counter = new Counter(5);

        // Print the starting count
        System.out.println(counter.count);

        // Increase the count
        counter.increase();

        // Print the new count
        System.out.println(counter.count);

        // Create a pet object
        Pet myPet = new Pet("Max", 3);

        // Print the pet information
        myPet.showInfo();

        // STRETCH B - LOCAL AND GLOBAL VARIABLES

        // Create a Broken object
        Broken example = new Broken();

        // Show the variable values
        example.showValues();
    }
}

// Counter class
class Counter {

    // Store the counter value
    int count;

    // Constructor to set the starting count
    Counter(int count) {
        this.count = count;
    }

    // Method to increase the count
    void increase() {
        count++;
    }
}

// Pet class
class Pet {

    // Store the pet's name
    String name;

    // Store the pet's age
    int age;

    // Constructor to set pet information
    Pet(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to print pet information
    void showInfo() {
        System.out.println("Pet name: " + name);
        System.out.println("Pet age: " + age);
    }
}

// Broken class
class Broken {

    // Instance variable
    int number = 10;

    // Method that demonstrates a local variable
    void showValues() {

        // Local variable
        int number = 20;

        // Print the local variable
        System.out.println("Local number: " + number);

        // Print the instance variable
        System.out.println("Instance number: " + this.number);
    }
}


package part16;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=11407s
//        rewatch 3:10:07–3:19:32 for constructors and "this",
//        3:19:50–3:25:04 for local and global variables
// Guide: GUIDE.md in this folder
//
// SECTION C — Stretch. Do Stretch A, then Stretch B. The README says what each one should print.
//
// There is no main method here yet. Typing it is part of the stretch.
// Your extra classes (Counter, Pet, Broken) go in THIS file,
// BELOW the last } of class Stretch, without the word public.




public class Stretch {

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

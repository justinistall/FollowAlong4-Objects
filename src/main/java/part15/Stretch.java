package part15;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo&t=10770s
//        rewatch 2:59:30–3:09:48 for objects, 2:57:15–2:59:12 for final
// Guide: GUIDE.md in this folder
//
// SECTION C — Stretch. Do Stretch A, then Stretch B. The README says what each one should print.
//
// There is no main method here yet. Typing it is part of the stretch.
// Stretch A uses YOUR Car class from the follow-along, so do Section A first.
// Stretch B: your Phone class goes in THIS file, BELOW the last } of class Stretch.




public class Stretch {

    // Main method to run the program
    public static void main(String[] args) {

        // STRETCH A - CAR OBJECTS

        // Create a new car
        Car myCar = new Car();

        // Print the car's information
        System.out.println(myCar.make);
        System.out.println(myCar.model);
        System.out.println(myCar.year);

        // Make the car drive
        myCar.drive();

        // Make the car brake
        myCar.brake();

        // Create a final variable
        final int MAX_SPEED = 120;

        // Print the maximum speed
        System.out.println("Max speed: " + MAX_SPEED);

        // STRETCH B - PHONE OBJECTS

        // Create a new phone
        Phone myPhone = new Phone();

        // Print the phone's information
        System.out.println(myPhone.brand);
        System.out.println(myPhone.model);
        System.out.println(myPhone.price);

        // Make the phone call
        myPhone.call();

        // Make the phone ring
        myPhone.ring();
    }
}

// Phone class goes outside the Stretch class
class Phone {

    // Store the phone brand
    String brand = "Apple";

    // Store the phone model
    String model = "iPhone 16";

    // Store the phone price
    double price = 999.99;

    // Make the phone call
    void call() {
        System.out.println("The phone is calling");
    }

    // Make the phone ring
    void ring() {
        System.out.println("The phone is ringing");
    }
}

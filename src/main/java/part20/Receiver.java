package part20;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo
//        (no video in this part — it is a checkpoint. Use it to look things up)

// Part 20 — CHECKPOINT. No video, no guide.
//
// You write this whole class yourself, starting from an empty file.
// The README lists everything a Receiver needs, one step at a time.
// Main.java uses it, so you can run Main to check your work.
//
// Leave the "package part20;" line alone.
// Under these comments, type the class: public class Receiver { ... }
//
// When it works, put a // comment ABOVE every line of code, in YOUR OWN WORDS (Section B).



// This class represents a football receiver.
public class Receiver {

    // Store the receiver's name.
    private String name;

    // Store the receiver's jersey number.
    private int number;

    // Keep track of the number of catches.
    private int catches;

    // Keep track of the total receiving yards.
    private int yards;

    // This constructor creates a new receiver.
    public Receiver(String name, int number) {

        // Save the receiver's name.
        this.name = name;

        // Save the receiver's jersey number.
        this.number = number;

        // Start the catches at zero.
        this.catches = 0;

        // Start the yards at zero.
        this.yards = 0;
    }

    // This method returns the receiver's name.
    public String getName() {

        // Give back the name.
        return name;
    }

    // This method returns the jersey number.
    public int getNumber() {

        // Give back the number.
        return number;
    }

    // This method returns the number of catches.
    public int getCatches() {

        // Give back the catches.
        return catches;
    }

    // This method returns the total yards.
    public int getYards() {

        // Give back the yards.
        return yards;
    }

    // This method records a completed catch.
    public void catchBall(int yards) {

        // Add one to the number of catches.
        catches++;

        // Add the new yards to the total.
        this.yards += yards;
    }

    // This method creates a description of the receiver.
    @Override
    public String toString() {

        // Return the receiver's information.
        return name + " (#" + number + "): "
                + catches + " catches, "
                + yards + " yards";
    }
}

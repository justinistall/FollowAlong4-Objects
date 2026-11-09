package part20;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo
//        (no video in this part — it is a checkpoint. Use it to look things up)

// Part 20 — CHECKPOINT. No video, no guide.
//
// You write this whole class yourself, starting from an empty file.
// The README lists everything a Quarterback needs, one step at a time.
// Main.java uses it, so you can run Main to check your work.
//
// Leave the "package part20;" line alone.
// Under these comments, type the class: public class Quarterback { ... }
//
// When it works, put a // comment ABOVE every line of code, in YOUR OWN WORDS (Section B).



// This class represents a football quarterback.
public class Quarterback {

    // Store the quarterback's name.
    private String name;

    // Store the quarterback's jersey number.
    private int number;

    // Count how many passes were attempted.
    private int attempts;

    // Count how many passes were completed.
    private int completions;

    // Store the total passing yards.
    private int passingYards;

    // This constructor creates a quarterback.
    public Quarterback(String name, int number) {

        // Save the quarterback's name.
        this.name = name;

        // Save the jersey number.
        this.number = number;

        // Start attempts at zero.
        this.attempts = 0;

        // Start completions at zero.
        this.completions = 0;

        // Start passing yards at zero.
        this.passingYards = 0;
    }

    // Return the quarterback's name.
    public String getName() {

        // Give back the name.
        return name;
    }

    // Return the quarterback's jersey number.
    public int getNumber() {

        // Give back the number.
        return number;
    }

    // Return the number of attempts.
    public int getAttempts() {

        // Give back the attempts.
        return attempts;
    }

    // Return the number of completions.
    public int getCompletions() {

        // Give back the completions.
        return completions;
    }

    // Return the total passing yards.
    public int getPassingYards() {

        // Give back the yards.
        return passingYards;
    }

    // Throw a completed pass to a receiver.
    public void throwTo(Receiver receiver, int yards) {

        // Increase the number of attempts.
        attempts++;

        // Increase the number of completions.
        completions++;

        // Add the passing yards.
        passingYards += yards;

        // Give the receiver a catch and yards.
        receiver.catchBall(yards);
    }

    // Throw a pass without specifying yards.
    public void throwTo(Receiver receiver) {

        // Call the other throw method with zero yards.
        throwTo(receiver, 0);
    }

    // Calculate the completion percentage.
    public double completionPercentage() {

        // Check if there have been no attempts.
        if (attempts == 0) {

            // Return zero to avoid dividing by zero.
            return 0.0;
        }

        // Calculate the percentage of completed passes.
        return (double) completions / attempts * 100;
    }

    // Create a text description of the quarterback.
    @Override
    public String toString() {

        // Return the quarterback's statistics.
        return name + " (#" + number + "): "
                + completions + "/" + attempts
                + " passes, " + passingYards
                + " yards, " + completionPercentage()
                + "% completion";
    }
}

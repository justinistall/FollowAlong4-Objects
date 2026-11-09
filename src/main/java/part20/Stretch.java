package part20;

// Video: https://www.youtube.com/watch?v=xk4_1vDrzzo
//        (no video in this part — it is a checkpoint. Use it to look things up)

// No video in this part — it is a checkpoint.
// Look back at: part 18 (passing objects), part 17 (toString), part 02 (int vs double).
//
// SECTION C — Stretch. Do Stretch A, then Stretch B. The README says what each one should print.
// Stretch B2 and B3 also change your Receiver class.
//
// There is no main method here yet. Typing it is part of the stretch.




// This class runs the stretch exercises.
public class Stretch {

    // This is where the program starts.
    public static void main(String[] args) {

        // Create a quarterback.
        Quarterback quarterback = new Quarterback("Carter", 40);

        // Create two receivers.
        Receiver receiver1 = new Receiver("Davis", 11);
        Receiver receiver2 = new Receiver("Brooks", 84);

        // Print the receivers before any catches.
        System.out.println("Before passing:");
        System.out.println(receiver1);
        System.out.println(receiver2);

        // Throw a 15-yard pass to Davis.
        quarterback.throwTo(receiver1, 15);

        // Throw a 25-yard pass to Brooks.
        quarterback.throwTo(receiver2, 25);

        // Throw another 50-yard pass to Davis.
        quarterback.throwTo(receiver1, 50);

        // Print the updated receiver statistics.
        System.out.println("After passing:");
        System.out.println(receiver1);
        System.out.println(receiver2);

        // Print the quarterback's statistics.
        System.out.println(quarterback);

        // Print the quarterback's completion percentage.
        System.out.println("Completion percentage: "
                + quarterback.completionPercentage() + "%");
    }
}

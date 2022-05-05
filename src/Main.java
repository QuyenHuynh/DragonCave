import java.util.*;

public class Main {

    public static void main(String[] args) {

        System.out.println(
                "You are in a land full of dragons. \n" +
                        "In front of you, you see two caves. \n" +
                        "In one cave, the dragon is friendly and will share his treasure with you. \n" +
                        "The other dragon is greedy and hungry and will eat you on sight. \n" +
                        "Which cave will you go into? (1 or 2) ");

        Scanner scan = new Scanner(System.in);

        int input = 0;
        boolean valid = false;
        while (!valid) {
            try {
                input = scan.nextInt();
                if (input == 1 || input == 2) {
                    valid = true;
                } else {
                    System.out.println("Not a valid number. Try again (1 or 2).");
                }
            } catch (InputMismatchException e) {
                System.out.println("Please enter a number (1 or 2).");
                scan.next();
            }
        }

        System.out.println(
                "You approach the cave...\n" +
                        "It is dark and spooky...\n" +
                        "A large dragon jumps out in front of you!");

        if (input == 1) {
            System.out.println("He opens his jaws and gobbles you down in one bite!");
        } else if (input == 2) {
            System.out.println("The dragon is friendly and shares his treasure with you!");
        }
    }
}


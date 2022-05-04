import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println(
                "You are in a land full of dragons. \n" +
                "In front of you, you see two caves. \n" +
                "In one cave, the dragon is friendly and will share his treasure with you. \n" +
                "The other dragon is greedy and hungry and will eat you on sight. \n" +
                "Which cave will you go into? (1 or 2) ");

        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();

        System.out.println(
                "You approach the cave...\n" +
                "It is dark and spooky...\n" +
                "A large dragon jumps out in front of you!");

        if (input == 1) {
            System.out.println("He opens his jaws and gobbles you down in one bite!");
        } else if (input == 2) {
            System.out.println("The dragon is friendly and shares his treasure with you! \n+10000 gold obtained!");
        }
    }
}

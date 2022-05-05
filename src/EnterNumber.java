import java.util.*;

public class EnterNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = 0;
        boolean valid = false;
        while(! valid ) {
            System.out.print("Enter number between 1 and 10: ");
            try {
                num = sc.nextInt();
                if(num >= 1 && num <= 10){
                    valid = true;
                } else {
                    System.out.println("Out of range.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Not a valid number.");
                sc.next();
            }
        }
        System.out.println(num + " is a valid number.");
    }
}

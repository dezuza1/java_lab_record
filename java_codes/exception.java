import java.util.InputMismatchException;
import java.util.Scanner;

public class exception {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int number;

        while (true) {
            try {
                System.out.print("Enter an integer: ");
                number = sc.nextInt();
                break;
            }
            catch (InputMismatchException e) {
                System.out.println("Invalid input");
                System.out.println("Try again");
                sc.nextLine();
            }
        }
    }
}

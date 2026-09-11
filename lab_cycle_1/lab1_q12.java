import java.util.Scanner;

public class lab1_q12 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Marks: ");
        int marks = sc.nextInt();

        if (marks >= 90 && marks <= 100) {
            System.out.println("Grade = A");
        } else if (marks >= 80 && marks <= 89) {
            System.out.println("Grade = B");
        } else if (marks >= 70 && marks <= 79) {
            System.out.println("Grade = C");
        } else if (marks >= 0 && marks < 70) {
            System.out.println("Grade = D");
        } else {
            System.out.println("Invalid Marks");
        }

        sc.close();
    }
}
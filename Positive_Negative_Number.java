import java.util.Scanner;

public class Positive_Negative_Number {
    public static void main(String[] args) {
        Scanner Positive_Negative_Number = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int Number = Positive_Negative_Number.nextInt();
        if (Number > 0) {
            System.out.println("The Number Is Positive.");
        } else if (Number < 0) {
            System.out.println("The Number Is Negative.");
        } else {
            System.out.println("The Number Is Zero.");
        }
        Positive_Negative_Number.close();
    }
}
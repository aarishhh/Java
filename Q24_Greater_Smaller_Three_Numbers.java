//Write A Java Program To Find The Largest Among Three Given Numbers.
import java.util.Scanner;

public class Q24_Greater_Smaller_Three_Numbers {

    public static void main(String[] args)

    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1;
        num1 = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int num2;
        num2 = scanner.nextInt();
        System.out.println("Enter the third number: ");
        int num3;
        num3 = scanner.nextInt();
        if (num1 > num2 && num1 > num3) {
            System.out.println("The largest number is: " + num1);
        } else if (num2 > num3 && num2 > num1) {
            System.out.println("The largest number is: " + num2);
        } else if (num3 > num1 && num3 > num2) {
            System.out.println("The largest number is: " + num3);
        } else {
            System.out.println("The Numbers Are Equal");
        }
        System.out.println("\n");
        if (num1 < num2 && num1 < num3) {
            System.out.println("The smallest number is: " + num1);
        } else if (num2 < num3 && num2 < num1) {
            System.out.println("The smallest number is: " + num2);
        } else if (num3 < num1 && num3 < num2) {
            System.out.println("The smallest number is: " + num3);
        }
        scanner.close();
    }

}
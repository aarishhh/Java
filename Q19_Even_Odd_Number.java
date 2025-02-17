//Write A Program To Check Given Number Is Even Or Odd.
import java.util.Scanner;

public class Q19_Even_Odd_Number {
    public static void main(String[] args) {
        Scanner Even_Odd_Number = new Scanner(System.in);
        System.out.println("Enter A Number: ");
        int Number = Even_Odd_Number.nextInt();
        if (Number % 2 == 0) {
            System.out.println("The Number Is Even");
        } else {
            System.out.println("The Number Is Odd");
        }
        Even_Odd_Number.close();
    }
}
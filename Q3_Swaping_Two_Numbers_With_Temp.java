//Write A Program To Swap Two Given Numbers Making Use Of Temporary Variable.
import java.util.Scanner;
public class Q3_Swaping_Two_Numbers_With_Temp {
    public static void main(String[] args) {
        Scanner Swapping = new Scanner(System.in);
        System.out.println("Give Two Numbers To Swap Them: ");
        System.out.print("Enter First Number: ");
        int Num1;
        Num1 = Swapping.nextInt();
        System.out.print("Enter Second Number: ");
        int Num2, Temp;
        Num2 = Swapping.nextInt();
        System.out.println("Before Swapping A Is "+Num1);
        System.out.println("Before Swapping B Is "+Num2);
        Temp = Num1;
        Num1 = Num2;
        Num2 = Temp;
        System.out.println("After Swapping A Is "+Num1);
        System.out.println("After Swapping B Is "+Num2);
        Swapping.close();

    }
}
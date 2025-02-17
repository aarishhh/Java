//WAP To Find Sum Of First And Last Digit Of A Four Digit Number Given By User.
import java.util.Scanner;

public class Q30_Add_First_And_Last_Number {
    public static void main(String[] args) {
        Scanner Add = new Scanner(System.in);
        System.out.print("Enter Any Four Digit Number: ");
        int Number = Add.nextInt();
        int Result = Number / 1000;
        int Result_1 = Number % 10;
        System.out.println("Addition Of First And Last Numbers Is: "+(Result + Result_1));
        Add.close();
    }
}

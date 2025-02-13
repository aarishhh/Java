import java.util.Scanner;

public class Add_First_Last {
    public static void main(String[] args) {
        Scanner Add = new Scanner(System.in);
        System.out.print("Enter Any four Digit Number: ");
        int Number = Add.nextInt();
        int Result = Number / 1000;
        int Result_1 = Number % 10;
        System.out.println("Addition Of First And Last Numbers Is: "+(Result + Result_1));
        Add.close();
    }
}

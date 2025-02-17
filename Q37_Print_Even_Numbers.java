
//WAP To Print All Even Numbers Up To Given Numbers.
import java.util.Scanner;

public class Q37_Print_Even_Numbers {
    Scanner Even_Numbers = new Scanner(System.in);
    int Num;

    void Input() {
        System.out.println("Enter A Number: ");
        Num = Even_Numbers.nextInt();
    }

    void Output() {

        for (int i = 1; i <= Num; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        Q37_Print_Even_Numbers obj = new Q37_Print_Even_Numbers();
        obj.Input();
        obj.Output();
    }
}
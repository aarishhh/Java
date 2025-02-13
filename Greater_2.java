import java.util.Scanner;

public class Greater_2 {
    Scanner sc = new Scanner(System.in);
    int num1, num2;

    void input() {
        System.out.println("Enter 2 numbers: ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();
    }

    void check() {
        int result = (num1 > num2) ? num1 : num2;
        System.out.println("Greater number is: " + result);
    }

    public static void main(String[] args) {
        Greater_2 obj = new Greater_2();
        obj.input();
        obj.check();
    }
}
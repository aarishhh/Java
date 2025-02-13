import java.util.Scanner;

public class Prime {
    Scanner sc = new Scanner(System.in);
    int num;
    int flag = 0;

    void input() {
        System.out.println("Enter a number: ");
        num = sc.nextInt();
    }

    void logic() {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                flag = 1;
                break;
            }
        }
    }

    void display() {
        if (flag == 0) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }

    public static void main(String[] args) {
        Prime obj = new Prime();
        obj.input();
        obj.logic();
        obj.display();
    }
}
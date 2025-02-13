import java.util.Scanner;

public class Cost_Sale {
    Scanner sc = new Scanner(System.in);
    int cost, sale, profit;

    void input() {
        System.out.println("Enter cost price: ");
        cost = sc.nextInt();
        System.out.println("Enter sale price: ");
        sale = sc.nextInt();
    }

    void calculate() {
        profit = sale - cost;
    }

    void display() {
        if (profit > 0) {
            System.out.println("You have made a profit of: " + profit);
        } else if (profit < 0) {
            System.out.println("You have made a loss of: " + profit);
        } else {
            System.out.println("You have neither made a profit nor a loss");
        }
    }

    public static void main(String[] args) {
        Cost_Sale obj = new Cost_Sale();
        obj.input();
        obj.calculate();
        obj.display();
    }
}

//WAP To Enter Cost Price And Sales Price And Find Amount Of Profit Or Loss.
import java.util.Scanner;

public class Q32_Cost_Price_Sales_Price_Using_Function {
    Scanner Cost_Sale = new Scanner(System.in);
    int Cost, Sale, Profit;

    void Input() {
        System.out.println("Enter Cost Price: ");
        Cost = Cost_Sale.nextInt();
        System.out.println("Enter Sale Price: ");
        Sale = Cost_Sale.nextInt();
    }

    void Calculate() {
        Profit = Sale - Cost;
    }

    void Output() {
        if (Profit > 0) {
            System.out.println("You Have Made A Profit Of: " + Profit);
        } else if (Profit < 0) {
            System.out.println("You Have Made A Loss Of: " + Profit);
        } else {
            System.out.println("You have Neither Made A Profit Nor A Loss");
        }
    }

    public static void main(String[] args) {
        Q32_Cost_Price_Sales_Price_Using_Function obj = new Q32_Cost_Price_Sales_Price_Using_Function();
        obj.Input();
        obj.Calculate();
        obj.Output();
    }
}
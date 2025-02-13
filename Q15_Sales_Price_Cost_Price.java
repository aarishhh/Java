//Write A Program To Enter Cost Price And Sales Price And Find The Profit And Loss.
import java.util.Scanner;
public class Q15_Sales_Price_Cost_Price {
    public static void main(String[] args) {
        Scanner Sales_Price_Cost_Price = new Scanner(System.in);
        System.out.print("Enter Cost Price: ");
        int Cost = Sales_Price_Cost_Price.nextInt();
        System.out.print("Enter Sales Price: ");
        int Sales = Sales_Price_Cost_Price.nextInt();
        if (Cost > Sales) {
            System.out.println("Loss= -" + (Cost - Sales));
        }
        else {
            System.out.println("Profit= +"+(Sales-Cost));
        }
        Sales_Price_Cost_Price.close();
    }
}

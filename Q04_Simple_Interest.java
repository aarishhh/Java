//Write A Program To Calculate Simple Interest And Final Amount Paid To The Bank.
import java.util.Scanner;

public class Q04_Simple_Interest {
    public static void main(String[] args) {
        Scanner SI = new Scanner(System.in);
        System.out.println("To Calculate Simple Interest Enter The Following Details: ");
        System.out.print("Enter Principal Amount: ");
        int Principal_Amount = SI.nextInt();
        System.out.print("Enter Number Of Years: ");
        int Number_Of_Years = SI.nextInt();
        System.out.print("Enter The Rate Of Interest(%): ");
        float Rate_Of_Interest = SI.nextFloat();
        float Simple_Interest = ((Principal_Amount * Number_Of_Years * Rate_Of_Interest) / 100);
        System.out.println("Simple Interest= " + Simple_Interest);
        System.out.println("The Final Amount= " + (Principal_Amount + Simple_Interest));
        SI.close();
    }
}

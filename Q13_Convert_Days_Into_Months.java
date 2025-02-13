//Write A Program To Convert Given Days Into Month And Remaining Days.
import java.util.Scanner;
public class Q13_Convert_Days_Into_Months {
    public static void main(String[] args) {
        Scanner Convert_Days_Into_Months = new Scanner(System.in);
        System.out.println("Enter The Number Of Days: ");
        int Days = Convert_Days_Into_Months.nextInt();
        int Months = Days / 30;
        int Remaining_Days = Days % 30;
        System.out.println("Equivalent Duration: " + Months + " Months And " + Remaining_Days + " Days");
        Convert_Days_Into_Months.close();
    }
}

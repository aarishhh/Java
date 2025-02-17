//Write A Program To Check Given Person Can Vote Or Not.
import java.util.Scanner;

public class Q16_Eligibility_To_Vote {
    public static void main(String[] args) {
        Scanner Vote_Eligibility = new Scanner(System.in);
            System.out.println("Enter Your Age: ");
            int Age = Vote_Eligibility.nextInt();
            if (Age >= 18) {
                System.out.println("You Are Eligible To Vote");
            }
            else if (Age < 18 && Age >= 1) {
                System.out.println("You Are Not Eligible To Vote");
            }
            else if (Age <= 0) {
                System.out.println("Enter A Valid Age");
            }
            Vote_Eligibility.close();
    }
}
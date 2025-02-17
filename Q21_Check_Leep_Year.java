//WAP To Find Given Year Is Leap Year Or Not.
import java.util.Scanner;

public class Q21_Check_Leep_Year {
    public static void main(String[] args) {
        Scanner Check_Leep_Year = new Scanner(System.in);
        System.out.println("Enter The Year: ");
        int Year = Check_Leep_Year.nextInt();
        if (Year % 4 == 0) {
            if (Year % 100 == 0) {
                if (Year % 400 == 0) {
                    System.out.println(Year + " Is A Leep Year");
                } else {
                    System.out.println(Year + " Is Not A Leep Year");
                }
            } else {
                System.out.println(Year + " Is A Leep Year");
            }
        } else {
            System.out.println(Year + " Is Not A Leep Year");
        }
        Check_Leep_Year.close();
    }
}

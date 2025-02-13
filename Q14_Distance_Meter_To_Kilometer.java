//Write A Program To Convert Given Distance From Meter To Km.
import java.util.Scanner;
public class Q14_Distance_Meter_To_Kilometer {
    public static void main(String[] args) {
        Scanner Distance_Meter_To_Kilometer = new Scanner(System.in);
        System.out.print("Enter Distance In Meter: ");
        int Meter = Distance_Meter_To_Kilometer.nextInt();
        System.out.println(Meter + " Meter = " + (Meter / 1000) + " Kilometer ");
        Distance_Meter_To_Kilometer.close();
    }
}

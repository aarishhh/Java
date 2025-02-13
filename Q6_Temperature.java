//Write A Program To Convert Temperature From Fahrenheit To Celsius. 
import java.util.Scanner;

public class Q6_Temperature {
    public static void main(String[] args) {
        Scanner Temperature = new Scanner(System.in);
        System.out.println("Enter Temperature In Fahrenheit(°F): ");
        float Fahrenheit = Temperature.nextInt();
        float Celsius = ((Fahrenheit - 32) * 5 / 9);
        System.out.println(Fahrenheit + " °F = " + Celsius + " °C ");
        Temperature.close();
    }
}
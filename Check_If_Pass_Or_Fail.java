import java.util.Scanner;

public class Check_If_Pass_Or_Fail {
    public static void main(String[] args) {
        Scanner Check_If_Pass_Or_Fail = new Scanner(System.in);
        System.out.println("Enter Your Marks: ");
        int Marks = Check_If_Pass_Or_Fail.nextInt();
        if (Marks >= 90 && Marks <= 100) {
            System.out.println("Congrats! You Have Passed With A+ Grade");
        }
        else if (Marks >= 80 && Marks < 90) {
            System.out.println("Congrats! You Have Passed With A Grade");
        }
        else if (Marks >= 70 && Marks < 80) {
            System.out.println("Congrats! You Have Passed With B+ Grade");
        }
        else if (Marks >=60 && Marks < 70) {
            System.out.println("Congrats! You Have Passed With B Grade");
        }
        else if (Marks >= 50 && Marks < 60) {
            System.out.println("Congrats! You Have Passed With C+ Grade");
        }
        else if (Marks >= 40 && Marks < 50) {
            System.out.println("Congrats! You Have Passed With C Grade");
        }
        else if (Marks < 40 && Marks >= 0) {
            System.out.println("Sorry! You Have Failed");
        }
        else {
            System.out.println("Enter A Valid Marks");
        }
        Check_If_Pass_Or_Fail.close();
    }
}
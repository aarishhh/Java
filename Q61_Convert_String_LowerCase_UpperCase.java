import java.util.Scanner;

public class Q61_Convert_String_LowerCase_UpperCase {
    static Scanner Upper_Lower = new Scanner(System.in);
    String Str = new String();

    void UpperCase() {
        System.out.print("Enter A String: ");
        Str = Upper_Lower.next();
        Str = Str.toUpperCase();
        System.out.println("Converted To Upper Case: " + Str + "\n");
    }

    void LowerCase() {
        System.out.print("Enter A String: ");
        Str = Upper_Lower.next();
        Str = Str.toLowerCase();
        System.out.println("Converted To Lower Case: " + Str + "\n");
    }

    public static void main(String[] args) {
        while (true) {
            Q61_Convert_String_LowerCase_UpperCase Obj = new Q61_Convert_String_LowerCase_UpperCase();
            System.out.print("Enter Upper For UpperCase\nEnter Lower For LowerCase\nEnter You Choice: ");
            String Choice = Upper_Lower.next();
            switch (Choice) {
                case "Upper":
                    Obj.UpperCase();
                    break;
                case "Lower":
                    Obj.LowerCase();
                    break;
                default:
                    System.out.println("Invalid Input");
                    break;
            }
        }
    }
}

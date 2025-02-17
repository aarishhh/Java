//Write A Program To Check Given Alphabet Is Small Or Capital.
import java.util.Scanner;

public class Q20_Check_Alphabet_Capital_Small {
    public static void main(String[] args) {
        Scanner Check_Alphabet_Big_Small = new Scanner(System.in);
        System.out.println("Enter A Character: ");
        char Alphabet = Check_Alphabet_Big_Small.next().charAt(0);
        if (Alphabet >= 'A' && Alphabet <= 'Z') {
            System.out.println("The Character Is An Uppercase Alphabet.");
        } else if (Alphabet >= 'a' && Alphabet <= 'z') {
            System.out.println("The Character Is A Lowercase Alphabet.");
        } else {
            System.out.println("The Character Is Not An Alphabet.");
        }
        Check_Alphabet_Big_Small.close();
    }
}

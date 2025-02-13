import java.util.Scanner;

public class Check_Alphabet_Digit_Special_Symbol {
    public static void main(String[] args) {
        Scanner Check_Alphabet_Digit_Special_Symbol = new Scanner(System.in);
        System.out.println("Enter A Character: ");
        char Character = Check_Alphabet_Digit_Special_Symbol.next().charAt(0);
        if(Character >= 'A' && Character <= 'Z' || Character >= 'a' && Character <= 'z') {
            System.out.println("The Character Is An Alphabet.");
        } else if(Character >= '0' && Character <= '9') {
            System.out.println("The Character Is A Digit.");
        } else {
            System.out.println("The Character Is A Special Symbol.");
        }
        Check_Alphabet_Digit_Special_Symbol.close();
    }
}

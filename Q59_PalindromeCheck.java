import java.util.Scanner;

public class Q59_PalindromeCheck {
    Scanner Palindrome = new Scanner(System.in);
    void Palindrome_Check() {
        System.out.println("Enter a string:");
        String Str = Palindrome.next();
        String ReversedStr = new StringBuilder(Str).reverse().toString();
        if (Str.equals(ReversedStr)) {
            System.out.println("The String Is A Palindrome.");
        } else {
            System.out.println("The String Is Not A Palindrome.");
        }
    }
}

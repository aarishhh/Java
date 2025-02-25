import java.util.Scanner;

public class Q59_PalindromeCheck {
    Scanner Palindrome = new Scanner(System.in);

    void Palindrome_Check() {
        String Str = new String();
        System.out.print("Enter a string: ");
        Str = Palindrome.nextLine();
        StringBuilder ReversedStr = new StringBuilder(Str);
        if (Str.equals(ReversedStr.reverse().toString())) {
            System.out.println("The String Is A Palindrome.");
        } else {
            System.out.println("The String Is Not A Palindrome.");
        }
    }

    public static void main(String[] args) {
        while (true) {
            Q59_PalindromeCheck Obj = new Q59_PalindromeCheck();
            Obj.Palindrome_Check();
        }
    }
}

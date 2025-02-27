//WAP To Reverse The Given String.
import java.util.Scanner;

public class Q58_Reverse_String {
    Scanner Reverse = new Scanner(System.in); 
    String Strr = new String();
    String ReversedStr = "";
    void Reversing() {
        System.out.print("Enter A String: ");
        Strr = Reverse.next();
        /*StringBuilder Str = new StringBuilder(Strr);
        Str.reverse();
        System.out.println("Reversed String: " + Str);*/
        for(int i = Strr.length() - 1; i >= 0; i--) {
            ReversedStr += Strr.charAt(i);
        }
        System.out.println("Reversed String: " + ReversedStr);
    }
    public static void main(String[] args) {
        Q58_Reverse_String Obj = new Q58_Reverse_String();
        Obj.Reversing();
    }
}
//WAP To Find The Length Of Given String.
import java.util.Scanner;

public class Q62_Length_Of_String {
    Scanner String_Length = new Scanner(System.in);
    String Str = new String();
    void Check_Length() {
        System.out.print("Enter A String: ");
        Str = String_Length.next();
        int Length = Str.length();
        System.out.println("The Length Of The Given String Is: " + Length);
    }
    public static void main(String[] args) {
        Q62_Length_Of_String Obj = new Q62_Length_Of_String();
        Obj.Check_Length();
    }
}

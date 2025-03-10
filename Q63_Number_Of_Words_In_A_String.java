//WAP To Count The Number Of Words In The Given String.
import java.util.Scanner;

public class Q63_Number_Of_Words_In_A_String {
    void Count() {
        Scanner Count_Words = new Scanner(System.in);
        System.out.print("Enter A String: ");
        String Str = Count_Words.nextLine();
        String[] Words = Str.split("\\s+");

        System.out.println("The Number Of Words In The Given String Is: " + (Words.length));
        Count_Words.close();
    }
    public static void main(String[] args) {
        Q63_Number_Of_Words_In_A_String Obj = new Q63_Number_Of_Words_In_A_String();
        Obj.Count();
    }
}

//WAP To Split The String.
import java.util.Arrays;
import java.util.Scanner;

public class Q65_Split_Given_String {
    void Split_String() {
        Scanner Split = new Scanner(System.in);
        System.out.print("Enter A String: ");
        String Str = Split.nextLine();
        System.out.print("Enter From Where You Wnat To Split: ");
        String Character = Split.next();
        String[] Str_Split = Str.split(Character);
        System.out.println("After Splitting: " + Arrays.toString(Str_Split));
        Split.close();
    }
    public static void main(String[] args) {
        Q65_Split_Given_String Obj = new Q65_Split_Given_String();
        Obj.Split_String();
    }
}

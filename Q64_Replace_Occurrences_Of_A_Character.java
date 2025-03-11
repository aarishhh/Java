// WAP To Replace All Occurrences Of A Specific Character With Given Character In A String.
import java.util.Scanner;

public class Q64_Replace_Occurrences_Of_A_Character {
    void Occurrences() {
        Scanner Replace_Occurrences = new Scanner(System.in);
        System.out.print("Enter A String: ");
        String Str = Replace_Occurrences.nextLine();
        System.out.print("Enter A Character You Want To Replace: ");
        char Character = Replace_Occurrences.next().charAt(0);
        System.out.print("Enter The Character To Want To Replace " + Character + " With: ");
        char Character_Replace = Replace_Occurrences.next().charAt(0);
        String Replaced = Str.replace(Character, Character_Replace);
        System.out.println("After Replacing: " + Replaced);
        Replace_Occurrences.close();
    }
    public static void main(String[] args) {
        Q64_Replace_Occurrences_Of_A_Character Obj = new Q64_Replace_Occurrences_Of_A_Character();
        Obj.Occurrences();
    }
}

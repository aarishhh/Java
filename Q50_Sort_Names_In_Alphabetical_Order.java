//WAP To Input 5 Names And Sort It In Ascending Order.
import java.util.Scanner;

public class Q50_Sort_Names_In_Alphabetical_Order {
    Scanner Alphabetical = new Scanner(System.in);
    String Alphabet[];
    int Alpha;

    void Input() {
        System.out.print("Enter Number Of Elements: ");
        Alpha = Alphabetical.nextInt();
        Alphabet = new String[Alpha];
        System.out.println("Enter " + Alpha + " Names: ");
        for (int i = 0; i < Alpha; i++) {
            System.out.print("Name " + (i + 1) + ": ");
            Alphabet[i] = Alphabetical.next();
        }
        Alphabetical.close();
    }

    void Sorting() {
        System.out.println("Sorted In Alphabetical Order: ");
        for (int i = 0; i < Alpha - 1; i++) {
            for (int j = i + 1; j < Alpha; j++) {
                if (Alphabet[i].compareTo(Alphabet[j]) > 0) {
                    String temp = Alphabet[i];
                    Alphabet[i] = Alphabet[j];
                    Alphabet[j] = temp;
                }
            }
        }
        for (int i = 0; i < Alpha; i++) {
            System.out.println(Alphabet[i]);
        }
    }

    public static void main(String[] args) {
        Q50_Sort_Names_In_Alphabetical_Order Obj = new Q50_Sort_Names_In_Alphabetical_Order();
        Obj.Input();
        Obj.Sorting();
    }
}
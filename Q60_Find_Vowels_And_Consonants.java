
//WAP To Count Vowels And Consonants In A Given String.
import java.util.Scanner;

public class Q60_Find_Vowels_And_Consonants {
    Scanner Vowels_Consonants = new Scanner(System.in);
    String Str = new String();

    void Find_Vowels_Consonants() {
        System.out.print("Enter A String: ");
        Str = Vowels_Consonants.next();
        int VowelCount = 0;
        int ConsonantCount = 0;
        Str = Str.toLowerCase();
        for (int i = 0; i < Str.length(); i++) {
            char Ch = Str.charAt(i);
            if (Ch == 'a' || Ch == 'e' || Ch == 'i' || Ch == 'o' || Ch == 'u') {
                VowelCount++;
            } else if ((Ch >= 'a' && Ch <= 'z')) {
                ConsonantCount++;
            }
        }

        System.out.println("Vowels: " + VowelCount);
        System.out.println("Consonants: " + ConsonantCount);
        Vowels_Consonants.close();
    }

    public static void main(String[] args) {
        Q60_Find_Vowels_And_Consonants Obj = new Q60_Find_Vowels_And_Consonants();
        Obj.Find_Vowels_Consonants();
    }
}

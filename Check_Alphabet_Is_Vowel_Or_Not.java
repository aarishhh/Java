import java.util.Scanner;

public class Check_Alphabet_Is_Vowel_Or_Not {
    public static void main(String[] args) {
        Scanner Check_Alphabet_Is_Vowel_Or_Not = new Scanner(System.in);
        System.out.println("Enter A Alphabet: ");
        char Alphabet = Check_Alphabet_Is_Vowel_Or_Not.next().charAt(0);
        if (Alphabet == 'a' || Alphabet == 'e' || Alphabet == 'i' || Alphabet == 'o' || Alphabet == 'u' || Alphabet == 'A' || Alphabet == 'E' || Alphabet == 'I' || Alphabet == 'O' || Alphabet == 'U') {
            System.out.println("The Alphabet Is Vowel");
        } else {
            System.out.println("The Alphabet Is Consonant");
        }
        Check_Alphabet_Is_Vowel_Or_Not.close();
    }
}

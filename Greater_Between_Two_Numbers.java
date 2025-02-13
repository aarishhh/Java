import java.util.Scanner;

public class Greater_Between_Two_Numbers {
    public static void main(String[] args) {
        Scanner Greater_Between_Two_Numbers = new Scanner(System.in);
        System.out.println("Enter The First Number: ");
        int Number_1 = Greater_Between_Two_Numbers.nextInt();
        System.out.println("Enter The Second Number: ");
        int Number_2 = Greater_Between_Two_Numbers.nextInt();
        if (Number_1 > Number_2) {
            System.out.println("The Greater Number is: " + Number_1);
        } else if (Number_1 < Number_2) {
            System.out.println("The Greater Number is: " + Number_2);
        } 
        else if (Number_1 == Number_2) {
            System.out.println("Both Numbers Are Equal");
        }
        Greater_Between_Two_Numbers.close();
    }
}

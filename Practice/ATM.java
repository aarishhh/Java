package Practice;

import java.util.Scanner;

public class ATM {
    Scanner Sc = new Scanner(System.in);
    private int Pin;
    private long Balance;

    ATM() {
        System.out.println("Welcome To ATM");
        System.out.print("Enter Default Balance: ");
        Balance = Sc.nextLong();
        System.out.print("Enter Default ATM Pin: ");
        Pin = Sc.nextInt();
        while (true) {
            if (Pin < 999 || Pin >= 9999) {
                System.out.println("Please Enter A Valid 4 Digit Pin");
                Pin = Sc.nextInt();
            } else {
                break;
            }
        }
    }

    void ATM_Process() {
        while (true) {
            System.out.println(
                    "Press 1 To Check Balance\nPress 2 For Cash Withdrawal\nPress 3 To Deposit Cash\nPress 4 To Change Pin\nPress 0 To Exit");
            int Choice = Sc.nextInt();
            switch (Choice) {
                case 1:
                    System.out.print("Please Enter ATM Pin: ");
                    int Entered_Pin = Sc.nextInt();
                    while (Entered_Pin != Pin) {
                        System.out.println("Incorrect Pin\nPlease Enter Correct");
                            Entered_Pin = Sc.nextInt();
                    }
                    System.out.println("Your Current Balance Is: " + Balance + "$");
                    break;
                case 2:
                    System.out.print("Please Enter The Amount You Want To Withdraw: ");
                    int Amount = Sc.nextInt();
                    if (Amount <= Balance) {
                        if (Amount > 10000) {
                            System.out.println("ATM Withdraw Limit Is 10000\nPlease Enter Amount Below 10000");
                        } else {
                            System.out.print("Please Enter Your ATM Pin: ");
                            Entered_Pin = Sc.nextInt();
                            if (Entered_Pin == Pin) {
                                System.out.println("Updated Balance After Withdrawal Is: " + (Balance - Amount) + "$");
                            } else {
                                System.out.println("Incorrect Pin");
                            }
                        }
                    } else {
                        System.out.println("Insufficient Balance");
                    }
                    break;
                case 3:
                    System.out.print("Please Enter The Pin: ");
                    Entered_Pin = Sc.nextInt();
                    if (Entered_Pin == Pin) {
                        System.out.print("Enter Amount You Want To Deposit: ");
                        long Update_Balance = Sc.nextInt();
                        System.out.println("Balance After Deposit Is " + (Update_Balance + Balance) + "$");
                    } else {
                        System.out.println("Incorrect Pin");
                    }
                    break;
                case 4:
                    System.out.print("Please Enter The Current Pin: ");
                    Entered_Pin = Sc.nextInt();
                    if (Entered_Pin == Pin) {
                        System.out.print("Enter New Pin: ");
                        Entered_Pin = Sc.nextInt();
                        System.out.print("Please Re-Enter The Pin To Confirm: ");
                        Pin = Sc.nextInt();
                        while (true) {
                            if (Entered_Pin != Pin) {
                                System.out.println("Pin Does Not Match\nPlease Re-Enter The Pin");
                                Pin = Sc.nextInt();
                            } else {
                                System.out.println("Pin Reset Successful.");
                                break;
                            }
                        }
                    } else {
                        System.out.println("The Entered Pin Is Incorrect");
                    }
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invaild Input\n");
                    break;
            }
        }
    }

    public static void main(String[] args) {
        ATM Obj = new ATM();
        Obj.ATM_Process();
    }
}

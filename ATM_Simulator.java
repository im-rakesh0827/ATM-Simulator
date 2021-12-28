import java.util.Scanner;
public class ATM_Simulator {
    private static Scanner in ;
    private static float balance = 836100;
    // private static int anotherTransaction;
    public static void main(String args[]) {
        in = new Scanner(System.in);
        transaction();
    }



    private static void transaction() {
        int choice;
        System.out.println("Please select an option :-> ");
        System.out.print("  1. Withdraw");
        System.out.print("  2. Deposit");
        System.out.println("  3. Balance");
        System.out.print("Your choice :-> ");
        choice = in.nextInt();
        switch (choice) {
            case 1:
                float amount;
                System.out.print("Please enter amount to withdraw :-> ");
                amount = in .nextFloat();
                if (amount > balance || amount == 0) {
                    System.out.println("You have insufficient funds : \n\n");
                    anotherTransaction(); // ask if they want another transaction
                } else {
                    // update balance
                    balance = balance - amount;
                    System.out.println("You have withdrawn -> " + amount + "\nYour new balance is " + balance + "\n");
                    anotherTransaction();
                }
                break;
            case 2:
                //This is for depositing : 
                float deposit;
                System.out.print("Please enter amount you want to deposit :-> ");
                deposit = in .nextFloat();
                // update balance
                balance = deposit + balance;
                System.out.println("You have successfully deposited :-> " + deposit);
                System.out.println("Your new balance is :-> " + balance );
                anotherTransaction();
                break;
            case 3:
                //This is to be performed to check account balance : 
                System.out.println("Your balance is -> " + balance + "\n");
                anotherTransaction();
                break;
            default:
                System.out.println("Invalid option : \n\n");
                anotherTransaction();
                break;
        }
    }


    private static void anotherTransaction(){
        System.out.println("\nPress :-> 1 : For another transaction     2 : To Exit");
        System.out.print("Your choice : ");
        int choice = in.nextInt();
        if (choice == 1) {
            transaction(); 
            // call transaction method
        } else if (choice == 2) {
            System.out.println("Thanks for choosing us. Good Bye!");
        } else {
            System.out.println("Choose valid choice : \n\n");
            anotherTransaction();
        }
    }
}
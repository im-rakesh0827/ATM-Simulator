import java.util.Scanner;
public class ATM{
    
    public static void main(String[] args) {
        String userName = "Acoustic Rakesh";
        String password = "Rakesh@1234";
        String bankName = "Apna Bank";
        long userBalance = 500000000000000L;
 
        Scanner bankScanner = new Scanner(System.in);
        System.out.println("\nWelcome to " + bankName);
        
        System.out.print("Enter Your PIN Number : ");
        String enteredPassword = bankScanner.nextLine();
        
        if (enteredPassword.equalsIgnoreCase(password)) {
            System.out.println("Welcome : " + userName);
            System.out.println("Choose an options : ");

            System.out.println("1: Show Balance ");
            System.out.println("2: Deposit Amount");
            System.out.println("3: Withdraw Amount ");
            System.out.print("Your choice : ");
            int userChoice = bankScanner.nextInt();
            if (userChoice == 1){
                System.out.println("Your Current Balance is : " + userBalance);
            } else if (userChoice == 2){
                System.out.println("Enter the amount you want to deposit : ");
                double depositAmount = bankScanner.nextDouble();
                userBalance += depositAmount;
                System.out.println("You have successfully deposited " + depositAmount
                        + " \nNow your balnce is " + userBalance);
            } else if (userChoice == 3) {
                System.out.println("Please Enter the Amount to Witdraw");
                double withdrawAmount = bankScanner.nextDouble();
                
                if (withdrawAmount > userBalance) {
                    System.out.println("Insufficient Balance : Please Try Again");
                } else {
                    userBalance -= withdrawAmount;
                    System.out.println("You have successfully withdraw " + withdrawAmount
                            + " \nNow your current balnce is " + userBalance);
                }
            }
 
        }
 
    }
 
}
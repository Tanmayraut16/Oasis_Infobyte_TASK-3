package Oasis;

import java.util.*;

public class MainClass {
    
    public static void main(String[] args) {
        AtmOperationInterf op = new AtmOperationImpl();

        int atmnumber = 160204;
        int atmpin = 4545;

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("\n\n\t\tWELCOME !!!!!!!!!");
            System.out.print("\nEnter ATM Number : ");
            int atmNumber = sc.nextInt();
            System.out.print("Enter ATM Pin : ");
            int atmPin = sc.nextInt();
            System.out.println();

            if((atmnumber == atmNumber) && (atmpin == atmPin)){
                while(true){
                    System.out.println("1. View Balance");
                    System.out.println("2. Withdraw Amount");
                    System.out.println("3. Deposit Amount");
                    System.out.println("4. View Ministatement");
                    System.out.println("5. Exit");

                    System.out.println("\nEnter Choice");
                    int choice = sc.nextInt();

                    if(choice == 1){
                        op.viewBalance();
                    }
                    else if(choice == 2){
                        System.out.println("\nEnter Amount to Withdraw ");
                        double withdrawAmount = sc.nextDouble();
                        op.withdrawAmount(withdrawAmount);
                        System.out.println();
                    }
                    else if(choice == 3){
                        System.out.println("\nEnter Amount to Deposit");
                        double depositAmount = sc.nextDouble();
                        op.depositAmount(depositAmount);
                        System.out.println();
                    }
                    else if(choice == 4){
                        op.viewMiniStatement();
                        System.out.println();
                    }
                    else if(choice == 5){
                        System.out.println("\n\t\tCollect your Card\n\t\t     Thank You");
                        System.exit(0);
                    }
                    else{
                        System.out.println("\nPlease Enter Correct Choice");
                    }
                }
            }else{
                System.out.println("\nIncorrect ATM Number or Pin");
                System.exit(0);
            }
        }
    }
}

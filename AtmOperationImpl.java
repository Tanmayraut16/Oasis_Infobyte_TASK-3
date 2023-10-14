package Oasis;

import java.util.HashMap;
import java.util.Map;

public class AtmOperationImpl implements AtmOperationInterf {
    ATM atm = new ATM();

    Map<Double, String> minstmt = new HashMap<>();

    @Override
    public void viewBalance() {
        System.out.println("Available Balance is : " + atm.getBalance());
        System.out.println();
    }

    @Override
    public void withdrawAmount(double withdrawAmount) {
        if(withdrawAmount <= atm.getBalance()){
            minstmt.put(withdrawAmount, " Amount Withdrwan");
            System.out.println("\tCollect the Cash "+withdrawAmount);
            System.out.println();
            atm.setBalance(atm.getBalance() - withdrawAmount);
            viewBalance();
        }
        else{
            System.out.println("\t\tInsufficient balance\n");
        }
        
    }

    @Override
    public void depositAmount(double depositAmount) {
        minstmt.put(depositAmount, " Amount Deposited");
        System.out.println(depositAmount + " Deposited Successfully");
        System.out.println();
        atm.setBalance((atm.getBalance()+depositAmount));
        viewBalance();
    }

    @Override
    public void viewMiniStatement() {
        for(Map.Entry<Double, String> m:minstmt.entrySet()){
            System.out.println(m.getKey() +" "+ m.getValue());
        }
        System.out.println();
    }
    
}

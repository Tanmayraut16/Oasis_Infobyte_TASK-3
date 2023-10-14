package Oasis;

public class ATM {
    private double balance;
    private double depositAmount;
    private double withdrawAmount;

    //default constructor
    public ATM(){
        
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Setter for balance
    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Getter for depositAmount
    public double getDepositAmount() {
        return depositAmount;
    }

    // Setter for depositAmount
    public void setDepositAmount(double depositAmount) {
        this.depositAmount = depositAmount;
    }

    // Getter for withdrawAmount
    public double getWithdrawAmount() {
        return withdrawAmount;
    }

    // Setter for withdrawAmount
    public void setWithdrawAmount(double withdrawAmount) {
        this.withdrawAmount = withdrawAmount;
    }

}

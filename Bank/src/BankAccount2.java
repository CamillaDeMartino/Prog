

public class BankAccount2{

    public BankAccount2(double soldi){

        accountNumber = lastAssignedNumber;
        lastAssignedNumber++;   //genera il successivo numero di conto
        balance = soldi;
        totDeposit = 0;

    }

    public BankAccount2(){
        this(0);
    }

    public void deposit(double amount){
        balance = balance + amount;
        totDeposit++;
    }

    public void withdraw(double prelievo){
        balance = balance - prelievo;
    }

    public double getBalance() {
        return balance;
    }


    public int getTotDeposit(){
        return totDeposit;
    }


    public String getNumCorr(){
        String formattNumber = String.format("%010d", accountNumber);
        return formattNumber;
    }

    public void setTax(boolean t){
        tax = t;
    }

    public boolean getIsTax(){
        if(tax)
            return true;

        return false;
    }

    public double convert(){

        return getBalance() * DOLLAR;
    }


    private double balance;
    private boolean tax;
    private int totDeposit;
    private final int accountNumber;
    private static int lastAssignedNumber = 0;      //ciasun oggetto di BankAccount ha proprio saldo
    //e la propria variabile accountNumber
    //però esiste una sola copia della variabile lastAssignedNumber

    private static double DOLLAR = 0.97;


}


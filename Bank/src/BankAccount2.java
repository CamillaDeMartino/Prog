

public class BankAccount2 implements Measurable{

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

        try{
            //controllo del saldo
            if(prelievo > getBalance()) {
                //lancio dell'eccezione
                throw new NoFundsException();
            }
            balance = balance - prelievo;
        }
        catch(NoFundsException exc){
            System.out.println(exc.toString());
        }

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

    @Override
    public double getMeasure() {
        return balance;
    }

    private double balance;
    private boolean tax;
    private int totDeposit;
    private final int accountNumber;
    private static int lastAssignedNumber = 0;      //ciasun oggetto di BankAccount ha proprio saldo
    //e la propria variabile accountNumber
    //però esiste una sola copia della variabile lastAssignedNumber

    private static double DOLLAR = 0.97;


    /*Esercizio con classi anonime e enumerazione*/


    //classi anonime che fanno l'overirde dell'interfaccia;
    CurrencyConverter JPYConverter = new CurrencyConverter() {
        @Override
        public double convert(double v) {
            return v * 139.96;
        }
    };

    CurrencyConverter GBPConverter = new CurrencyConverter() {
        @Override
        public double convert(double v) {
            return v * 0.85;
        }
    };
    public double getJPY(double value){return JPYConverter.convert(value);}
    public double getGBP(double value){return GBPConverter.convert(value);}

    private EURConverter euro = new EURConverter();
    public void toConvert(Currency value){

        switch (value){
            case EURO:
                System.out.println("Converito in euro -> " + euro.convert(getBalance()));
                break;
            case YEN:
                System.out.println("Convertito un yen -> " + JPYConverter.convert(getBalance()));
                break;
            case STERLINE:
                System.out.println("Converito in sterline -> " + GBPConverter.convert(getBalance()));
                break;
            default:
                System.out.println("Conversione non disponibile");

        }


    }


}



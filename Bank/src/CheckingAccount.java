public class CheckingAccount extends  BankAccount2{

    private static final double TRANSACTION_FEE = 2.0;
    private static final int FREE_TRANSACTION = 3;
    private int transactionCount;
    private double fees;

    public CheckingAccount(int initialBalance){
        //creo il costruttore
        super(initialBalance);
        transactionCount = 0;
    }
    //creiamo un override dei prelievi poiché in questa funzione segna quanti prelievi e depositi sto facendo
    //per aggiornare il prelievo e il deposito devo richiamare il metodo della superclassse con super.metodo
    @Override
    public void withdraw(double prelievo) {
        transactionCount++;
        super.withdraw(prelievo);
    }

    @Override
    public void deposit(double amount) {
        transactionCount++;
        super.deposit(amount);
    }

    public void addFee(){
        System.out.println("\nNumero di transazioni: "+ transactionCount);
        if(transactionCount > FREE_TRANSACTION )
        {
            fees = TRANSACTION_FEE * (transactionCount - FREE_TRANSACTION);
            super.withdraw(fees);
            transactionCount = 0;
            System.out.println("Commisione aggiunta");
        }
        else
            System.out.println("Nessuna commissione applicata");
    }
}

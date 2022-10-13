

public class SavingsAccountTest{

    public static void main(String[] args)
    {
        Bank Unicredit = new Bank();

        Unicredit.getArray(1).deposit(100);
        Unicredit.getArray(1).deposit(200);
        Unicredit.getArray(1).addInterest();

        Unicredit.getArray(2).deposit(150);
        Unicredit.getArray(2).deposit(200);
        Unicredit.getArray(2).addInterest();


        Unicredit.addTax();
        System.out.println("Bilancio di persona 1 = " + Unicredit.getArray(1).getBalance());
        System.out.println("Numero conto corrente 1 = " + Unicredit.getArray(1).getNumCorr());

        System.out.println("Bilancio di persona 2 = " + Unicredit.getArray(2).getBalance());
        System.out.println("Numero conto corrente 2 = " + Unicredit.getArray(2).getNumCorr());


        System.out.println("Bilancio totale della banca = " + Unicredit.totBalance());
        System.out.println("Il totale dei depositi =  " + Unicredit.Depositi());

        System.out.println("Cnvertire saldo di conto " + Unicredit.getArray(2).getNumCorr());
        System.out.println("Saldo in euro: " + Unicredit.getArray(2).getBalance());
        System.out.println("Saldo convertito in dollari: "+ Unicredit.getArray(2).convert());


    }

}
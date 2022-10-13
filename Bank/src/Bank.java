/*
  Modificare BankAccount e SavingAccount inserendo un array di conti correnti.
* Calcolare :
* - Bilancio totale della banca;
* - Contare il numero di depositi
* - Stampare il numero di conto corrente usando sempre 10 cifre
* - Tassare i conti corrente con più di 5000$
* - Convertire la valuta di un singolo conto corrente
*
* */

public class Bank{
    private static SavingsAccount [] array;
    private double tot = 0;
    private int tot2 = 0;

    public Bank(){
        array = new SavingsAccount[4];
        buildArray();
    }

    public SavingsAccount getArray(int i) {
        return array[i];
    }

    public void buildArray(){
        for(int i = 0; i < array.length; i++ )
        {
            array[i] = new SavingsAccount(50);
        }
    }
    public double totBalance(){
        for(int i = 0; i < array.length; i++)
        {
            tot += array[i].getBalance();
        }

        return tot;
    }

    public int Depositi(){
        for(int i = 0; i < array.length; i++)
        {
            tot2 += array[i].getTotDeposit();
        }
        return tot2;
    }

    public void addTax(){
        for(int i = 0; i < array.length; i++)
        {
            if(array[i].getBalance() > 500 && !array[i].getIsTax())
            {
                array[i].withdraw(array[i].getBalance() - array[i].getBalance() * 0.2);
                array[i].setTax(true);

                System.out.println("Utente n. " + array[i].getNumCorr() + " tassato" );
            }
        }
    }



}
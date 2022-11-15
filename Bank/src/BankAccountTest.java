/*
    - Creare una nuova eccezione chiamata NoFundsException;
    - Modificare BankAccountù7 in modo da lanciare l'errore sul metodo withdraw quando saldo < 0
    - Gestire l'eccezione in modo da avvisare l'utente che il conto è in rosso
*/

public class BankAccountTest {

    public static void main(String[] args){
        BankAccount2 bank = new BankAccount2();
        bank.deposit(10);
        bank.deposit(30);

        System.out.println("Saldo = "+ bank.getBalance());

        bank.withdraw(50);
        System.out.println("Saldo = "+bank.getBalance());
    }
}

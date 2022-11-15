/*
    - Creare una nuova eccezione chiamata NoFundsException;
    - Modificare BankAccountù7 in modo da lanciare l'errore sul metodo withdraw quando saldo < 0
    - Gestire l'eccezione in modo da avvisare l'utente che il conto è in rosso
*/

public class BankAccountTest {

    public static void main(String[] args) {
        BankAccount2 bank = new BankAccount2();
        bank.deposit(10);
        bank.deposit(30);

        System.out.println("Saldo = " + bank.getBalance());

        bank.withdraw(50);
        System.out.println("Saldo = " + bank.getBalance());



        /*
         * Creare un'interfaccia CurrencyConverter con un metodo converter
         *   - si occuperà di effettuare le conversioni tra valute
         *
         * Creare una classe EURConverter che implementa CurrencyConverter
         *   -1 USD = 0,97 EUR
         *
         * In BankAccount creare due variabili tramite classi anonime
         *   - JPYConverter di tipo CurrencyConverter:
         *       1 USD = 139,96 JPY(yen)
         *   - GBPConverter di tipo CurrencyConverter:
         *       1 USD = 0,85 GBP(sterlina)
         *
         * Inserire un  metodo convertTO che capisca tramite enumeration il tipo di conversione da eseguire:
         *   - enum Currency{...}
         */

        EURConverter prova = new EURConverter();

        System.out.println("\nConvertiti 2$  = euro " + prova.convert(2));
        System.out.println("Convertiti 2$ = yen "+bank.getJPY(2));
        System.out.println("Convertiti 2$ = sterline "+bank.getGBP(2));

        //SWITCH
        System.out.println("\nBilancio ");
        bank.toConvert(Currency.EURO);

        System.out.println("Bilancio ");
        bank.toConvert(Currency.YEN);

        System.out.println("Bilancio " );
        bank.toConvert(Currency.STERLINE);
    }
}
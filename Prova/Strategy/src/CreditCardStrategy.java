
import java.time.LocalDate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CreditCardStrategy implements PaymentStrategy {
    private String nome;
    private String numeroCarta;
    private String cvv;
    private LocalDate dataScadenza;
    public CreditCardStrategy(String nome, String numeroCarta, String cvv, LocalDate dataScadenza){
        this.nome = nome;
        this.numeroCarta = numeroCarta;
        this.cvv = cvv;
        this.dataScadenza = dataScadenza;
    }

    //controlla che la carta sia valida
    private boolean checkCreditCardNumber() {

        if (numeroCarta == null || numeroCarta.length() != 16) {
            return false;
        }

        //controlla se il numero della carta di credito contiene solo cifre
        Pattern creditCardPattern = Pattern.compile("[a-z]", Pattern.CASE_INSENSITIVE);
        Matcher creditCardMatcher = creditCardPattern.matcher(numeroCarta);
        return !creditCardMatcher.find();
    }

    //controlla che la carta non sia scaduta
    private boolean checkCreditCardExpirationDate() {
        return dataScadenza.isAfter(LocalDate.now());
    }

    //controlla che il cvv sia valido
    private boolean checkCreditCardCVV() {

        if (cvv == null || cvv.length() != 3)
            return false;

        // controlla che contenga solo cifre
        Pattern creditCardCVVPattern = Pattern.compile("[a-z]", Pattern.CASE_INSENSITIVE);
        Matcher creditCardCVVMatcher = creditCardCVVPattern.matcher(cvv);
        return !creditCardCVVMatcher.find();
    }

    public boolean checkPaymentMethodData() {

        if (!checkCreditCardNumber()) return false;
        if (!checkCreditCardExpirationDate()) return false;
        if (!checkCreditCardCVV()) return false;
        return true;
    }

    @Override
    public void pay(double amount) {
        if (checkPaymentMethodData())
            System.out.println(amount + " pagamento con successo con carta di credito");
        else
            System.out.println("credenziali non valide");
    }
}
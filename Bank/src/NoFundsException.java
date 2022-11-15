@SuppressWarnings("serial")
public class NoFundsException extends Exception {

    public  NoFundsException() {
        super("Saldo minimo");
    }

    public String toString(){
        return getMessage() + " : conto in rosso!";
    }
}

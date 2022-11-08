
/*
    Costruiamo una sottoclasse SavingsAccount
    per descrivere un conto bancario che garantisce
    un tasso fisso sui depositi(interessi)
*/

public class SavingsAccount extends BankAccount2{

    public SavingsAccount(double i) {
        interesse = i;
    }

    public void addInterest() {
        this.deposit(this.getBalance() * interesse/100);
    }

    private final double interesse;

}
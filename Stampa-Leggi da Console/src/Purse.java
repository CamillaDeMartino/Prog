public class Purse {
    private int nickels = 0;
    private int dimes = 0;
    private int quarters = 0;

    public Purse() {
    }

    public void addNickels(int var1) {
        this.nickels += var1;
    }

    public void addDimens(int var1) {
        this.dimes += var1;
    }

    public void addQuarter(int var1) {
        this.quarters += var1;
    }

    public double getTotal() {
        return (double)this.nickels * 0.05 + (double)this.dimes * 0.01 + (double)this.quarters * 0.25;
    }
}

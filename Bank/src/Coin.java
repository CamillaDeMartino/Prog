public class Coin implements Measurable{

    public Coin(double amm){
        value = amm;
    }

    @Override
    public double getMeasure() {
        return value;
    }

    @Override
    public boolean equals(Object obj){
        Coin i = (Coin) obj;

        if(i.getMeasure() == this.getMeasure())
            return true;

        return false;
    }

    private double value;
}

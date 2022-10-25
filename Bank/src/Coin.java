public class Coin implements Measurable{

    public Coin(double amm){
        value = amm;
    }

    @Override
    public double getMeasure() {
        return value;
    }

    private double value;
}

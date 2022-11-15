public class EURConverter implements  CurrencyConverter{

    @Override
    public double convert(double value) {
        return value * 0.97;
    }
}

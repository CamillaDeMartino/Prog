public class DataSet {

    public DataSet(){
        count = 0;
        sum = 0;
    }
    public void add(Measurable x){
        sum += x.getMeasure();
        if(count == 0 || maximum.getMeasure() < x.getMeasure()){
            maximum = x;
            count++;
        }
    }

    public double getSum(){
        return sum;
    }

    public Measurable getMaximum(){
        return maximum;
    }


    public double getAverage(){
        if(count == 0)
            return 0;
        else
            return sum/count;
    }
    private double sum;
    private Measurable maximum;
    private int count;
}

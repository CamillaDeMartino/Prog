public class DataSetTest {
    public static void main(String[] args){

        DataSet bankData = new DataSet();

        bankData.add(new BankAccount2(10));
        bankData.add(new BankAccount2(100));
        bankData.add(new BankAccount2(200));
        Measurable max = bankData.getMaximum();

        System.out.println("\nSomma dei bilanci: " + bankData.getSum());
        System.out.println("Bilancio più alto: " + max.getMeasure());
        System.out.println("La media è : " + bankData.getAverage());

        DataSet bankData2 = new DataSet();

        bankData2.add(new Coin(50));
        bankData2.add(new Coin(500));
        bankData2.add(new Coin(100));
        max = bankData2.getMaximum();

        System.out.println("\nTotale dei soldi: " + bankData2.getSum());
        System.out.println("Soldi massimi: "+ max.getMeasure());
        System.out.println("La media è : " + bankData2.getAverage());

    }


}

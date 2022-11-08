import java.util.ArrayList;

public class Purse {

    private ArrayList<Coin> coins = new ArrayList<Coin>();

    //aggiungi elemento nella lista
    public void add(Coin value){
        coins.add(value);
    }

    //ottenere la somma degli elementi dell'array
    public double getTotal(){
        double count = 0;

        for(int i = 0; i < coins.size(); i++){
            count += coins.get(i).getMeasure();
        }
        return count;
    }

    //quante monete ci sono (quanti elementi ci sono nell'array)
    public void count(){
        System.out.println("Numero di monete è: " + coins.size());
    }

    //cerca la moneta passata in input
    public boolean find(Coin value){
        return coins.contains(value);

    }


    //sommare il numero di monete uguali a value
    public double count(Coin value){
        double total = 0;
        for(Coin i : coins){
            if(coins.contains(value))
                total++;
        }

        return total;
    }


    public Coin getMaximum(){

        Coin max = coins.get(0);

        for(int i = 1; i < coins.size(); i++){
            if(coins.get(i).getMeasure() > max.getMeasure())
                max = coins.get(i);
        }

        return max;

    }
}

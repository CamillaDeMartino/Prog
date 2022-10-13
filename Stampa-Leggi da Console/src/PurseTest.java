/*
 Implementare una classe Purse con i seguenti metodi
    - addNickels
    - addDimes
    - addQuarter
    - getTotal
*/


import javax.swing.JOptionPane;
// import java.io.*;            //includi tutte le librerie di java.io
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PurseTest{

    public static void main(String[] arg) throws IOException
    {
        Purse myPurse = new Purse();

        /*
        myPurse.addNickels(3);
        myPurse.addDimens(4);
        myPurse.addQuarter(4);
        */

        //System.out.println("Il totale e' : " + myPurse.getTotal());


        //includendo la libreria JoptionPane

       /*
        String input = JOptionPane.showInputDialog("Quanti nickels vuoi inserire?");
        int count = Integer.parseInt(input);


        String input1 = JOptionPane.showInputDialog("Quanti dimes vuoi inserire?");
        int count1 = Integer.parseInt(input1);


        String input2= JOptionPane.showInputDialog("Quanti quarter vuoi inserire?");
        int count2 = Integer.parseInt(input2);

        myPurse.addNickels(count);
        myPurse.addDimens(count1);
        myPurse.addQuarter(count2);

        System.out.println("Il totale e' : " + myPurse.getTotal());

        */

        System.out.println("Quanti nickels hai?");
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader console = new BufferedReader(reader);
        String input = console.readLine();
        myPurse.addNickels(Integer.parseInt(input));

        System.out.println("Quanti dimes hai?");
        input = console.readLine();
        myPurse.addDimens(Integer.parseInt(input));


        System.out.println("Quanti quarti hai?");
        input = console.readLine();
        myPurse.addQuarter(Integer.parseInt(input));


        System.out.println("Il totale e' : " + myPurse.getTotal());
    }

}

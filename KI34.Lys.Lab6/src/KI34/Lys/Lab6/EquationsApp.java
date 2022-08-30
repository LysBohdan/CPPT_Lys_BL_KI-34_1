/**
 * lab 6 package
 */
package KI34.Lys.Lab6;
import java.util.*;
import java.io.*;

/**
 * Class <code>EquationsApp</code> Implements driver for Equations class
 * @author Lys Bohdan
 * @version 1.0
 */
public class EquationsApp {
    /**
     * @param args function's parameters
     */
    public static void main(String[] args) throws IOException  {
        try {
            Equations obj = new Equations();
            Scanner s = new Scanner(System.in);
            System.out.print("Enter data: ");
            int data = s.nextInt();
            obj.calculate(data);
            System.out.println("Result is: " + obj.getResult());

            obj.writeResTxt("textRes.txt");
            obj.writeResBin("BinRes.bin");

            obj.readResBin("BinRes.bin");
            System.out.println("Result is: " + obj.getResult());
            obj.readResTxt("textRes.txt");
            System.out.println("Result is: " + obj.getResult());
        } catch (CalcException ex) {
            System.out.print(ex.getMessage());
        }


    }
}
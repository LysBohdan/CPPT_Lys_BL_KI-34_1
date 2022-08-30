/**
 * lab 5 package
 */
package KI34.Lys.Lab5;
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
    public static void main(String[] args) {
        try
        {
            Scanner myScanner = new Scanner(System.in);
            PrintWriter myWriter = new PrintWriter("Result.txt");
            try
            {
                try
                {
                    Equations equa = new Equations();
                    System.out.print("Enter X: ");
                    myWriter.print(equa.calculate(myScanner.nextInt()));
                }
                finally
                {
                    // Цей блок виконається за будь-яких обставин
                    myWriter.flush();
                    myWriter.close();
                }
            }
            catch (CalcException ex)
            {
                // Блок перехоплює помилки обчислень виразу
                System.out.print(ex.getMessage());
            }
        }
        catch (FileNotFoundException ex)
        {
            // Блок перехоплює помилки роботи з файлом навіть якщо вони
            // виникли у блоці finally
            System.out.print("Exception reason: Perhaps wrong file path");
        }

    }
}
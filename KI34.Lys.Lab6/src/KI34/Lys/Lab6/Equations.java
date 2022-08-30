/**
 * lab 6 package
 */
package KI34.Lys.Lab6;

import java.io.*;
import java.util.Locale;
import java.util.Scanner;

/**
 * Class <code>Equations</code> implements method for tan(x)/ctg(x) expression calculation and methods for writing and reading files
 * @author Lys Bohdan
 * @version 1.0
 */

public class Equations {
    private double result;

    /**
     * Method writes txt file
     * @param fName File's name
     * @throws FileNotFoundException error
     */

    public void writeResTxt(String fName) throws FileNotFoundException {
        PrintWriter f = new PrintWriter(fName);
        f.printf("%f", result);
        f.close();
    }

    /**
     * Method read txt file
     * @param fName File's name
     */
    public void readResTxt(String fName) {
        try {
            File f = new File(fName);
            if (f.exists()) {
                Scanner s = new Scanner(f);
                s.useLocale(Locale.getDefault());
                result = s.nextDouble();
                s.close();
            } else {
                throw new FileNotFoundException("File " + fName + "not found");
            }
        } catch (FileNotFoundException ex) {
            System.out.print(ex.getMessage());
        }
    }

    /**
     * Method reads bin file
     * @param fName File's name
     * @throws IOException error
     */
    public void readResBin(String fName) throws IOException {
        DataInputStream f = new DataInputStream(new FileInputStream(fName));
        result = f.readDouble();
        f.close();
    }

    /**
     * Method writes bin file
     * @param fName File's name
     * @throws IOException error
     */
    public void writeResBin(String fName) throws IOException {
        DataOutputStream f = new DataOutputStream(new FileOutputStream(fName));
        f.writeDouble(result);
        f.close();
    }

    /**
     * Method calculates the ctg(x)/tg(x) expression
     * @param x Angle in degrees
     * @throws CalcException
     */
    public double calculate(int x) throws CalcException {
        double radTg, radCtg;
        radTg = x * Math.PI / 180.0;
        radCtg = x * Math.PI / 180.0;
        try {
            result = Math.tan(radTg) / (1.0 / Math.tan(radCtg));


            if (result == Double.NaN || result == Double.NEGATIVE_INFINITY || result == Double.POSITIVE_INFINITY || x == 0 || x % 90 == 0)
                throw new ArithmeticException();
        } catch (ArithmeticException ex) {

            if (x == 0 || x % 180 == 0)
                throw new CalcException("Exception reason: Illegal value of X for cotangent calculation");
            else if (x % 90 == 0)
                throw new CalcException("Exception reason: Illegal value of X for tangent calculation");
            else
                throw new CalcException("Unknown reason of the exception during exception calculation");
        }

        return result;
    }

    /**
     * Method get the result of the expression
     */
    public double getResult() {
        return result;
    }

}


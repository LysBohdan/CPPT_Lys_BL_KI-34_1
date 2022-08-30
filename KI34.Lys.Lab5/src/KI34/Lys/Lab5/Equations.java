/**
 * lab 5 package
 */
package KI34.Lys.Lab5;

/**
 * Class <code>Equations</code> implements method for ctg(x)/tg(x) expression
 * calculation
 * @author Lys Bohdan
 * @version 1.0
 */
public class Equations {
    /**
     * Method calculates the ctg(x)/tg(x) expression
     * @param x Angle in degrees
     * @throws CalcException
     */
    public double calculate(int x) throws CalcException
    {
        double y, radTg, radCtg;
        radTg = x * Math.PI / 180.0;
        radCtg = x * Math.PI / 180.0;
        try {
            y = Math.tan(radTg) / (1.0 / Math.tan(radCtg));

            // Якщо результат не є числом, то генеруємо виключення
            if (y==Double.NaN || y==Double.NEGATIVE_INFINITY || y==Double.POSITIVE_INFINITY || x == 0 || x % 90 == 0)
                throw new ArithmeticException();
        }
        catch (ArithmeticException ex) {
            // створимо виключення вищого рівня з поясненням причини
            // виникнення помилки
            if (x == 0 || x % 180 == 0)
                throw new CalcException("Exception reason: Illegal value of X for cotangent calculation");
            else if (x % 90 == 0)
                throw new CalcException("Exception reason: Illegal value of X for tangent calculation");
            else
                throw new CalcException("Unknown reason of the exception during exception calculation");
        }

        return y;
    }
}

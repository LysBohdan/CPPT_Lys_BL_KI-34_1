/**
 * lab 5 package
 */
package KI34.Lys.Lab5;
/**
 * Class <code>CalcException</code> more precises ArithmeticException
 * @author Lys Bohdan
 * @version 1.0
 */
public class CalcException extends ArithmeticException{
    public CalcException(){}
    public CalcException(String cause)
    {
        super(cause);
    }
}

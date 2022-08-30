/**
 * lab 4 package
 */

package KI34.Lys.Lab4;

/**
 * Interface <code>PresForce</code> extends Resource
 * * @author Lys Bohdan
 *  * @version 1.0
 **/
// оголошуємо інтерфейс PresForce, що успадковує інтерфейс Resource
public interface PresForce extends Resource{
    void aboveTheNorm (int touches); // прототип методу
    int error = 3; // константа
}



/**
 * lab 7 package
 */
package KI34.Lys.Lab7;

/**
 * Interface <code>Info</code> extends Comparable
 * * @author Lys Bohdan
 *  * @version 1.0
 **/
public interface Info extends Comparable<Info> {
    public String getName();
    public int getSize();
    public void print();
}

/**
 * lab 7 package
 */
package KI34.Lys.Lab7;

import java.util.*;

/**
 * Class <code>ShopCenter</code> implements Shopping Center
 * * @author Lys Bohdan
 *  * @version 1.0
 **/
public class ShopCenter <T extends Info> {
    private ArrayList<T> arr;

    /**
     * Constructor
     */
    public ShopCenter()
    {
        arr = new ArrayList<T>();
    }

    /**
     * Method simulates finding the largest shop
     */
    public T findMax()
    {
        if (!arr.isEmpty())
        {
            T max = arr.get(0);
            for (int i=1; i< arr.size(); i++)
            {
                if ( arr.get(i).compareTo(max) > 0 )
                    max = arr.get(i);
            }
            return max;
        }
        return null;
    }

    /**
     * Method simulates adding shop
     */
    public void AddShop(T info)
    {
        arr.add(info);
        System.out.print("Shop added: ");
        info.print();
    }

    /**
     * Method simulates deleting shop
     */
    public void DeleteData(int i)
    {
        arr.remove(i);
    }

}

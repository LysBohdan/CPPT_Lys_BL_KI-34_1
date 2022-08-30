/**
 * lab 7 package
 */
package KI34.Lys.Lab7;

/**
 * Class <code>Entertainment</code> implements Info
 * * @author Lys Bohdan
 *  * @version 1.0
 **/
public class Entertainment implements Info{
    private String entertainmentShopName;
    private int entertainmentSize;;

    /**
     * Constructor
     * @param entertainmentShopName <code>entertainmentShopName</code> Name of entertainment shop
     * @param entertainmentSize <code>entertainmentSize</code> entertainment shop`s size
     */
    public Entertainment(String entertainmentShopName, int entertainmentSize)
    {
        this.entertainmentShopName = entertainmentShopName;
        this.entertainmentSize = entertainmentSize;
    }

    /**
     * Method returns entertainment shop`s name
     * @return entertainment shop`s name
     */
    public String getName() {
        return entertainmentShopName;
    }

    /**
     * Method sets the new entertainment shop`s name
     * @param entertainmentShopName <code>entertainmentShopName</code> entertainment shop`s name
     */
    public void setEntertainmentShopName(String entertainmentShopName) {
        this.entertainmentShopName = entertainmentShopName;
    }

    /**
     * Method returns entertainment shop`s size
     * @return entertainment shop`s size
     */
    public int getSize() {
        return entertainmentSize;
    }

    /**
     * Method sets the new entertainment shop`s size
     * @param entertainmentSize <code>entertainmentSize</code> entertainment shop`s size
     */
    public void setEntertainmentSize(int entertainmentSize) {
        this.entertainmentSize = entertainmentSize;
    }

    /**
     * Method simulates comparing entertainment shop`s size
     */
    public int compareTo(Info point)
    {
        Integer s = entertainmentSize;
        return s.compareTo(point.getSize());
    }

    /**
     * Method simulates printing info about entertainment shop
     */
    public void print()
    {
        System.out.print("\nEntertainment Shop Name: " + entertainmentShopName + ", Entertainment Shop Size: " + entertainmentSize + "m2;\n");
    }
}

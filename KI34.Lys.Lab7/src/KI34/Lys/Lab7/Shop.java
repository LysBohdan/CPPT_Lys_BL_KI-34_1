/**
 * lab 7 package
 */
package KI34.Lys.Lab7;

/**
 * Class <code>Shop</code> implements Info
 * * @author Lys Bohdan
 *  * @version 1.0
 **/
public class Shop implements Info{
    private String shopName;
    private int floor;
    private int size;

    /**
     * Constructor
     * @param shopName <code>shopName</code> Name of shop
     * @param floor <code>floor</code> Number of floor
     * @param size <code>size</code> Size of shop
     */
    public Shop(String shopName, int floor, int size)
    {
        this.shopName = shopName;
        this.floor = floor;
        this.size = size;

    }

    /**
     * Method returns shop`s name
     * @return shop`s name
     */
    public String getName() {
        return shopName;
    }

    /**
     * Method sets the new shop`s name
     * @param shopName <code>shopName</code> shop`s name
     */
    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    /**
     * Method returns floor`s number
     * @return floor`s number
     */
    public int getFloor() {
        return floor;
    }

    /**
     * Method sets the new floor`s number
     * @param floor <code>floor</code> floor`s number
     */
    public void setFloor(int floor) {
        this.floor = floor;
    }

    /**
     * Method returns shop`s size
     * @return shop`s size
     */
    @Override
    public int getSize() {
        return size;
    }

    /**
     * Method sets the new shop`s size
     * @param size <code>size</code> shop`s size
     */
    public void setSize(int size) {
        this.size = size;
    }

    /**
     * Method simulates comparing shop`s size
     */
    public int compareTo(Info point)
    {
        Integer s = size;
        return s.compareTo(point.getSize());
    }

    /**
     * Method simulates printing info about shop
     */
    public void print()
    {
        System.out.print("\nShop: " + shopName + ", Floor: " + floor + ", Shop Size: " + size + "m2;\n");
    }
}

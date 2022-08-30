/**
 * lab 7 package
 */
package KI34.Lys.Lab7;

/**
 * Shopping centre Application class implements main method for Shopping centre
 * class possibilities demonstration
 * @author Lys Bohdan
 * @version 1.0
 */
public class ShopCenterApp {
    /**
     * @param args param
     */
    public static void main(String[] args) {
        ShopCenter <? super Info> obj = new ShopCenter <Info>();

        obj.AddShop(new Shop("Waikiki", 1, 80));
        obj.AddShop(new Shop("Asus" , 1,75));
        obj.AddShop(new Entertainment("Kozachok" , 70));
        obj.AddShop(new Entertainment("Papashon" ,  100));

        Info result = obj.findMax();
        System.out.print("\nThe greatest shop in shopping centre is: ");
        result.print();
    }
}
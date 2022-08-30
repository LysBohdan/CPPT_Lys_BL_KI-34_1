/**
 * lab 4 package
 */

package KI34.Lys.Lab4;

import java.io.FileNotFoundException;

/**
 * Class <code>TouchScreen</code> implements PresForce
 * * @author Lys Bohdan
 *  * @version 1.0
 **/
public class TouchScreen extends Monitor implements PresForce {
    private int resource;
    private final double presForceConst = 2.5;
    private double presForce;

    /**
     * Constructor
     * @throws FileNotFoundException param
     */

    public TouchScreen() throws FileNotFoundException {
        resource = 0;
        presForce = 0.0;
    }
    /**
     * Constructor
     * @param name <code>name</code> Name of monitor
     * @param diagonal <code>diagonal</code> Monitor diagonal
     * @param matrix <code>matrix</code> Monitor matrix
     * @param resolution <code>resolution</code> Monitor resolution
     * @param hz <code>hz</code> Monitor refresh rate
     * @param BrightDisplay <code>BrightDisplay</code> The brightness of the monitor display
     * @param monitorFormat <code>monitorFormat</code> Monitor screen format
     * @param resource <code>resource</code> Touch monitor resource
     * @param presForce <code>presForce</code> Optimal pressing force
     * @throws FileNotFoundException
     */

    public TouchScreen(int resource, double presForce, String name, double diagonal, String matrix, String resolution, double hz, double BrightDisplay, String monitorFormat) throws FileNotFoundException{
        super(name, diagonal, matrix, resolution, hz, BrightDisplay, monitorFormat);
        this.resource = resource;
        this.presForce = presForce;
    }

    /**
     * Method simulates changing touch monitor`s resource
     */
    public void screenResource(int touches) {
        if (status == Status.ON)
        {
            if (presForce < presForceConst) {
                resource = resource - touches;
                myWrite.println("Ресурс сенсорного монітора зменшенно на " + touches);
            } else {
                aboveTheNorm(touches);
                myWrite.println("Ресурс сенсорного монітора зменшенно на " + error * touches);
            }
        }
        else{
            myWrite.println("Екран не реагує на нажаття тому, що монітор виключено.");
        }

    }

    /**
     * Method return touch monitor`s resource
     */
    public void getResource()
    {
        System.out.println("Touch monitor resource  - " + resource);
        myWrite.println("Ресурс сенсорного монітора виведенно.");
    }

    @Override
    public void aboveTheNorm(int touches) {
        resource = resource - touches * error;
    }


}

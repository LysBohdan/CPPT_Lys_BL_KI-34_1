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
    protected int resource;
    private MonitorButton status;
    protected final double presForceConst = 2.5;
    protected double presForce;

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
     * @param brightDisplay <code>BrightDisplay</code> The brightness of the monitor display
     * @param monitorFormat <code>monitorFormat</code> Monitor screen format
     * @param resource <code>resource</code> Touch monitor resource
     * @param presForce <code>presForce</code> Optimal pressing force
     * @throws FileNotFoundException
     */

    public TouchScreen(int resource, double presForce, String name, double brightDisplay, String matrix, double diagonal, String resolution, double hz, String monitorFormat) throws FileNotFoundException{
        super(name, brightDisplay, matrix, diagonal, resolution, hz, monitorFormat);
        this.resource = resource;
        this.presForce = presForce;
        status = new MonitorButton();
    }

    /**
     * Method simulates changing touch monitor`s resource
     */
    public void screenResource(int touches) {
        if (super.getStatus().getStatus() == Status.ON)
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

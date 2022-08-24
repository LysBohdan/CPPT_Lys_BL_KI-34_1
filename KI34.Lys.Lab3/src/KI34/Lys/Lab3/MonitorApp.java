/**
 * lab 3 package
 */

package KI34.Lys.Lab3;

import static java.lang.System.out;
import java.io.*;
/**
 * Monitor Application class implements main method for Monitor
 class possibilities demonstration
 * @author Lys Bohdan
 * @version 1.0
 */

public class MonitorApp {
    /**
     * @param args param
     * @throws FileNotFoundException
     */
    public static void main(String[] args)  throws FileNotFoundException {

        Monitor object = new Monitor("MSI", 24, "LED", "1920 x 1080", 144, 100, "16:9");

        object.off_onMonitor(Status.ON);
        object.getSettings();
        object.brightDisplayPlus(25);
        object.brightDisplayMinus(63);

        object.changeMatrix("IPS");
        object.changeHz(75);
        object.changeResolution("1080x720");
        object.changeMonitorFormat("4:3");
        object.getSettings();

        object.off_onMonitor(Status.OFF);
        object.dispose();
    }
}
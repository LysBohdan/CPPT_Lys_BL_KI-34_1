/**
 * lab 3 package
 */
package KI34.Lys.Lab3;

import java.io.*;

/**
 * Class <code>MonitorButton</code> implements monitor button
 * * @author Lys Bohdan
 *  * @version 1.0
 **/
public class MonitorButton {
    private Status status;
    private PrintWriter myWrite;

    /**
     * Constructor
     * @throws FileNotFoundException param
     */
    public MonitorButton() throws FileNotFoundException {
        status = Status.OFF;
        myWrite = new PrintWriter("Log.txt");
    }
    /**
     * Method simulates monitor`s off/on
     */
    public void off_onMonitor(Status comand) {
        if (comand == Status.ON) {
            myWrite.println("Monitor on.");
            status = Status.ON;
        } else {
            status = Status.OFF;
            myWrite.println("Monitor off.");
        }
    }
    /**
     * Method returns monitor`s status off/on
     * @return monitor`s status off/on
     */
    public Status getStatus() {
        return status;
    }

    /**
     * Method sets the new monitor`s status off/on
     * @param status <code>matrix</code> monitor`s status off/on
     */
    public void setStatus(Status status) {
        this.status = status;
    }
}

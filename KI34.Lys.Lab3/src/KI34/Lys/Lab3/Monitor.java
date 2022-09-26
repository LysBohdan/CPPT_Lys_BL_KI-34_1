/**
 * lab 3 package
 */
package KI34.Lys.Lab3;

import java.io.*;

/**
 * Class <code>Monitor</code> implements monitor
 * * @author Lys Bohdan
 *  * @version 1.0
 **/

public class Monitor {
    private double hz;
    private String name;
    private String matrix;
    private MonitorButton status;
    private Display display;
    private PrintWriter myWrite;
    private String monitorFormat;

    /**
     * Constructor
     * @throws FileNotFoundException param
     */

    public Monitor() throws FileNotFoundException {
        matrix = "None";
        name = "None";
        hz = 0;
        monitorFormat = "None";
        myWrite = new PrintWriter("Log.txt");
        status = new MonitorButton();
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
     * @throws FileNotFoundException
     */


    public Monitor(String name, double brightDisplay, String matrix, double diagonal, String resolution, double hz, String monitorFormat) throws FileNotFoundException {
        this.matrix = matrix;
        this.name = name;
        this.hz = hz;
        this.monitorFormat = monitorFormat;
        myWrite = new PrintWriter("Log.txt");
        status = new MonitorButton();
        display = new Display(brightDisplay, diagonal, resolution);
    }

    /**
     * Method returns monitor`s refresh rate
     * @return monitor`s refresh rate
     */
    public double getHz() {
        return hz;
    }

    /**
     * Method returns monitor`s name
     * @return monitor`s name
     */
    public String getName() {
        return name;
    }


    /**
     * Method returns monitor`s matrix type
     * @return monitor`s matrix type
     */
    public String getMatrix() {
        return matrix;
    }

    /**
     * Method returns monitor`s status off/on
     * @return monitor`s status off/on
     */
    public MonitorButton getStatus() {
        return status;
    }

    /**
     * Method sets the new monitor`s refresh rate
     * @param hz <code>hz</code> monitor`s refresh rate
     */
    public void setHz(double hz) {
        this.hz = hz;
    }

    /**
     * Method sets the new monitor`s name
     * @param name <code>name</code> monitor`s name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Method sets the new monitor`s format
     * @param monitorFormat <code>monitorFormat</code> monitor`s screen format
     */
    public void setResolution(String monitorFormat) {
        this.monitorFormat = monitorFormat;
    }


    /**
     * Method sets the new monitor`s matrix type
     * @param matrix <code>matrix</code> monitor`s matrix type
     */
    public void setMatrix(String matrix) {
        this.matrix = matrix;
    }

    /**
     * Method sets the new monitor`s status off/on
     * @param status <code>matrix</code> monitor`s status off/on
     */
    public void setStatus(MonitorButton status) {
        this.status = status;
    }

    /**
     * Method return monitor`s settings which we set
     */
    public void getSettings() {
        if (status.getStatus() == Status.ON) {
            System.out.println("Name - " + name);
            System.out.println("Diagonal - " + display.getDiagonal());
            System.out.println("Resolution - " + display.getResolution());
            System.out.println("Hz - " + hz);
            System.out.println("Matrix - " + matrix);
            System.out.println("Bright - " + display.getBrightDisplay());
            myWrite.println("Налаштування монітора виведенно.");
        } else {
            System.out.println("Your monitor is off!!! ");
            myWrite.println("Налаштування монітора не вивиеденно, та як монітор виключенно.");
        }

    }

    /**
     * Method simulates increment monitor`s display brightness
     */
    public void brightDisplayPlus(int change) {
        display.setBrightDisplay(display.getBrightDisplay() + change);
        myWrite.println("Яскравість монітора збільшенна.");
    }

    /**
     * Method simulates decrement monitor`s display brightness
     */
    public void brightDisplayMinus(int change) {
        display.setBrightDisplay(display.getBrightDisplay() - change);
        myWrite.println("Яскравість монітора зменшенна.");
    }

    /**
     * Method simulates changing monitor`s matrix type
     */
    public void changeMatrix(String mat) {
        System.out.println("Selected matrix - " + matrix);
        myWrite.println("Матриця монітора зміненна з " + matrix + " на " + mat);
        matrix = mat;
        System.out.println("Matrix changed - " + matrix);
    }

    /**
     * Method simulates changing monitor`s refresh rate
     */
    public void changeHz(int hz) {
        if (status.getStatus() == Status.ON) {
            System.out.println("Selected Hz - " + this.hz);
            myWrite.println("Частота оновлення монітура зміненна з " + this.hz + " на " + hz);
            this.hz = hz;
            System.out.println("Hz changed - " + hz);

        } else {
            System.out.println("Your monitor is off!!! ");
            myWrite.println("Частота оновлення монітора не зміненна, та як монітор виключенно.");
        }
    }

    /**
     * Method simulates changing monitor`s name
     */
    public void changeName(String name) {
        System.out.println("Selected name - " + name);
        myWrite.println("Ноазва монітора зміненна з " + this.name + " на " + name);
        this.name = name;
        System.out.println("Name changed - " + name);

    }

    /**
     * Method simulates changing monitor`s resolution
     */
    public void changeResolution(String resolution) {
        if (status.getStatus() == Status.ON) {
            System.out.println("Selected resolution - " + display.getResolution());
            myWrite.println("Розширення монітура зміненно з " + display.getResolution() + " на " + resolution);
            display.setResolution(resolution);
            System.out.println("Resolution changed - " + resolution);

        } else {
            System.out.println("Your monitor is off!!! ");
            myWrite.println("Розширення монітора не зміненно, та як монітор виключенно.");
        }
    }

    /**
     * Method simulates changing monitor`s screen format
     */
    public void changeMonitorFormat(String monitorFormat) {
        if (monitorFormat == "16:9") {
            this.monitorFormat = monitorFormat;
            System.out.println("Monitor format changed - " + monitorFormat);
            System.out.println("Max resolution for this format is 2560 x 1440.");
            myWrite.println("Формат монітора зміненно на - " + monitorFormat);
        } else if (monitorFormat == "4:3") {
            this.monitorFormat = monitorFormat;
            System.out.println("Monitor format changed - " + monitorFormat);
            System.out.println("Max resolution for this format is 1440x1080.");
            myWrite.println("Формат монітора зміненно на - " + monitorFormat);
        } else if (monitorFormat == "16:10") {
            this.monitorFormat = monitorFormat;
            System.out.println("Monitor format changed - " + monitorFormat);
            System.out.println("Max resolution for this format is 1920x1200.");
            myWrite.println("Формат монітора зміненно на - " + monitorFormat);
        } else {
            System.out.println("Input incorrect monitor format!");
            myWrite.println("Формат монітора не зміненно, некоректне введення.");
        }
    }

    /**
     * Method releases used recourses
     */
    public void dispose()
    {
        myWrite.flush();
        myWrite.close();
    }
}

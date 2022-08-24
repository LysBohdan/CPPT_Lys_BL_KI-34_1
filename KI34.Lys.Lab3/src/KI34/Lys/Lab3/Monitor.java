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
    private String resolution;
    private double diagonal;
    private String matrix;
    private double BrightDisplay;
    private Status status;
    private PrintWriter myWrite;
    private String monitorFormat;

    /**
     * Constructor
     * @throws FileNotFoundException param
     */

    public Monitor() throws FileNotFoundException {
        matrix = "None";
        diagonal = 0;
        name = "None";
        resolution = "None";
        hz = 0;
        BrightDisplay = 0;
        monitorFormat = "None";
        myWrite = new PrintWriter("Log.txt");
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
     * @throws FileNotFoundException
     */

    public Monitor(String name, double diagonal, String matrix, String resolution, double hz, double BrightDisplay, String monitorFormat) throws FileNotFoundException {
        this.matrix = matrix;
        this.diagonal = diagonal;
        this.name = name;
        this.resolution = resolution;
        this.hz = hz;
        this.BrightDisplay = BrightDisplay;
        this.monitorFormat = monitorFormat;
        myWrite = new PrintWriter("Log.txt");
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
     * Method returns monitor`s resolution
     * @return monitor`s resolution
     */
    public String getResolution() {
        return resolution;
    }

    /**
     * Method returns monitor`s diagonal
     * @return monitor`s diagonal
     */
    public double getDiagonal() {
        return diagonal;
    }

    /**
     * Method returns monitor`s matrix type
     * @return monitor`s matrix type
     */
    public String getMatrix() {
        return matrix;
    }

    /**
     * Method returns monitor`s display brightness
     * @return monitor`s display brightness
     */
    public double getBrightDisplay() {
        return BrightDisplay;
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
     * Method sets the new monitor`s resolution and format
     * @param resolution <code>resolution</code> monitor`s resolution
     * @param monitorFormat <code>monitorFormat</code> monitor`s screen format
     */
    public void setResolution(String resolution, String monitorFormat) {
        this.resolution = resolution;
        this.monitorFormat = monitorFormat;
    }

    /**
     * Method sets the new monitor`s diagonal
     * @param diagonal <code>diagonal</code> monitor`s diagonal
     */
    public void setDiagonal(double diagonal) {
        this.diagonal = diagonal;
    }

    /**
     * Method sets the new monitor`s matrix type
     * @param matrix <code>matrix</code> monitor`s matrix type
     */
    public void setMatrix(String matrix) {
        this.matrix = matrix;
    }

    /**
     * Method sets the new monitor`s display brightness
     * @param brightDisplay <code>brightDisplay</code> monitor`s display brightness
     */
    public void setBrightDisplay(double brightDisplay) {
        BrightDisplay = brightDisplay;
    }

    /**
     * Method simulates monitor`s off/on
     */
    public void off_onMonitor(Status comand) {
        if (comand == Status.ON) {
            myWrite.println("Монітор включено.");
            status = Status.ON;
        } else {
            status = Status.OFF;
            myWrite.println("Монітор виключено.");
        }
    }

    /**
     * Method return monitor`s settings which we set
     */
    public void getSettings() {
        if (status == Status.ON) {
            System.out.println("Name - " + name);
            System.out.println("Diagonal - " + diagonal);
            System.out.println("Resolution - " + resolution);
            System.out.println("Hz - " + hz);
            System.out.println("Matrix - " + matrix);
            System.out.println("Bright - " + BrightDisplay);
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
        BrightDisplay = BrightDisplay + change;
        myWrite.println("Яскравість монітора збільшенна.");
    }

    /**
     * Method simulates decrement monitor`s display brightness
     */
    public void brightDisplayMinus(int change) {
        BrightDisplay = BrightDisplay - change;
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
        if (status == Status.ON) {
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
        if (status == Status.ON) {
            System.out.println("Selected resolution - " + this.resolution);
            myWrite.println("Розширення монітура зміненно з " + this.resolution + " на " + resolution);
            this.resolution = resolution;
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

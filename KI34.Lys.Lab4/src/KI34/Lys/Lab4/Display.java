/**
 * lab 4 package
 */
package KI34.Lys.Lab4;

/**
 * Class <code>Display</code> implements display
 * * @author Lys Bohdan
 *  * @version 1.0
 **/
public class Display {
    private double brightDisplay;
    private String resolution;
    private double diagonal;
    /**
     * Constructor
     */
    public Display(){
        brightDisplay = 0.0;
        resolution = "None";
        diagonal = 0.0;
    }
    /**
     * Constructor
     * @param diagonal <code>diagonal</code> Monitor diagonal
     * @param resolution <code>resolution</code> Monitor resolution
     * @param brightDisplay <code>BrightDisplay</code> The brightness of the monitor display
     */
    public Display(double brightDisplay, double diagonal, String resolution){
        this.brightDisplay = brightDisplay;
        this.resolution = resolution;
        this.diagonal = diagonal;
    }
    /**
     * Method returns monitor`s bright
     * @return monitor`s bright
     */
    public double getBrightDisplay() {
        return brightDisplay;
    }
    /**
     * Method sets the new monitor`s bright
     * @param brightDisplay <code>brightDisplay</code> monitor`s bright
     */
    public void setBrightDisplay(double brightDisplay) {
        this.brightDisplay = brightDisplay;
    }
    /**
     * Method returns monitor`s resolution
     * @return monitor`s resolution
     */
    public String getResolution() {
        return resolution;
    }
    /**
     * Method sets the new monitor`s resolution
     * @param resolution <code>resolution</code> monitor`s resolution
     */
    public void setResolution(String resolution) {
        this.resolution = resolution;
    }
    /**
     * Method returns monitor`s diagonal
     * @return monitor`s diagonal
     */
    public double getDiagonal() {
        return diagonal;
    }
    /**
     * Method sets the new monitor`s diagonal
     * @param diagonal <code>diagonal</code> monitor`s diagonal
     */
    public void setDiagonal(double diagonal) {
        this.diagonal = diagonal;
    }
}

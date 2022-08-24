import java.io.*;
import java.util.*;

/**
 * Клас Lab2LysKI34 реалізує програму до лабораторної роботи №2
 *
 * @author Lys Bohdan
 * @version 1.0
 * @since version 1.0
 *
 */

public class Lab2LysKI34 {
    /**
     * Статичний метод main є точкою входу в програму
     *
     * @param args function parameter
     * @throws FileNotFoundException throw about non-existent file
     *
     */

    public static void main(String[] args) throws FileNotFoundException {
        int arrsize;
        String[][] arr;
        String filler;

        File myFile = new File("Lab2LysKI34.txt");
        Scanner myScanFile = new Scanner(myFile);
        Scanner myScanSys = new Scanner(System.in);
        PrintWriter myWriter = new PrintWriter(myFile);

        System.out.print("Input size of matrix: ");
        arrsize = myScanSys.nextInt();
        myScanSys.nextLine();

        arr = new String[arrsize][arrsize];
        for (int i = 0; i < arrsize; i++) {
            for(int j = 0; j<arrsize; j++)
            arr[i][j] = " ";
        }

        System.out.print("Input filler symbol: ");
        filler = myScanSys.nextLine();

        if (filler.length() == 1) {
            for (int i = 0; i < arrsize; i++) {
                if (i < arrsize / 2) {
                    for (int j = 0; j < arrsize; j++) {
                        if (j >= arrsize / 2) {
                            arr[i][j] = filler;
                            System.out.print(arr[i][j] + " ");
                            myWriter.print(arr[i][j] + " ");
                        }
                        else {
                            System.out.print("  ");
                            myWriter.print("  ");
                        }
                    }
                }
                else{
                    for (int j = 0; j < arrsize; j++) {
                        if (j < arrsize / 2) {
                            arr[i][j] = filler;
                            System.out.print(arr[i][j] + " ");
                            myWriter.print(arr[i][j] + " ");
                        }
                        else {
                            System.out.print("  ");
                            myWriter.print("  ");
                        }
                    }
                }
                System.out.println();
                myWriter.print("\n");
            }
            System.out.print("\n");
            myWriter.print("\n");
        }
        if (filler.length() == 0) {
            System.out.print("\nNo filler symbol entered");
            System.exit(0);
        }
        if (filler.length() > 1) {
            System.out.print("\nToo many filler symbol");
            System.exit(0);
        }


        myWriter.flush();
        myWriter.close();
    }
}

import java.io.*;
import java.util.*;

/**
 * Клас Lab2LysKI34 реалізує програму до лабораторної роботи №2
 *
 * @author Lys Bohdan
 * @version 1.0
 * @since version 1.0
 */

public class Lab2LysKI34 {
    /**
     * Статичний метод main є точкою входу в програму
     *
     * @param args function parameter
     * @throws FileNotFoundException throw about non-existent file
     */

    public static void main(String[] args) throws FileNotFoundException {
        int arrsize;
        char[][] arr;
        String filler;

        File myFile = new File("Lab2LysKI34.txt");
        Scanner myScanFile = new Scanner(myFile);
        Scanner myScanSys = new Scanner(System.in);
        PrintWriter myWriter = new PrintWriter(myFile);

        System.out.print("Input size of matrix: ");
        arrsize = myScanSys.nextInt();
        myScanSys.nextLine();

        System.out.print("Input filler symbol: ");
        filler = myScanSys.nextLine();

        arr = new char[arrsize][(int) arrsize / 2];
        for (int i = 0; i < arrsize; i++) {
            if (i < (int) arrsize / 2) {
                for (int j = 0; j < (int) arrsize / 2; j++) {/*System.out.print("\t");*/}
            }
            for (int j = 0; j < (int) arrsize / 2; j++) {
                arr[i][j] = ' ';
            }
        }
        if (filler.length() == 1) {
            for (int i = 0; i < arrsize; i++) {
                if (i < (int) arrsize / 2) {
                    for (int j = 0; j < (int) arrsize / 2; j++) {
                        System.out.print("  ");
                        myWriter.print("  ");
                    }
                }
                for (int j = 0; j < (int) arrsize / 2; j++) {
                    arr[i][j] = (char) filler.codePointAt(0);
                    ;
                    System.out.print(arr[i][j] + " ");
                    myWriter.print(arr[i][j] + " ");
                }
                myWriter.println();
                System.out.println();
            }
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

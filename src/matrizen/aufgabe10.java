package matrizen;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class aufgabe10 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner s = new Scanner(new File("src/matrizen/matrix.txt"));

        String first = s.nextLine();
        String[] dim = first.split(" ");
        int x = Integer.parseInt(dim[0]);
        int y = Integer.parseInt(dim[1]);
        System.out.println(x);
        System.out.println(y);
        int[][] mat = new int[x][y];
        int nr = 0;
        while (s.hasNextLine() && nr < x) {
            String line = s.nextLine();
            String[] dim2 = line.split(" ");
            for (int i = 0; i < y; i++) {
                mat[nr][i] = Integer.parseInt(dim2[i]);
                System.out.printf("%02d ", mat[nr][i]);

            }
            nr++;
            System.out.println();
        }
    }
}
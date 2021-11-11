package matrizen;
import java.lang.Math;
public class aufgabe8 {
    public static void main(String[] args) {
        int groesse = 4;

        char[][] mat = zzMatrix(groesse);
         if (gewonnen(mat)) {
             System.out.print("gewonnen!");
         } else System.out.print("verloren!");
    }


    private static char[][] zzMatrix(int groesse) {
        char[][] mat = new char[groesse][groesse];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                char g;
                if (Math.random() >= 0.5) {
                    g = 'X';
                } else g = 'O';
                mat[i][j] = g;
                System.out.print(g + " ");
            }
            System.out.println();
        }
        return mat;
    }

    static boolean gewonnen(char[][] mat) {
        String s = "";
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                s += mat[i][j];
            }
            s += ", ";
        }
        for (int j = 0; j < mat.length; j++) {
            for (int i = 0; i < mat[j].length; i++) {
                s += mat[i][j];
            }
            s += ", ";
        }
        return s.contains("XXXX") || s.contains("OOOO");
    }
}
package matrizen;

public class aufgabe9 {
    public static void main(String[] args) {
        int obergrenze = 10;
        int groesse = (int) (Math.random() * obergrenze + 1);

        int[][] mat = zzMatrix(groesse, obergrenze);
        int[][] mat2 = zzMatrix(groesse, obergrenze);

        if (vergleich(mat, mat2)) {
            System.out.print("true");
        } else System.out.print("false");
    }

    private static int[][] zzMatrix(int groesse, int obergrenze) {


        int[][] mat = new int[10][10];
        int[][] mat2 = new int[10][10];
        int g;
        int g2;

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {

                g = (int) (Math.random() * (groesse + 1));
                mat[i][j] = g;
            }
        }
        return mat;
    }

    static boolean vergleich(int[][] mat, int[][] mat2) {
        if (mat.length != mat2.length) {
            return false;
        } else {
            for (int i = 0; i < mat.length; i++) {
                for (int j = 0; j < mat[i].length; j++) {
                    if (mat[i][j] != mat2[i][j]) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}


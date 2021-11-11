package matrizen;

public class aufgabe7 {
    public static void main(String[] args) {
        int obergrenze = 10;
        int groesse = (int) (Math.random() * obergrenze + 1);
        int zeilennr = 1;

        int[][] mat = zzMatrix(groesse, obergrenze);
        int[] zeile = zeile(mat, zeilennr);
        for (int i = 0; i < zeile.length; i++) {
            System.out.print(zeile[i]);
        }
    }

    private static int[][] zzMatrix(int groesse, int obergrenze) {
        int[][] mat = new int[10][10];
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {

                int g = (int) (Math.random() * (groesse + 1));
                mat[i][j] = g;
            }
        }
        return mat;
    }

    public static int[] zeile(int[][] mat, int zeilennr) {
        return mat[zeilennr];
    }
}

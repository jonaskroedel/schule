package matrizen;

public class aufgabe5 {
    public static void main(String[] args) {
        int obergrenze = 10;
        int groesse = (int) (Math.random() * obergrenze + 1);

        int[][] mat = zzMatrix(groesse, obergrenze);
        int i;
        int n = 0;
        int j = 0;
        for (i = 0; i < mat.length; i++)
            for (j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == 0) {
                    n++;
                }
            }
        System.out.print("Anzahl Nullen: " + n);
    }


    private static int[][] zzMatrix(int groesse, int obergrenze) {


        int[][] mat = new int[10][10];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {

                int g = (int) (Math.random() * (groesse+1));
                mat[i][j] = g;
            }
        }
        return mat;
    }
}

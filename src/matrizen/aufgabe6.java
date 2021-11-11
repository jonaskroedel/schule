package matrizen;

public class aufgabe6 {
    public static void main(String[] args) {
        int obergrenze = 10;
        int groesse = (int) (Math.random() * obergrenze + 1);

        int[][] mat = zzMatrix(groesse, obergrenze);
        int n = 0;

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                n += mat[i][j];
            }
        }

        System.out.print("Summer aller Zahlen: " + n);
    }


    private static int[][] zzMatrix(int groesse, int obergrenze) {


        int[][] mat = new int[10][10];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {

                int g = (int) (Math.random() * (groesse+1));
                mat[i][j] = g;
                System.out.printf("%02d ", g);
            }
            System.out.println();
        }
        return mat;
    }
}

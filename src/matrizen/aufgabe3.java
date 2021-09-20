package matrizen;

public class aufgabe3 {
    public static void main(String[] args) { ausgabe(); }

    private static void ausgabe(int[][] mat) {
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; i < mat[0].length; j++) {
                System.out.print(mat[i][j]);
            }
            System.out.println();
        }
    }
}
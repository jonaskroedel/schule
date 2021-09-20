package matrizen;

public class aufgabe3 {
    public static void main(String[] args) {
        int[][] mat = new int[10][10];
        ausgabe(mat);
    }
    private static void ausgabe(int[][] mat) {
        for (int i = 1; i < mat.length; i++) {
            for (int j = 1; i < mat[0].length; j++) {
                System.out.print(mat[i][j]);
            }
            System.out.println();
        }
    }
}
package matrizen;

public class aufgabe2 {
    public static void main(String[] args) {
        int[][] m = {{1, 2, 3}, {4, 5}, {6, 7, 8, 9}, {1, 2, 4, 0, 3, 2}, {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}};
        int i;
        int j = 0;
        for (i = 0; i < m.length; i++) {
            for (j = 0; j < m[i].length; j++);
            System.out.println("Zeile: " + i + " Länge der Zeile: " + j);
        }
    }
}

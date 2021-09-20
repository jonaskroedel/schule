package wiederholung1;

public class aufgabe3 {
    public static void main(String[] args) {
        wurf(100, 1);
    }

    public static void wurf(int wh, int schritt) {
        double k = 0;
        for (double i = 1; i <= wh; i++) {
            double rel = 0;
            int r = (int) (Math.random() * 2);
            if (r == 0) {
                k++;
            }
            if (i % schritt == 0) {
                rel = k / i;
                System.out.printf(
                        "%10.0f       %10.0f        %.5f \n",
                        i, k, rel);
            }
        }
    }
}

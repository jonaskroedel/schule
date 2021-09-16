public class aufgabe2 {
    public static void main(String[] args) {
        double k = 0;
        for (double i = 1; i <= 1000; i++) {
            double rel = 0;
            int r = (int) (Math.random() * 2);
            if (r == 0) {
                k++;
            }
            if (i %10 == 0) {
                rel = k/i;
                System.out.printf(
                        "%10.0f       %10.0f        %.5f \n",
                        i, k, rel);
            }

        }
    }
}
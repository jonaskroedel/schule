package wiederholung2;

import java.util.Scanner;

public class lottozahlen {

    static Scanner s = new Scanner(System.in);

    static void ausgabe(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%3d", arr[i]);
        }
        System.out.println();
    }

    static boolean kommtVor(int[] a, int z) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == z) {
                return true;
            }
        }
        return false;
    }

    static int[] lottoZahlen() {
        int[] lz = new int[7];
        int pos = 0;
        while (pos < 7) {
            int l = (int) (Math.random() * 45) + 1;
            if (!kommtVor(lz, l)) {
                lz[pos] = l;
                pos++;
            }
        }
        return lz;
    }

    static String spielername() {
        System.out.printf("Bitte Spielernamen eingeben: ");
        return s.nextLine();
    }

    static int[] lottoTip() {
        int[] lt = new int[7];
        for (int i = 0; i < lt.length; i++) {
            System.out.printf("Bitte die Zahl %d eingeben: ", (i + 1));
            int l = s.nextInt();
            lt[i] = l;
        }
        return lt;
    }

    static int anzahlGleiche(int[] a1, int[] a2) {
        int gleiche = 0;
        for (int i = 0; i < a1.length - 1; i++) {
            for (int j = 0; j < a2.length - 1; j++) {
                if (a1[i] == a2[j]) {
                    gleiche++;
                }
            }
        }
        return gleiche;
    }

    static boolean zusatzZahlRichtig(int[] arr1, int[] arr2) {

        if (arr2[6] == arr1[6]) {
            System.out.print("Zusatzzahl übereinstimmung: JA");
            return true;

        } else {
            System.out.print("Zusatzzahl übereinstimmung: NEIN");
        }
        return false;
    }

    public static void main(String[] args) {

            String str = spielername();
            int[] lt = lottoTip();
            System.out.printf("Lottoziehung von: %s\n", str);
            ausgabe(lt);
            int[] lz = lottoZahlen();
            ausgabe(lz);
            int gleiche = anzahlGleiche(lz, lt);
            System.out.println(gleiche);
            boolean zusatzzahl = zusatzZahlRichtig(lz, lt);

            s.close();

    }
}
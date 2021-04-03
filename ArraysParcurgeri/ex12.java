package ArrayListParcurgeri;

import java.util.Arrays;

public class ex12 {
    public static void main(String[] args) {
        // 12. Se dă un vector x cu n elemente, numere naturale.
        // Să se construiască un alt vector, y, care să conțină elementele prime din x, în ordine inversă
        int[] x = {11, 12, 14, 15, 13};
        int contor = 0;
        for (int i = 0; i < x.length; i++) {
            int divizor = 0;
            for (int j = 2; j < x[i]; j++) {
                if ((x[i] % j) == 0) {
                    divizor++;
                }
            }
            if (divizor == 0) {
                contor++;
            }
        }
        int[] y = new int[x.length];
        int w = x.length-1;
        for (int i = 0; i < x.length; i++) {
            int divizor = 0;
            for (int j = 2; j < x[i]; j++) {
                if ((x[i] % j) == 0) {
                    divizor++;
                }
            }
            if (divizor == 0) {
                y[w] = x[i];
                w--;
            }
        }
        System.out.println(Arrays.toString(y));
    }
}

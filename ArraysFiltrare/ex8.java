package ArrayListFiltrare;

import java.util.Arrays;

public class ex8 {
    public static void main(String[] args) {
        // 8. Se dau doi vectori cu câte n elemente, numere naturale.
        // Verificați dacă cei doi vectori conțin exact aceleași elemente.
        int[] x = {5, 20, 4, 6, 8, 2};
        int[] y = {5, 6, 4, 20, 8, 2};
        Arrays.sort(x);
        Arrays.sort(y);
        int lafel = 0;
        for (int i = 0; i < x.length; i++) {
            if (x[i] == y[i]) {
                lafel++;
            }
            System.out.println(lafel);
        }
        if (lafel == x.length) {
            System.out.println("Cei 2 vectori contin aceleasi elemente");
        } else
            System.out.println("Cei 2 vectori nu contin aceleasi elemente");
    }
}

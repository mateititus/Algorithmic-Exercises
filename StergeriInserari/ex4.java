package StergeriInserari;

import java.util.Arrays;

public class ex4 {
    public static void main(String[] args) {
        // 4. Se dau n numere întregi.
        // Să se insereze între oricare două numere de aceeași paritate media lor aritmetică.
        int[] v = {1, 3, 3, 4, 5, 6};
        int count = 0;
        for (int i = 0; i < v.length - 1; i++) {
            int e = v[i];
            int e1 = v[i + 1];
            if (e % 2 == e1 % 2) {
                count++;
            }
        }
        int suma = 0;
        int[] y = new int[v.length + count];
        for (int i = 0, k = 0; i < v.length - 1; i++) {
            int e = v[i];
            int e1 = v[i + 1];
            y[k] = v[i];
            k++;
            if (e % 2 == e1 % 2) {
                y[k] = (v[i] + v[i + 1]) / 2;
                k++;
            }
        }
        y[y.length - 1] = v[v.length - 1];
        System.out.println(Arrays.toString(y));
    }
}

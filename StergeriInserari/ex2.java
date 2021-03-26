package StergeriInserari;

import java.util.Arrays;

public class ex2 {
    public static void main(String[] args) {
        // 2. Se citește un șir cu n elemente, numere întregi.
        // Să se șteargă elementele care se repetă, păstrându-se doar primul de la stânga la dreapta.
        int[] v = {1, 2, 2, 1};
        int[] y = new int[v.length];
        int countZERO = 0;
        for (int i = 0; i < v.length; i++) {
            int el = v[i];
            boolean found = false;
            for (int j = 0; j < y.length; j++) {
                if (el == y[j]) {
                    found = true;
                }
            }
            if (found == false) {
                y[i] = v[i];
            } else {
                countZERO++;
            }
        }
        int[] w = new int[y.length - countZERO];
        for (int i = 0, k = 0; i < y.length; i++) {
            if (y[i] != 0) {
                w[k] = y[i];
                k++;
            }
        }
        System.out.println(Arrays.toString(w));
    }
}

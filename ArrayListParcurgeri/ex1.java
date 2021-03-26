package ArrayListParcurgeri;

import java.util.Arrays;

public class ex1 {
    public static void main(String[] args) {
        // 1. Se dă un șir cu n elemente, numere naturale.
        // Determinați diferența în valoare absolută dintre
        // numărul de valori pare din șir și numărul de valori impare din șir.
        int[] v = {1, 2, 3, 4};
        int numarPar = 0;
        int numarImpar = 0;
        for (int i = 0; i < v.length; i++) {
            if (v[i] % 2 == 0) {
                numarPar++;
            } else {
                numarImpar++;
            }
        }
        System.out.println(Math.abs(numarPar) - Math.abs(numarImpar));

    }
}

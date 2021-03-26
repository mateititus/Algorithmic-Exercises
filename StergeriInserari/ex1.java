package StergeriInserari;

import java.util.Arrays;

public class ex1 {
    public static void main(String[] args) {
        // 1. Să se șteargă dintr-un șir elementul aflat pe o poziție dată
        int[] v = {2, 3, 4, 5, 65, 4};
        int[] w = new int[v.length - 1];
        int j = 0;
        for (int i = 0, k = 0; i < v.length; i++) {
            if (i != j) {
                w[k] = v[i];
                k++;
            }
        }
        System.out.println(Arrays.toString(w));
    }
}
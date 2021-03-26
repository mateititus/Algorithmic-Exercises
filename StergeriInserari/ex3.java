package StergeriInserari;

import java.util.Arrays;

public class ex3 {
    public static void main(String[] args) {
        // 3. Să se insereze pe o poziție dată într-un șir o valoare precizată.
        int[] v = {1, 3, 3, 4, 5};
        int[] w = new int[v.length + 1];
        int pozitie = 5;
        int inserare = 523;
        for (int i = 0; i < v.length + 1; i++) {
            if (i < pozitie - 1)
                w[i] = v[i];
            else if (i == pozitie - 1)
                w[i] = inserare;
            else
                w[i] = v[i - 1];
        }
        System.out.println(Arrays.toString(w));
    }
}

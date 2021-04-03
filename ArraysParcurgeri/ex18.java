package ArrayListParcurgeri;

public class ex18 {
    public static void main(String[] args) {
        // 18. Se dă un șir cu n elemente numere naturale.
        // Să se determine câte elemente din şir sunt numere prime.
        int[] v = {11, 23, 35, 47, 5, 6, 7, 8};
        int contor = 0;
        for (int i = 0; i < v.length; i++) {
            int el = v[i];
            int x = 0;
            for (int d = 1; d <= el; d++) {
                if (el % d == 0) {
                    x++;
                }
            }
            if (x == 2) {
                contor++;
            }
        }
        System.out.println(contor + " elemente din sir sunt prime");
    }
}

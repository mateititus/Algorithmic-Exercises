package ArrayListFiltrare;

public class ex2 {
    public static void main(String[] args) {
        // 2. Se dă un şir cu n elemente, numere naturale.
        // Să se verifice dacă în șir există elemente prime.
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
        if (contor > 0) {
            System.out.println("Da, sunt numere prime");
        } else
            System.out.println("Nu sunt numere prime");
    }
}


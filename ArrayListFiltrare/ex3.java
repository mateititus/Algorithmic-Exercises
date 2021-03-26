package ArrayListFiltrare;

public class ex3 {
    public static void main(String[] args) {
        // 3. Se dă un şir cu n elemente, numere naturale.
        // Să se verifice dacă toate elementele şirului sunt pare.
        int[] v = {1, 2, 3, 4, 5, 6, 7};
        boolean ok = true;
        for (int i = 0; i < v.length; i++) {
            if (v[i] % 2 == 1) {
                ok = false;
            }
        }
        if (!ok) {
            System.out.println("Da, toate numerele sunt prime");
        } else
            System.out.println("Nu toate numerele sunt prime");
    }
}
package ArrayListFiltrare;

public class ex4 {
    public static void main(String[] args) {
        // 4. Se dă un vector cu n elemente numere naturale.
        // Să se verifice dacă toate elementele vectorului sunt egale.
        int[] v = {1, 2, 1, 1, 1, 1};
        int egale = 0;
        int prim = v[0];
        for (int i = 0; i < v.length; i++) {
            if (prim == v[i]) {
                egale++;
            }
        }
        if (egale == v.length) {
            System.out.println("Da, toate numerele sunt egale");
        } else
            System.out.println("Nu toate numerele sunt egale");
    }
}

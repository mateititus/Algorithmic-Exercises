package ArrayListFiltrare;

public class ex7 {
    public static void main(String[] args) {
        // Se dă un şir cu n elemente, numere naturale.
        // Să se verifice dacă toate elementele şirului sunt multipli ai ultimului element din şir.
        int[] v = {50, 2, 4, 6, 8, 2};
        boolean ok = true;
        int ultim = v[v.length - 1];
        for (int i = 0; i < v.length; i++) {
            if (v[i] % ultim != 0) {
                ok = false;
                break;
            }
        }
        if (ok) {
            System.out.println("Da, toate numerele sunt multiplii ai lui: " + ultim);
        } else
            System.out.println("Nu toate numerele sunt multiplii ai lui: " + ultim);
    }
}
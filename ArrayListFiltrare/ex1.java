package ArrayListFiltrare;

public class ex1 {
    public static void main(String[] args) {
        // 1. Se dă un şir cu n elemente, numere naturale.
        // Să se verifice dacă în şir există elemente impare.
        int[] v = {1, 2, 3, 4, 5, 6, 7};
        int impar = 0;
        for (int i = 0; i < v.length; i++) {
            if (v[i] % 2 == 1) {
                impar++;
            }
        }
        if (impar > 0) {
            System.out.println("Da, exista numere impare");
        } else
            System.out.println("Nu, nu exista numere impare");
    }
}


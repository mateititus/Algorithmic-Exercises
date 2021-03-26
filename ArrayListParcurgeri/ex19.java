package ArrayListParcurgeri;

public class ex19 {
    public static void main(String[] args) {
        // 19. Se dă un șir cu n elemente numere naturale.
        // Să se se afișeze elementele din șir care au
        //proprietatea că primele două cifre din scrierea zecimală formează un pătrat perfect.
        int[] v = {495, 52, 163, 49, 1612321312};
        for (int i = 0; i < v.length; i++) {
            int w = v[i];
            while (w > 99) {
                w /= 10;
            }
            if (Math.sqrt(w) % 1 == 0) {
                System.out.println(v[i]);
            }
        }
    }
}


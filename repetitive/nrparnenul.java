package repetitive;

public class nrparnenul {
    public static void main(String[] args) {
        // Se dă un număr natural n. Afișați în ordine crescătoare primele n numere naturale pare nenule.
        int n = 12;
        for (int i = 2; i<=n; i=i+2) {
                System.out.print(i + " ");
        }
    }
}

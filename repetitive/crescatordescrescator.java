package repetitive;

public class crescatordescrescator {
    public static void main(String[] args) {

        // Se dă un număr natural n.
        // Afișați pe o linie primele n numere naturale nenule în ordine crescătoare,
        // iar pe linia următoare aceleași numere, dar în ordine descrescătoare.

        int n = 5;
        for (int i = 1; i<=n; i++)
            System.out.print(i + " ");
        System.out.println("");
        for (int j=n; j>=1; j--)
            System.out.print(j+ " ");


    }
}

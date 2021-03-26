package repetitive;

public class zeceN {
    public static void main(String[] args) {
        //Se dă n. Să se afișeze 10n.
        int n = 3;
        int rezultat = 1;
        for (int i = 1; i<=n; i++){
            rezultat = rezultat*10;
            System.out.println(rezultat);
        }
    }
}

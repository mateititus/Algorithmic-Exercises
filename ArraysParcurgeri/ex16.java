package ArrayListParcurgeri;

public class ex16 {
    public static void main(String[] args) {
        // Se dă un șir cu n elemente numere naturale.
        // Să se determine valoarea maximă din șir și de câte ori apare.
        int[] v = {1, 2, 3, 9, 5, 6, 7, 8, 9};
        int max = v[0];
        int contor = 0;
        for (int i = 0; i < v.length; i++) {
            if (v[i] > max) {
                max = v[i];
                contor = 0;
            }
            if (v[i] == max) {
                contor++;
            }

        }
        System.out.println("Valoarea maxima este: " + max + " si apare de: " + contor + " ori");
    }
}

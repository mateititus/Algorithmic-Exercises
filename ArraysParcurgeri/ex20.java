package ArrayListParcurgeri;

public class ex20 {
    public static void main(String[] args) {
        // 20. Se dă un şir cu n numere naturale.
        // Să se afişeze suma primilor n termeni din şir, apoi suma
        //primilor n-1 termeni din şir, şi aşa mai departe.
        int[] v = {1, 2, 3, 4, 5, 6};
        int n = 3;
        int w = n;
        for (int i = 0; i < w; i++) {
            int suma = 0;
            for (int j = 0; j < n; j++) {
                suma += v[j];
            }
           System.out.println("Suma primelor " + n + " numere este: " + suma);
            n--;
        }
    }
}

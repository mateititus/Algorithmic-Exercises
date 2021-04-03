package ArrayListFiltrare;

public class ex5 {
    public static void main(String[] args) {
        // 5. Se dă un vector cu n elemente numere naturale.
        // Să se verifice dacă are elementele ordonate crescător
        int[] v = {1, 2, 3, 4, 5, 6, 7};
        int ordonate = 0;
        for (int i = 0; i < v.length-1; i++) {
            if (v[i] <= v[i+1]) {
                ordonate++;
            }
        }

        if (ordonate == v.length-1) {
            System.out.println("Da, numerele sunt ordonate crescator");
        } else
            System.out.println("Numerele nu sunt ordonate crescator");
    }
}



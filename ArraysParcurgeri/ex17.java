package ArrayListParcurgeri;

public class ex17 {
    public static void main(String[] args) {
        // 17. Se dă un șir cu n elemente numere naturale.
        // Să se determine câte elemente din şir sunt egale cu ultimul element al acestuia.
        int[] v = {8, 8, 8, 4, 5, 6, 7, 8};
        int ultim = v[v.length - 1];
        int contor = 0;
        for (int i = 0; i < v.length; i++) {
            if (v[i] == ultim) {
                contor++;
            }
        }
        System.out.println(contor + " elemente din sir sunt egale cu ultimul element al sirului");
    }
}

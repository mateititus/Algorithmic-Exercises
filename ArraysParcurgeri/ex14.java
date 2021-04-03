package ArrayListParcurgeri;

public class ex14 {
    public static void main(String[] args) {
        //  14. Se dau două şiruri cu elemente numere naturale.
        //  Determinaţi câte dintre elementele primului
        //şir sunt mai mari decât toate elementele celui de-al doilea şir.
        int[] x = {1, 2, 0, 13, 12, 9, 8};
        int[] y = {1, 2, 4, 7};
        int bigger = 0;
        for (int i = 0; i < x.length; i++) {
            int contor = 0;
            for (int j = 0; j < y.length; j++) {
                if (x[i] > y[j]) {
                    contor++;
                }
            }
            if (contor == y.length) {
                bigger++;
            }
        }
        System.out.println(bigger + " elemente din primul sir de numere sunt mai mari decat toate elementele celui de-al doilea");
    }
}

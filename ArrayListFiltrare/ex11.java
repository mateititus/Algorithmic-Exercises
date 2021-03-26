package ArrayListFiltrare;

public class ex11 {
    // 11. Sa se verifice dacă un şir dat este şir vale.
    public static void main(String[] args) {
        int[] v = {1, 4, 3, 5, 4, 3, 1};
        int min = v[0];
        int minPoz = 0;
        boolean ok = true;
        for (int i = 0; i < v.length; i++) {
            if (v[i] < min) {
                min = v[i];
                minPoz = i;
            }
        }

        for (int i = 0; i < v.length-1; i++) {
            if (i < minPoz) {
                if (v[i] > v[i + 1]) {
                    ok = false;
                }
            } else {
                if (v[i] < v[i + 1])
                    ok = false;
            }
        }
        System.out.println(ok);
    }
}
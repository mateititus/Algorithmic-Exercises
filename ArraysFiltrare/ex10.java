package ArrayListFiltrare;

public class ex10 {
    // 10. Sa se verifice dacă un şir dat este şir munte sau nu.
    public static void main(String[] args) {
        int[] v = {1, 4, 3, 5, 4, 3, 1};
        int max = v[0];
        int maxPoz = 0;
        boolean ok = true;
        for (int i = 0; i < v.length; i++) {
            if (v[i] > max) {
                max = v[i];
                maxPoz = i;
            }
        }

        for (int i = 0; i < v.length-1; i++) {
            if (i < maxPoz) {
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


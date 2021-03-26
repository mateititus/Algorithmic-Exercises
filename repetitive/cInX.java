package repetitive;

public class cInX {
    public static void main(String[] args) {
        //Afiseaza de cate ori apare cifra 3 in nr 13313
        int n = 1331;
        int c = 3;
        int cifra = 0;
        while (n != 0) {
            if (n % 10 == c) {
                cifra++;
            }
            n = n / 10;
        }
        System.out.println(cifra);
    }
}

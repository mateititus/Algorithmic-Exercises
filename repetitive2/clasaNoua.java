package ianuarie20repetitive;

public class clasaNoua {
    public static void main(String[] args) {
        int n = 2495;
        int ceamaimare = 0;
        while (n != 0) {
            if (n % 10 > ceamaimare) {
                ceamaimare = n % 10;
            }
            n = n / 10;
        }
        System.out.println(ceamaimare);
    }
}

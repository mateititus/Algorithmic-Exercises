package repetitive;

public class ex6 {
    public static void main(String[] args) {
        // Afiseaza cea mai mica cifra a unui nr
        int x = 9942;
        int ceaMaiMica = 9;
        while (x != 0) {
            if (x % 10 <= ceaMaiMica) {
                ceaMaiMica = x % 10;
            }
            x = x / 10;
        }
        System.out.println(ceaMaiMica);
    }
}

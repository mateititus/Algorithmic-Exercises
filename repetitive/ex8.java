package repetitive;

public class ex8 {
    public static void main(String[] args) {
        // Afiseaza de cate ori apare cifra cea mai mica
        int x = 112233;
        int ceaMaiMica = 9;
        int deCateOri = 0;
        while (x != 0) {
            if (x % 10 == ceaMaiMica) {
                deCateOri += 1;
            }
            if (x % 10 < ceaMaiMica) {
                ceaMaiMica = x % 10;
                deCateOri = 1;
            }
            x = x / 10;
        }
        System.out.println("Cea mai mica cifra este " + ceaMaiMica + " si apare de: " + deCateOri + " ori");
    }
}

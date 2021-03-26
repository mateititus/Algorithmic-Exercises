package repetitive;

public class ex7 {
    public static void main(String[] args) {
        // Afiseaza de cate ori apare cifra cea mai mare
        int x = 128881;
        int ceaMaiMare = 0;
        int deCateOri = 0;
        while (x != 0) {
            if (x % 10 == ceaMaiMare){
                deCateOri += 1;
            }
            if (x % 10 > ceaMaiMare) {
                ceaMaiMare = x % 10;
                deCateOri = 1;
            }
            x = x / 10;
        }
        System.out.println("Cea mai mare cifra este " + ceaMaiMare + " si apare de: " + deCateOri + " ori");
    }
}

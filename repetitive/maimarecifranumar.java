package repetitive;

public class maimarecifranumar {
    public static void main(String[] args) {
        // Afiseaza cea mai mare cifra a unui nr
        int x = 129941;
        int ceaMaiMare = 0;
        while(x!=0){
            if (x%10 > ceaMaiMare){
                ceaMaiMare = x%10;
            }
            x = x/10;
        }
        System.out.println(ceaMaiMare);
    }
}

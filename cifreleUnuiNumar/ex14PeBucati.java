package cifreleUnuiNumar;

public class ex14PeBucati {
    public static void main(String[] args) {
        int n = 1254;
        int nou = 0;
        while (n > 0) {
            nou = nou * 10 + 9;
            n /= 10;
        }
        System.out.println(nou);
    }
}

package cifreleUnuiNumar;

public class clasaNoua {
    public static void main(String[] args) {
        int numar = 12345;
        int numarNou = 0;
        int ordin = 1;
        while (numar != 0) {
            if (numar % 10 % 2 == 1) {
                numarNou = numar % 10 * ordin + numarNou;
                ordin = ordin * 10;
            }
            numar /= 10;
        }
        System.out.println(numarNou);
    }
}

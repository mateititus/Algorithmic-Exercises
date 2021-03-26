package cifreleUnuiNumar;

public class ex28 {
    public static void main(String[] args) {
        // 28. Se dau două numere naturale a și b.
        // Calculați suma numerelor echilibrate din intervalul [a,b].
        // Un număr este echilibrat dacă are suma cifrelor pare egală cu suma cifrelor impare.
        int a = 1200;
        int b = 1205;
        int suma = 0;
        for (int i = a; i <= b; i++) {
            int par = 0;
            int impar = 0;
            int y = i;
            while (y != 0) {
                if (y % 10 % 2 == 0) {
                    par += y % 10;
                } else {
                    impar += y % 10;
                }
                y /= 10;
            }
            if (par == impar) {
                suma += i;
            }
        }
        System.out.println(suma);
    }
}

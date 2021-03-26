package cifreleUnuiNumar;

public class ex29 {
    public static void main(String[] args) {
        //29. Se dau două numere naturale a și b.
        // Determinati numărul de palindromuri cuprinse în intervalul determinat de cele două numere.
        int a = 100;
        int b = 150;
        for (int i = a; i <= b; i++) {
            int invers = 0;
            int y = i;
            while (y != 0) {
                invers = invers * 10 + y % 10;
                y /= 10;
            }
            if (invers == i) {
                System.out.println(invers);
            }
        }
    }
}

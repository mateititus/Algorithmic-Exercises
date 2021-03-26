package ianuarie20repetitive;

import java.util.Scanner;

public class clasanouaptcaegreuman {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("dai numar");
        int n = scan.nextInt();
        int count = 0;
        int ultimacifra = n%10;
        int primacifra = 0;
        int aux = n;
        while (n != 0) {
            count++;
            primacifra = aux / (int) Math.pow(10, count - 1);
            n = n/10;

        }
        System.out.println(primacifra);
    }
}

package ianuarie20repetitive;

import java.util.Scanner;

public class nSiK {
//    Se dau numerele naturale n și k, unde k este o cifră.
//    Să se verifice dacă toate cifrele lui n sunt mai mici sau egale decât k

    //citesc n 2943 si k 8
    //verific daca o cifra e mai mare ca k, cresc da cu 1
    // daca da nu e 0, inseamna ca am avut o cfira mai mare ca si k
    // daca da e 0 afisez nu, altfel afisez da
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Dai numar");
        int n = scan.nextInt();
        System.out.println("Da-mi o singura cifra");
        int k = scan.nextInt();
        while (n != 0 && n%10 < k) {
            n = n / 10;
        }
        if (n > 0) {
            System.out.println("Nu");
        } else
            System.out.println("Da");
    }
}

package ArrayListParcurgeri;

import java.util.Arrays;

public class ex11 {
    public static void main(String[] args) {
        // 11. Se consideră un șir a1, a2, …, an de numere naturale.
        //● Să se afișeze elementele șirului de la dreapta la stânga.
        //● Să se calculeze suma valorilor pare din șir.
        //● Să se determine suma valorilor aflate pe poziții pare în șir.
        //● Să se determine numărul numerelor din șir care sunt divizibile cu 10.
        //● Să se determine suma numerelor divizibile cu 3 și aflate pe poziții impare

//        Scanner scan = new Scanner(System.in);
//        System.out.println("Cate elemente?");
//        int n = scan.nextInt();
        int[] v = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] x = new int[v.length];
        int contorVector = x.length - 1;
        int par = 0;
        int pozitiiPar = 0;
        int divizibilCu10 = 0;
        int sumaCu3 = 0;
        for (int i = 0; i < v.length; i++) {
            // v[i] = scan.nextInt();
            x[contorVector] = v[i];
            contorVector--;
            if (v[i] % 2 == 0) {
                par += v[i];
            }
            if (i % 2 == 0) {
                pozitiiPar += v[i];
            }
            if (v[i] % 10 == 0) {
                divizibilCu10++;
            }
            if (v[i] % 3 == 0 && i % 2 == 1) {
                sumaCu3 += v[i];
            }
        }
        System.out.println("Numerele de la dreapta la stanga sunt: " + Arrays.toString(x));
        System.out.println("Suma valorilor pare: " + par);
        System.out.println("Suma valorilor aflate pe poziții pare: " + pozitiiPar);
        System.out.println("Numarul de elemente divizibile cu 10: " + divizibilCu10);
        System.out.println("Suma numerelor divizibile cu 3 și aflate pe poziții impare: " + sumaCu3);
    }
}

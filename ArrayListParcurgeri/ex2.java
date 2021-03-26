package ArrayListParcurgeri;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        // 2. Se citește un vector cu n elemente, numere naturale.
        // Să se afișeze elementele din vector care sunt multipli ai ultimului element
        //Scanner scan = new Scanner(System.in);
        //System.out.println("Cate elemente?");
        //int n = scan.nextInt();
        int[] v = {10, 9, 21, 3, 7, 3};
        int ultimulNr = v[v.length-1];
            System.out.println("Multipli de " + ultimulNr + " sunt: ");
        for (int j = 0; j < v.length; j++) {
            if (v[j] % ultimulNr == 0) {
                System.out.println(v[j]);
            }
        }
    }
}


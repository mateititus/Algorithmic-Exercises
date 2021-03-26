package ArrayListParcurgeri;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        // 3. Se citește un vector cu n elemente, numere naturale.
        // Să se afișeze elementele cu indici pari în ordinea crescătoare a indicilor,
        // iar elementele cu indici impari în ordinea descrescătoare a indicilor
        Scanner scan = new Scanner(System.in);
        System.out.println("Cate elemente?");
        int n = scan.nextInt();
        int[] v = new int[n];
        for (int i = 0; i < v.length; i++) {
            System.out.println("Ofera elemetul " + i);
            v[i] = scan.nextInt();
        }
        System.out.println("Par: ");
        for (int i = 0; i < v.length; i++) {
            if (i % 2 == 0) {
                System.out.println(v[i]);
            }
        }
        System.out.println("Impar: ");
        for (int i = 0; i < v.length; i++) {
            if (i % 2 == 1) {
                System.out.println(v[i]);
            }
        }
    }
}


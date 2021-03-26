package ArrayListParcurgeri;

import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        // 7. Se citește un vector cu n elemente, numere naturale.
        // Să se determine câte elemente ale vectorului sunt egale cu diferența dintre cea mai mare
        // și cea mai mică valoare din vector
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Cate elemente?");
//        int n = scan.nextInt();
        int[] v = {1, 3, 4};
        int count = 0;
        int max = v[0];
        int min = v[0];
        for (int i = 0; i < v.length; i++) {
           // System.out.println("Ofera numarul " + i);
           //v[i] = scan.nextInt();
            if (v[i] > max) {
                max = v[i];
            }
            if (v[i] < min) {
                min = v[i];
            }
        }
        for (int i = 0; i < v.length; i++) {
            if (v[i] == (max - min)) {
                count++;
            }
        }
        System.out.println(count + " elementele din vector sunt egale cu diferenta dintre max si min");
    }
}

package ArrayListParcurgeri;

import java.util.Scanner;

public class ex5 {
    // 5. Să se determine maximul şi minimul valorilor elementelor unui vector.
    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Cate elemente?");
//        int n = scan.nextInt();
        int[] v = {-29, -5, -6};
        int max = v[0];
        int min = v[0];
        for (int i = 0; i < v.length; i++) {
            if (v[i] > max) {
                max = v[i];
            }
            if (v[i] < min) {
                    min = v[i];
                }
        }
        System.out.println("Maximul este " + max + " si minimul " + min);
    }
}

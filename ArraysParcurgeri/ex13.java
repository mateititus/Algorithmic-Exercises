package ArrayListParcurgeri;

import java.util.Arrays;
import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {
        // 13. Să se înlocuiască toate elementele nule dintr-un vector cu elemente numere naturale cu
        //partea întreagă a mediei aritmetice a elementelor nenule din vector.
        Scanner scan = new Scanner(System.in);
//        System.out.println("Cate elemente?");
//        int n = scan.nextInt();
        int[] v = {1, 2, 0, 4, 0, 6, 7};
        int sum = 0;
        int nenul = 0;
        for (int i = 0; i < v.length; i++) {
            // v[i] = scan.nextInt();
            sum += v[i];
            if (v[i] != 0){
                nenul++;
            }
        }
        double media = sum / nenul;
        long parteaIntreaga = (long) media;
        for (int i = 0; i < v.length; i++) {
            if (v[i] == 0) {
                v[i] = (int) parteaIntreaga;
            }
        }
        System.out.println(Arrays.toString(v));
    }
}
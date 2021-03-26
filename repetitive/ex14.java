package repetitive;

import java.util.Scanner;

public class ex14 {
    public static void main(String[] args) {
        // Să se scrie un program care citește numărul natural n și determină suma pătratelor perfecte mai mici sau egale cu n.
        Scanner scan = new Scanner(System.in);
        System.out.println("Ofera un numar");
        int n = scan.nextInt();
        int numar = 0;
        for (int i = 1; i <= n; i++) {
            numar += i * (i * i);
        }
        System.out.println(numar);
    }
}

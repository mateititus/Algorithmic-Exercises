package repetitive;

import java.util.Scanner;

public class ex12 {
    public static void main(String[] args) {
        // Să se scrie un program care citește numărul natural n și determină suma S=1*2+2*3+3*4...+n*(n+1).
        Scanner scan = new Scanner(System.in);
        System.out.println("Ofera un numar");
        int n = scan.nextInt();
        int suma = 0;
        for (int i = 1; i <= n; i++) {
          // same as suma = suma + i * (i + 1)
            suma += i * (i + 1);
        }
        System.out.print(suma);

    }
}

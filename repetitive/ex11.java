package repetitive;

import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        //Să se scrie un program care citește numărul natural n și determină suma 2+4+..+(2n).
        Scanner scan = new Scanner(System.in);
        System.out.println("Ofera un numar");
        int n = scan.nextInt();
        int suma = 0;
        for (int i = 2; i <= n * 2; i = i+2) {
            suma += i;
        }
        System.out.println(suma);
    }
}

package OperatoriExpresii;

import java.util.Scanner;

public class cifre {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("N este: ");
        int n = s.nextInt();
        int sumaZU = (n/10)%10 + n%10;
        System.out.println(sumaZU);

    }
}

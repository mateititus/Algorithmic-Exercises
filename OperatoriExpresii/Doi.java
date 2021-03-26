package OperatoriExpresii;

import java.util.Scanner;

public class Doi {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Numar 1");
        int n = s.nextInt();
        System.out.println("Numar 2");
        int x = s.nextInt();
        int suma;
        suma = n + x;
        System.out.println("Suma este " + (n + x));
    }
}

package OperatoriExpresii;

import java.util.Scanner;

public class ultimacifrapartiiintregi {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("r este: ");
        double r = s.nextDouble();
        int variabila = (int) r;
        System.out.println(variabila%10);


    }
}

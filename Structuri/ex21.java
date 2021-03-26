package Structuri;

import java.util.Scanner;

public class ex21 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ofera un numar de 3 cifre");
        int x = scan.nextInt();
        if(x/100>x/10%10 && x/100>x%10)
            System.out.println(x/100);
        else if (x/100<x/10%10 && x/10%10>x%10)
            System.out.println(x/10%10);
        else System.out.println(x%10);

    }
}

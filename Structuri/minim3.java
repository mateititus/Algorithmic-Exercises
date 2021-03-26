package Structuri;

public class minim3 {
    public static void main(String[] args) {
     //   Să se scrie un program care determină minimul a trei numere întregi, , salvati minimul intr-o variabila
        int x = 5, y = 2, z = 1, min;
        min = x < y ? x : y;
        if (z < min)
            min = z;
        System.out.println("Minimul este: " + min);
//        if (x<y && x<z)
//            min = x;
//        else if (y<x && y<z)
//            min = y;
//        else
//            min = z;



    }
}

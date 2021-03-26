package repetitive;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        // Să se scrie un program care citeşte de la tastatură un şir de numere naturale
        // şi determină media aritmetică a celor pare.
        Scanner scan = new Scanner(System.in);
        System.out.println("Cate numere?");
        int x = scan.nextInt();
        int suma = 0, suma2 = 0;
        for (int i = 0; i <= x; i++) {
            int y = scan.nextInt();
            if (y % 2 == 0) {
                suma2++;
                suma = suma + y;
            }
        }
        int mediaAritmetica = suma / suma2;
        System.out.print("Media aritmetica a numerelor pare este = " + mediaAritmetica);
    }
}

package Structuri;
import java.util.Scanner;
public class cifreegale {
    public static void main(String[] args) {
        //Se citește de la tastatură un număr natural de 3 cifre. Să se stabilească dacă are toate cifrele egale.
        Scanner scan = new Scanner(System.in);
        System.out.println("Scrie nuamr de 3 cifre");
        int x = scan.nextInt();
        if (x/100 == (x%100/10) && x/100 == x%10 && (x%100/10) == x%10)
            System.out.println("sunt egale");
        else
            System.out.println("nu sunt egale");
    }
}


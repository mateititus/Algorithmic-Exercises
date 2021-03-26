package cifreleUnuiNumar;

import java.util.Scanner;

public class ex27 {
    public static void main(String[] args) {
        // 27. Să se scrie un program care să determine suma dintre cea mai mică şi cea mai mare cifră
        //ale unui număr natural citit de la tastatură
        Scanner scan = new Scanner(System.in);
        System.out.println("dai numar");
        int n = scan.nextInt();
        int celMaiMare = 0;
        int celMaiMic = 9;
        while (n != 0) {
            if (n % 10 > celMaiMare) {
                celMaiMare = n % 10;
            }
            if (n % 10 < celMaiMic) {
                celMaiMic = n % 10;
            }
            n /= 10;
        }
        System.out.println(celMaiMare + celMaiMic);
    }
}

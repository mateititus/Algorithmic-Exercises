package Structuri;

public class ex16 {
    public static void main(String[] args) {
        int a = 51, b = 62, c=73;
        int nr1 = a/10 + a%10, nr2 = b/10 + b%10, nr3 = c/10 + c%10;
        if(nr1>nr2 && nr1>nr3)
            System.out.println(a);
        else if (nr1<nr2 && nr2>nr3)
            System.out.println(b);
        else System.out.println(c);
    }
}

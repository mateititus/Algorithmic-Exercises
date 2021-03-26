package Structuri;

public class intervalAB {
    public static void main(String[] args) {
        //Se dau trei numere naturale a b x. Să se verifice dacă numărul x aparține intervalului [a,b]
        int a = 10, b = 15, x= 176;
        if (a>=b && x<=a && x>=b)
            System.out.println("apartine");
        else if (a<=b && x<= b && x>=a)
            System.out.println("apartine");
    }
}

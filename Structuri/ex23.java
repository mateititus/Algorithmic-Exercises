package Structuri;

public class ex23 {
    public static void main(String[] args) {
        int a = 5, b=6, c=7;
        int inmultire1= a*b>a*c?a*b+c:a*c+b;
        int inmultire2= a*b>b*c?a*b+c:b*c+a;
        int inmultire3=a*c>b*c?a*c+b:b*c+a;

        if (inmultire1 > inmultire2 && inmultire1 > inmultire3)
            System.out.println(inmultire1);
        else if (inmultire1 < inmultire2 && inmultire2 > inmultire3)
            System.out.println(inmultire2);
        else
            System.out.println(inmultire3);


    }
}

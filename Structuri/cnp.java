package Structuri;

public class cnp {
    public static void main(String[] args) {
        long n = 5010611125841L;
        int ziua = (int) (n/100000%100);
        int luna = (int) (n/100000000%10);
        int anul = (int) (n/1000000000/10%10);
        int an = 0;
        if (anul==0)
            an = 2000;
        else if (anul==1)
            an = 2001;
        System.out.println("Data nasterii este (ziua, luna, anul ): " + ziua + " " + luna + " " + an);


    }
}


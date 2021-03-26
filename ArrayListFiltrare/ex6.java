package ArrayListFiltrare;

public class ex6 {
    public static void main(String[] args) {
        //  Să se verifice dacă un șir este: șir constant, șir strict crescător,
        //  șir crescător, șir strict descrescător, șir descrescător.
        int[] v = {1, 2, 3, 4, 5, 6, 7};
        int crescator = 0;
        int egale = v[0];
        int count = 0;
        int descrescator = 0;
        for (int i = 0; i < v.length - 1; i++) {
            if (v[i] <= v[i + 1]) {
                crescator++;
            }
            if (v[i] >= v[i + 1]) {
                descrescator++;
            }
        }
        for (int i = 0; i < v.length; i++) {
            if (egale == v[i]) {
                count++;
            }
        }
        if (count == v.length) {
            System.out.println("Da, toate numerele sunt egale");
        } else
            System.out.println("Nu toate numerele sunt egale");

        if (crescator == v.length - 1) {
            System.out.println("Da, numerele sunt ordonate crescator");
        } else
            System.out.println("Numerele nu sunt ordonate crescator");

        if (descrescator == v.length - 1) {
            System.out.println("Da, numerele sunt ordonate descrescator");
        } else
            System.out.println("Numerele nu sunt ordonate descrescator");

        if (crescator == v.length - 1 && descrescator == 0) {
            System.out.println("Sirul este ordonat strict crescator");
        } else
            System.out.println("Sirul nu este ordonat strict crescator");

        if (descrescator == v.length - 1 && crescator == 0) {
            System.out.println("Sirul este ordonat strict descrescator");
        } else
            System.out.println("Sirul nu este ordonat strict descrescator");
    }
}
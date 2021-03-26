package repetitive;

public class problemaDevastatoare {
    public static void main(String[] args) {
        // Afiseaza cate cifre pare are un nr si cate cifre impare
        int n = 2225;
        int numarPar = 0, numarImpar = 0;
        while (n!=0){
            if (n%10%2 == 0) {
                numarPar++;
            } else {
                numarImpar++;
            }
            n = n/10;
        }
        System.out.println(numarImpar + " " + numarPar);
    }
}

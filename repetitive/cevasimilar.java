package repetitive;

public class cevasimilar {
    public static void main(String[] args) {
        //Se citește numărul natural n, şi un caracter c. Să se afișeze următoarea piramidă:
        //C
        //Cc
        //Ccc
        //Cccc
        //Ccccc
        int n = 5;
        char c = 'y';

        for (int i = 1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print(c);
            }
            System.out.println();
        }

    }
}

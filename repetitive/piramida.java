package repetitive;

public class piramida {
    public static void main(String[] args) {
        // Se citește numărul natural n. Să se afișeze următoarea piramidă de numere:
        //
        //1
        //12
        //123
        //1234
        //12345

        int n = 5;
        for (int i = 1; i<=n; i++){
            for (int j = 1; j<=i ; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

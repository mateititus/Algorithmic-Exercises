package repetitive;

public class ex10 {
    public static void main(String[] args) {
        //Se citește n număr natural.
        // Calculați suma numerelor naturale mai mici sau egale cu n.
        int n = 5;
        int suma = 0;
        for (int i = 0; i <= n; i++) {
            suma = suma + i;
        }
        System.out.println(suma);
    }
}

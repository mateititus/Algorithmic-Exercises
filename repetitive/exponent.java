package repetitive;

public class exponent {
    public static void main(String[] args) {
        //Se dau numerele n și m. Să se determine exponentul la care se ridică n pentru a obține m.
        int n = 2, m = 8;
        for (int i = 1; i<=m ; i++) {
            if (Math.pow(n,i) == m)
            System.out.println(i);
            }
    }
}

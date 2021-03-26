package ArrayListParcurgeri;

public class ex8 {
    public static void main(String[] args) {
        // 8. Se citește un vector cu n elemente, numere naturale distincte.
        // Să se afișeze elementele cuprinse între elementul cu valoarea minimă
        // și cel cu valoare maximă din vector, inclusiv acestea
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Cate elemente?");
//        int n = scan.nextInt();
        int[] v = {5, 7, 1, 3, 4, 5, 9, 7, 3, 2};
        int max = v[0];
        int min = v[0];
        int pozitiemin = 0;
        int pozitiemax = 0;
        for (int i = 0; i < v.length; i++) {
            if (v[i] > max) {
                max = v[i];
                pozitiemax = i;
            }
            if (v[i] < min) {
                min = v[i];
                pozitiemin = i;
            }
        }
        if (pozitiemax < pozitiemin) {
            int a = pozitiemax;
            pozitiemax = pozitiemin;
            pozitiemin = a;
        }
        int suma = 0;
        for (int i = pozitiemin; i <= pozitiemax; i++) {
           // System.out.println(v[i]);
            suma += v[i];
        }
        System.out.println(suma);
    }
}
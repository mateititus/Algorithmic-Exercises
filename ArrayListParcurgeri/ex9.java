package ArrayListParcurgeri;

public class ex9 {
    public static void main(String[] args) {
        // 9. Se citește un vector cu n elemente, numere naturale. Să se determine suma valorilor
        //elementelor cuprinse între primul element par și ultimul element par al vectorului
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Cate elemente?");
//        int n = scan.nextInt();
        int[] v = {2, 3, 4, 5, 6};
        int first = 0;
        int last = 0;
        boolean foundFirst = false;
        for (int i = 0; i < v.length; i++) {
            if (v[i] % 2 == 0 && foundFirst == false) {
                first = i;
                foundFirst = true;
            }
            if (v[i] % 2 == 0) {
                last = i;
            }
        }
        int suma = 0;
        for (int i = first; i <= last; i++) {
            suma += v[i];
        }
        System.out.println(suma);
    }
}


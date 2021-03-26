package ArrayListParcurgeri;

public class ex4 {
    public static void main(String[] args) {
        // 4. Se citește un vector cu n elemente, numere naturale.
        // Să se afișeze elementele vectorului în următoarea ordine:
        // primul, ultimul, al doilea, penultimul, etc.
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Cate elemente?");
//        int n = scan.nextInt();
        // 1 2 3 4 5 // 1 5 2 4 3
        // cand 0-4, 1-3, 2-2 (pozitii)
        int[] v = {1, 2, 3, 4, 5};
        for (int i = 0; i < v.length / 2; i++) {
            System.out.println(v[i] + " " + v[v.length - 1 - i]);
        }
        if (v.length % 2 == 1) {
            System.out.println(v[v.length / 2]);
        }
    }
}

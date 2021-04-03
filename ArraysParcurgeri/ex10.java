package ArrayListParcurgeri;

public class ex10 {
    public static void main(String[] args) {
        // 10. Se dă un vector cu n numere naturale. Să se determine câte dintre elemente au valoarea
        //strict mai mare decât media aritmetică a elementelor vectorului.
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Cate elemente?");
//        int n = scan.nextInt();
        int[] v = {1, 2, 3, 4, 5, 6, 7};
        int count = 0;
        int sum = 0;
        for (int i = 0; i < v.length; i++) {
            sum += v[i];
        }
        int media = sum / v.length;
        for (int i = 0; i < v.length; i++) {
            if (v[i] > media) {
                count++;
            }
        }
        System.out.println(count + " elemente au valoarea strict mai mare decât media aritmetică " +
                "a elementelor vectorului");
    }
}

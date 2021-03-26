package ArrayListParcurgeri;

public class ex15 {
    public static void main(String[] args) {
        // 15. Se cere determinarea maximului şi minimului valorilor dintr-un sir
        int[] v = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int max = v[0];
        int min = v[0];
        for (int i = 0; i < v.length; i++) {
            if (v[i] > max) {
                max = v[i];
            }
            if (v[i] < min) {
                min = v[i];
            }
        }
        System.out.println("Maxim:" + max + " minim: " + min);
    }
}

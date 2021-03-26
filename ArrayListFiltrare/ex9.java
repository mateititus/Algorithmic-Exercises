package ArrayListFiltrare;

public class ex9 {
    // 9. Se dă un vector cu n elemente, numere naturale. Să se verifice dacă toate elementele
    //vectorului aparţin intervalului închis determinat de primul şi ultimul element.
    public static void main(String[] args) {
        int[] v = {5, 2, 4, 6, 8, 9};
        int primul = v[0];
        int ultimul = v[v.length - 1];
        int count = 0;
        for (int i = 0; i < v.length; i++) {
            if (v[i] > primul && v[i] < ultimul) {
                count++;
            }
        }
        if (count == v.length - 2) {
            System.out.println("Da, toate elementele vectorului apartin intervalului inchis");
        } else
            System.out.println("Nu toate elementele vectorului apartin intervalului inchis");
    }
}

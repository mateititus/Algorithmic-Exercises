package ArrayListFiltrare;

public class ex12 {
    //12. Se dă un şir cu n elemente, numere naturale. Să se verifice dacă există în şir elemente care
    //să aibă ambii vecini de aceeaşi paritate cu el
    public static void main(String[] args) {
        int[] v = {1, 2, 4, 5, 3, 3};
        int count = 0;
        for (int i = 1; i < v.length-1; i++) {
            if (v[i - 1] % 2 == v[i] % 2 && v[i] % 2 == v[i + 1] % 2) {
                count++;
            }
        }
        if (count > 0) {
            System.out.println("Da, exista elemente care sa aiba vecinii de aceeasi paritate");
        } else
            System.out.println("Nu, exista elemente care sa aiba vecinii de aceeasi paritate");
    }
}

package ArrayListParcurgeri;

public class ex6 {
    public static void main(String[] args) {
        // 6. Să se determine indicele(pozitia) maximului şi cel al minimului valorilor elementelor unui
        //vector
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Cate elemente?");
//        int n = scan.nextInt();
        int[] v = {5, 1, 4, 7};
        int max = v[0];
        int min = v[0];
        int pozitieMax = 0;
        int pozitieMin = 0;
        for (int i = 0; i < v.length; i++) {
            if (v[i] > max) {
                max = v[i];
                pozitieMax = i;
            }
            if (v[i] < min) {
                min = v[i];
                pozitieMin = i;
            }
        }
        System.out.println("Maximul este " + max + " si se afla pe pozitia " + pozitieMax + " si minimul " + min + " si se afla pe pozitia " + pozitieMin);
    }
}

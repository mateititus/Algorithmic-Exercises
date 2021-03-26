package Structuri;

public class ex24 {
    public static void main(String[] args) {
        int x = 24, y = 24, z = 42;
        int numereDistincte = 0;

        if (x != y && x != z)
            numereDistincte++;
        if (y != z && y != z)
            numereDistincte++;
        if (z != x && z!= y)
            numereDistincte++;
        System.out.println(numereDistincte);






    }
}

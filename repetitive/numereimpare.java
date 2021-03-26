package repetitive;

public class numereimpare {
    public static void main(String[] args) {
     //Se dă un număr natural n. Afișați în ordine descrescătoare primele n numere naturale impare.
     int x = 10;
     for (int i = x; i>=1 ; i--) {
         if (i%2==1)
             System.out.println(i);
     }
    }
}

package Structuri;

public class varstaIntrePrieteni {
    public static void main(String[] args) {
        //Fiind date vârstele a doi copii afișați care dintre ei este cel mai mare și cu cât. x Andrei y Mihai
        int x = 5, y = 10;
        if (x > y)
            System.out.println("Andrei este mai mare cu " + (x - y) + " ani");
        else if (x < y)
            System.out.println("Mihai este mai mare cu " + (y - x) + " ani");
    }
}

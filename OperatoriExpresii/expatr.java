package OperatoriExpresii;

public class expatr {
    public static void main(String[] args) {
        int a = 5;
        int common = (int) (Math.pow(a, 2) + Math.pow(a, 4));
        int numarator = 3*common;
        int common2 = (int) Math.sqrt(common);
        int numitor = (int) (common + common2);
        System.out.println(numarator / numitor + common2);
    }
}

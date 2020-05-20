package ch04;

public class H {
    public static void main(String[] args) {
        int[] x = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        int total = 0;
        for (int i = 0; i < x.length; i++) {

            total += x[i];
        }
        System.out.println("total = " + total);
    }
}

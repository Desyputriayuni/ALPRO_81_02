package ch04;

public class F {
    public static void main(String[] args) {
        int[] bil = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        System.out.println("bilangan ganjil : ");
        for (int i = 0; i < bil.length; i++) {
            if (bil[i] % 2 != 0) {
                System.out.print(bil[i] + " ");
            }
        }
        System.out.println(" ");
        System.out.println("bilangan genap : ");
        for (int i = 0; i < bil.length; i++) {
            if (bil[i] % 2 == 0) {
                System.out.print(bil[i] + " ");
            }
        }
        System.out.println(" ");
    }
}

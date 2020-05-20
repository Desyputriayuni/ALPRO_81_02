package ch04;

public class G {
    public static void main(String[] args) {
        int[] bil = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        System.out.println("angka kelipatan 5 yang sebelumnya juga kelipatan 5  yaitu:");
        for (int i = 0; i < bil.length; i++) {
            int j = bil[i] % 5;
            if (j == 0){
                j = bil [i -1] % 5;
                if (j == 0){
                    System.out.println(bil[i]);
                }
            }
        }
    }
}

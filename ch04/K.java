package ch04;

public class K {
    public static void main(String[] args) {
        int [] x = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        for (int i = 0; i < 12; i++) {
            int j = i + 1;
            int k = x[j];

            if (x [i] < k){
                System.out.println(x[i] + "");
            }
        }
    }
}

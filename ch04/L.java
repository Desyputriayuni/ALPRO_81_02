package ch04;

public class L {
    public static void main(String[] args) {
        int [] x = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        System.out.println("jumlah angka dengan angka setelahnya bernilai genap = ");

        for(int i = 0; i < 12 ; i++){
            int a = i + 1;
            int b = x[a];
            int j;
            j = x[i] + b;

            int k = j % 2;
            if (k == 0) {

                System.out.println("angka sebelumnya = " + x[i]);
                System.out.println("angka setelahnya = " + b);
                System.out.println("jumlah : " + j);
                System.out.println();
            }
        }
    }
}

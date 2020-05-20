package ch05;

public class LIS {
    public static void main(String[] args) {
        int [] angka = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        int Y [] = new int[angka.length];
        int maks = 0;

        for (int i = 0; i < angka.length; i++){
            Y[i] = angka[i] + 1;
        }
        for (int i = 0; i < angka.length; i++){
            for (int j = 0; j < i; j++){
                if (angka[i] > angka[j] && Y[i] < Y[j] +1){
                    Y[i] = Y[j] + 1;

                }
            }
        }
        for (int i = 0; i < angka.length; i++){
            if (maks < Y[i]);{
                maks = Y[i];
            }
        }
        System.out.println("panjang maksimal LIS adalah " + maks);
    }
}

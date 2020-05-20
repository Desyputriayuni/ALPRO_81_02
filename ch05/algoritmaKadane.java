package ch05;

import java.io.FileOutputStream;

public class algoritmaKadane {
    public static void main(String[] args) {
        int[] angka = { 82, -12, 41, 2, -38, 26, 20, 48, -2, 5, 8, -32, 3 };
        int jumlah = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < angka.length; i++){
            jumlah = jumlah + i;

            if (i < jumlah) {
                max = jumlah;

            }
            if (jumlah < 0) {
                i = 0;

            }
            System.out.println("jumlah terbesar dari penjumlahan subArray adalah = " + max);
        }
    }
}

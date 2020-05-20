package ch03;

import java.util.Scanner;

public class pembagiterkecil {
    public static void main(String[] args) {
        System.out.println("masukkan bilanga = ");
        Scanner sc = new Scanner(System.in);
        int angka = sc.nextInt();
        int x = 3;
        int kecil;

        while (x <= angka) {
            if (angka % x == 0) {
                kecil = x;
                System.out.println(kecil);
            }else {
                if (angka % x == 1) {
                    kecil = x;
                    break;
                }
            }
            x++;
        }
    }
}

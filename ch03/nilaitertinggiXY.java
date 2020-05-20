package ch03;

import java.util.Scanner;

public class nilaitertinggiXY {
    public static void main(String[] args) {
        int x;
        int y;

        Scanner sc = new Scanner(System.in);
        System.out.println(" x = ");
        x = sc.nextInt();

        System.out.println(" y = ");
        y = sc.nextInt();

        if (x > y){
            System.out.println(" x  adalah nilai terbesar");
        } else {
            System.out.println(" y adalah nilai terbesar");
        }

    }
}

package ch03;

import java.util.Scanner;

public class nilaitertinggiXYZ {
    public static void main(String[] args) {
        int x, y, z;

        Scanner sc = new Scanner(System.in);
        System.out.println(" x = ");
        x = sc.nextInt();

        System.out.println(" y = ");
        y = sc.nextInt();

        System.out.println(" z = ");
        z = sc.nextInt();

        if (x > y && x > z){
            System.out.println(" x adalah nilai yang terbesar");
        }else
        if(y > x && y > z){
            System.out.println(" y adalah nilai yang terbesar");
        }else {
            System.out.println(" z adalah nilai yang terbesar");
        }

    }
}

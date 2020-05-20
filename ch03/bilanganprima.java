package ch03;

import java.util.Scanner;

public class bilanganprima {
    public static void main(String[] args) {
        int bil;

        Scanner sc = new Scanner(System.in);
        System.out.println(" masukkan bilangan ");
        bil = sc.nextInt();

        if (bil < 2) {
            System.out.println("bukan");
        } else {
            if (bil == 2) {
                System.out.println("prima");
            } else {
                int x = 2;
                int y = bil % x;
                if (y == 0) {
                    System.out.println("bukan");
                } else {
                    int a = 3;
                    int b;
                    b = bil % a;
                    if (b == 0) {
                        System.out.println("bukan");
                    } else {
                        a = a + 1;
                        b = bil % a;
                        while (b == 0) {
                            a++;
                            b = bil % a;

                        }
                        System.out.println("p");
                    }

                }
            }
        }
    }

}

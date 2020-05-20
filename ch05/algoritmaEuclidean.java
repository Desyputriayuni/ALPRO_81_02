package ch05;

import java.util.Scanner;

public class algoritmaEuclidean {
    public static void main(String[] args) {
        int m;
        int n;
        int r;
        Scanner sc = new Scanner(System.in);

        System.out.println("masukkan m = ");
        m = sc.nextInt();

        System.out.println("masukkan n = ");
        n = sc.nextInt();
        System.out.println();

        if (n == 0){
            System.out.println("PBB ( " + m + "," + n + " ) = " + m);

        }else {
            while (n != 0 ){
                r = m % n;
                m = n;
                n = r;
            }
            System.out.println("PBB ( " + m + "," + n + " ) = " + m);
        }
    }
}

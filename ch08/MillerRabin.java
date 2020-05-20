package ch08;

import java.io.*;
import java.math.*;

public class MillerRabin {
    static int data(int x, int y, int z){
        int res = 1;

        x = x % z;
        while (y > 0){
            if ((y & 1) == 1)
                res = (res * x) % z;
            y = y >> 1;
            x =(x * x) % z;
        }return res;
    }
    static boolean millerTest(int m, int n){
        int a = 2 + (int)(Math.random() % (n - 4));
        int x = data(a,m,n);
        if (x == 1 || x == n -1)
            return true;
        while (m != n-1){
            x = (x * x) % n;
            m *= 2;
            if (x == 1)
                return false;
            if (x == n -1)
                return true;
        }
        return false;

    }
    static boolean isPrima(int n, int k){
        if (n <= 1 || n == 4)
            return false;
        if (n <= 3)
            return true;
        int m = n - 1;
        while (m % 2 == 0)
            m /= 2;
        for (int i = 0; i < k; i++)
            if (!millerTest(m,n))
                return false;
            return true;
    }

    public static void main(String[] args) {
        int k = 4;
        System.out.println("semua bilangan prima" + "lebih kecil dari 100: ");
        for (int n = 1; n < 100; n++)
            if (isPrima(n,k))
                System.out.println(n + " ");
    }
}

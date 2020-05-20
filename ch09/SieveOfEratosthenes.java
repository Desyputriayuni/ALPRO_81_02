package ch09;

public class SieveOfEratosthenes {
    void SieveOfEratosthenes(int n){
        boolean prima [] = new boolean[n + 1];
        for (int i = 0; i < n; i++)
            prima [i] = true;
        for (int p = 2; p * p <= n; p++){
            if (prima[p] == true) {

                for (int i = p * p; i <= n; i += p)
                    prima[i] = false;

            }
        }
        for (int i = 2; i <= n; i++){
            if (prima[i] == true)
                System.out.println(i + " ");
        }
    }

    public static void main(String[] args) {
        int n = 30;
        System.out.print("beikut ini adalah bil prima =");
        System.out.println("lebih kecil / sama dengan " + n);
        SieveOfEratosthenes s = new SieveOfEratosthenes();
        s.SieveOfEratosthenes(n);
    }
}

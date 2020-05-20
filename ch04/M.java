package ch04;

public class M {
    public static void main(String[] args) {
        int [] x = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        int selisih;
        int jumlah = 0;
        for (int a = 0; a < 12; a++){
            int i = a + 1;
            int b;
            b = x[i];

            selisih = x[a] - b;
            jumlah = jumlah + selisih;
            System.out.println();
            System.out.println("indeks ke " + a + " = " + x[a]);
            System.out.println("indeks ke " + i + " = " + x[i]);
            System.out.println("selisih antara kedua indeks = " + selisih);

            System.out.println("jumlah selisih = " + jumlah);
        }
    }
}

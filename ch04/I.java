package ch04;

public class I {public static void main(String[] args) {
    //nilai - array integer
    int nilai []  = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

    //memanggil fungsi selisih()
    selisih(nilai);
}
    static void selisih(int nilai []){
        int nilai_max = nilai[0];//untuk menampung nilai maksimal
        int nilai_min = nilai[0];//untuk menampung nilai minimal

        for (int i = 0; i < nilai.length; i++) {
            //mencari nilai terkecil
            if (nilai[i] < nilai_min)
                nilai_min = nilai[i];

            //mencari nilai terbesar
            if (nilai[i] > nilai_max)
                nilai_max = nilai[i];
        }
        //menghitung selisih
        int selisih = nilai_max - nilai_min;
        System.out.println("selisih nilai = " +selisih);
    }
}

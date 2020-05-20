package ch04;

public class E {
    public static void main(String[] args) {
        int [] angka = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        String hasil = "2";
        for (int a = 0; a < angka.length; a++){
            if (String.valueOf(angka[a]).startsWith(hasil) | String.valueOf(angka[a]).endsWith(hasil)){
                System.out.println(angka[a]);
            }
        }
    }
}

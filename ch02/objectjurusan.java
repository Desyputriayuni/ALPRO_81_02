package ch02;

public class objectjurusan {
    public static void main(String[] args) {
        jurusan j1 = new jurusan();
        jurusan j2 = new jurusan();
        jurusan j3 = new jurusan();

        j1.nama = "Teknik informatika";
        j1.akreditasi = "A";
        j1.jumlahMahasiswa = 1200;

        j2.nama = "Sistem informasi";
        j2.akreditasi = "A";
        j2.jumlahMahasiswa = 1090;

        j3.nama = "Teknik elektro";
        j3.akreditasi = "A";
        j3.jumlahMahasiswa = 750;

        System.out.println("Jurusan 1");
        System.out.println("Nama:" + j1.getNama());
        System.out.println("Akreditasi:" + j1.getAkreditasi());
        System.out.println("Jumlah:" + j1.getJumlahMahasiswa());

        System.out.println("Jurusan 2");
        System.out.println("Nama:" + j2.getNama());
        System.out.println("Akreditasi:" + j2.getAkreditasi());
        System.out.println("Jumlah:" + j2.getJumlahMahasiswa());

        System.out.println("Jurusan 3");
        System.out.println("Nama:" + j3.getNama());
        System.out.println("Akreditasi:" + j3.getAkreditasi());
        System.out.println("Jumlah:" + j3.getJumlahMahasiswa());
    }
}

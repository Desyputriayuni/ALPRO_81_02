package ch02;

public class objectpegawai {
    public static void main(String[] args) {
        pegawai pgw1 = new pegawai();
        pegawai pgw2 = new pegawai();

        pgw1.nik = "123";
        pgw1.nama = "Budi";
        pgw1.jabatan = "staff";
        pgw1.isAktif= true;

        pgw2.nik = "124";
        pgw2.nama = "Cici";
        pgw2.jabatan = "administrasi";
        pgw2.isAktif = true;

        pgw1.cetak();
        System.out.println("==========");
        pgw2.cetak();
    }
}

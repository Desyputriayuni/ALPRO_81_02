package ch02;

public class objectFakultas {
    public static void main(String[] args) {
        fakultas fk1 = new fakultas();
        fakultas fk2 = new fakultas();

        fk1.nama = "Sains dan Teknologi";
        fk1.jumlahmahasiswa = 2354;

        fk2.nama = "Psikologi";
        fk2.jumlahmahasiswa = 1202;

        System.out.println("Fakultas" + fk1.getNama() + ":" + fk1.getJumlahmahasiswa());

        System.out.println("Fakultas" + fk2.getNama() + ":" + fk2.getJumlahmahasiswa());
    }
}

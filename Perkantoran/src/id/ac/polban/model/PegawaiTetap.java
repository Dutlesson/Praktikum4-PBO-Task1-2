package id.ac.polban.model;

public class PegawaiTetap extends Pegawai {
    private double gajiPokok;

    public PegawaiTetap(String nama, String nip, double gajiPokok) {
        super(nama, nip); // pakai super untuk panggil constructor Pegawai
        this.gajiPokok = gajiPokok;
    }

    @Override
    public String toString() {
        return super.toString() + ", Gaji Pokok: " + gajiPokok;
    }
}

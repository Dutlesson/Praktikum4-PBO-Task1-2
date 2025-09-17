package id.ac.polban.model;

public class PegawaiHonorer extends Pegawai {
    private int jamKerja;
    private double upahPerJam;

    public PegawaiHonorer(String nama, String nip, int jamKerja, double upahPerJam) {
        super(nama, nip);
        this.jamKerja = jamKerja;
        this.upahPerJam = upahPerJam;
    }

    @Override
    public String toString() {
        return super.toString() + ", Total Gaji: " + (jamKerja * upahPerJam);
    }
}

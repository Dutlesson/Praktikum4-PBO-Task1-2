package id.ac.polban.model;

public class Absensi {
    private Pegawai pegawai;
    private String tanggal;
    private boolean hadir;

    public Absensi(Pegawai pegawai, String tanggal, boolean hadir) {
        this.pegawai = pegawai;
        this.tanggal = tanggal;
        this.hadir = hadir;
    }

    public Pegawai getPegawai() {
        return pegawai;
    }

    public String getTanggal() {
        return tanggal;
    }

    public boolean isHadir() {
        return hadir;
    }
}

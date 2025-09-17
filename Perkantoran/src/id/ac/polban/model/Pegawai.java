package id.ac.polban.model;

public class Pegawai {
    private String nama;
    private String nip;

    public Pegawai(String nama, String nip) {
        this.nama = nama;
        this.nip = nip;
    }

     public double hitungGaji() {
        return 0; // default, akan dioverride di subclass
    }

    @Override
    public String toString() {
        return "Nama: " + nama + ", NIP: " + nip;
    }
    
    public String getNama() {
        return nama;
    }

    public String getNip() {
        return nip;
    }
}

package id.ac.polban.service;

import id.ac.polban.model.Pegawai;
import id.ac.polban.model.Absensi;
import java.util.ArrayList;
import java.util.List;

public class AbsensiService {
    private static int jumlahAbsensi = 0; // static counter
    
    private List<Absensi> daftarAbsensi = new ArrayList<>();

    public void tambahAbsensi(Absensi absensi) {
        daftarAbsensi.add(absensi);
        jumlahAbsensi++; // increment setiap ada absensi masuk
    }

    public static int getJumlahAbsensi() {
        return jumlahAbsensi;
    }

    // Mengambil semua data absensi
    public List<Absensi> getDaftarAbsensi() {
        return daftarAbsensi;
    }

    // Contoh sederhana: pegawai dengan NIP genap dianggap hadir
    public boolean cekAbsensi(Pegawai pegawai) {
        String nip = pegawai.getNip();
        int lastDigit = Integer.parseInt(nip.substring(nip.length() - 1));
        return lastDigit % 2 == 0; 
    }

    // Membuat absensi otomatis berdasarkan aturan cekAbsensi
    public Absensi buatAbsensi(Pegawai pegawai, String tanggal) {
        boolean hadir = cekAbsensi(pegawai);
        return new Absensi(pegawai, tanggal, hadir);
    }
}

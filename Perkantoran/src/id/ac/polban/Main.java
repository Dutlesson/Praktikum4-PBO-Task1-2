package id.ac.polban;

import id.ac.polban.model.Pegawai;
import id.ac.polban.model.PegawaiTetap;
import id.ac.polban.model.PegawaiHonorer;
import id.ac.polban.model.Absensi;
import id.ac.polban.service.AbsensiService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nama pegawai tetap: ");
        String namaTetap = sc.nextLine();
        System.out.print("Masukkan NIP: ");
        String nipTetap = sc.nextLine();
        System.out.print("Masukkan gaji pokok: ");
        double gajiPokok = sc.nextDouble();
        sc.nextLine(); // biar buffer bersih

        Pegawai p1 = new PegawaiTetap(namaTetap, nipTetap, gajiPokok);

        System.out.print("Masukkan nama pegawai honorer: ");
        String namaHonorer = sc.nextLine();
        System.out.print("Masukkan NIP: ");
        String nipHonorer = sc.nextLine();
        System.out.print("Masukkan jam kerja: ");
        int jamKerja = sc.nextInt();
        System.out.print("Masukkan upah per jam: ");
        double upahPerJam = sc.nextDouble();

        Pegawai p2 = new PegawaiHonorer(namaHonorer, nipHonorer, jamKerja, upahPerJam);

        System.out.println("\nData Pegawai:");
        System.out.println(p1);
        System.out.println(p2);
    }
}

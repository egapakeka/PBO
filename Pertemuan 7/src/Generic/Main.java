package Generic;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
public class Main {
    public static void main(String[] args) {
        Datum<Kucing> datumKucing = new Datum<>();
        datumKucing.setIsi(new Kucing("Oyen"));

        Datum<Anjing> datumAnjing = new Datum<>();
        datumAnjing.setIsi(new Anjing("Gabriel"));

        Datum<Burung> datumBurung = new Datum<>();
        datumBurung.setIsi(new Burung("Feli"));

        System.out.println("Simulasi Kucing:");
        MetodeGenerik.tampilkanPerilaku(datumKucing);

        System.out.println("\nSimulasi Anjing:");
        MetodeGenerik.tampilkanPerilaku(datumAnjing);

        System.out.println("\nSimulasi Burung:");
        MetodeGenerik.tampilkanPerilaku(datumBurung);

        //Ubah nama menggunakan metode mutator
        System.out.println("\nMengubah nama-nama hewan:");
        MetodeGenerik.ubahNamaHewan(datumKucing, "Eong");
        MetodeGenerik.ubahNamaHewan(datumAnjing, "Gok");
        MetodeGenerik.ubahNamaHewan(datumBurung, "Kiw");

        //Tampilkan Semua
        System.out.println("\nSetelah nama diubah:");
        MetodeGenerik.tampilkanPerilaku(datumKucing);
        MetodeGenerik.tampilkanPerilaku(datumAnjing);
        MetodeGenerik.tampilkanPerilaku(datumBurung);
    }
}
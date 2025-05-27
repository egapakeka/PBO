package LatihanMedium;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
public class KontrolSenjata {
    private Senjata senjata;

    public KontrolSenjata(Senjata s) {
        senjata = s;
    }

    public boolean isAdaPeluru() {
        return senjata.getPeluru() > 0;
    }

    public void isiPeluru(int jumlahPeluru) {
        senjata.setPeluru(senjata.getPeluru() + jumlahPeluru);
        System.out.println(">> Peluru berhasil ditambah: " + jumlahPeluru);
    }

    public void menembak(int jumlah) {
        System.out.println(">> Siap menembak " + jumlah + " kali");
        for (int i = 0; i < jumlah; i++) {
            if (isAdaPeluru()) {
                System.out.println(senjata.getBunyi());
                senjata.setPeluru(senjata.getPeluru() - 1);
            } else {
                System.out.println("Gagal tembak, Peluru Habis");
            }
        }
        System.out.println(">> Peluru sisa: " + senjata.getPeluru());
    }

    public void menusuk() {
        senjata.setMenusuk(true);
        System.out.println("MENUSUK...");
    }

    public void pasangBayonet() {
        senjata.setMenusuk(true);
    }
}
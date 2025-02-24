/* Nama File : Garis.java
 * Deskripsi : Aplikasi dari file Garis.java
 * Pembuat : Ega Aryabima/24060123140116
 * Tanggal : Senin, 24 Feb 2025
 */

public class MGaris {
    public static void main(String[] args) {
        // Membuat objek titik
        Titik A = new Titik(2, 3);
        Titik B = new Titik(5, 7);
        Titik C = new Titik(-3, 4);
        Titik D = new Titik(-6, -2);

        // Membuat objek garis
        Garis G1 = new Garis(A, B);
        Garis G2 = new Garis(C, D);
        Garis G3 = new Garis();

        // Menampilkan jumlah garis yang telah dibuat
        System.out.println("Jumlah Garis: " + Garis.getCounterGaris());

        // Menampilkan titik awal dan akhir garis
        System.out.print("Garis 1: "); G1.printT1T2();
        System.out.print("Garis 2: "); G2.printT1T2();
        System.out.print("Garis 3 (default): "); G3.printT1T2();

        // Menampilkan panjang garis
        System.out.println("Panjang Garis 1: " + G1.getPanjangGaris());
        System.out.println("Panjang Garis 2: " + G2.getPanjangGaris());

        // Menampilkan gradien garis
        System.out.println("Gradien Garis 1: " + G1.getGradien());
        System.out.println("Gradien Garis 2: " + G2.getGradien());

        // Menampilkan titik tengah garis
        System.out.print("Titik tengah Garis 1: ");
        G1.getTitikTengah().printTitik();
        System.out.print("Titik tengah Garis 2: ");
        G2.getTitikTengah().printTitik();

        // Menampilkan persamaan garis
        System.out.print("Persamaan Garis 1: "); G1.printRumus();
        System.out.print("Persamaan Garis 2: "); G2.printRumus();

        // Menampilkan apakah garis sejajar
        System.out.println("Apakah Garis 1 sejajar dengan Garis 2? " + G1.isSejajar(G1, G2));
        
        // Menampilkan apakah garis tegak lurus
        System.out.println("Apakah Garis 1 tegak lurus dengan Garis 2? " + G1.isTegakLurus(G1, G2));
    }
}

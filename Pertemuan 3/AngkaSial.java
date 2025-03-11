/**
 * File : AngkaSial.java
 * deskripsi : Program menggunakan exception sendiri untuk menolak angka 13
 * pengenalan klausa 'throw' dan 'throws'
 * nama : Ega Aryabima
 * tanggal : 4 Februari 2025
 */

public class AngkaSial {
    public void  cobaAngka(int angka) throws AngkaSialException{
        if(angka==15){
            throw new AngkaSialException();
        }
        System.out.println(angka + "bukan angka sial");
    }

    public static void main(String[] args){
        AngkaSial as = new AngkaSial();
        try {
            as.cobaAngka(15);
            as.cobaAngka(10);
            as.cobaAngka(12);
        } catch (AngkaSialException ase){
            System.out.println(ase.getMessage());
            System.out.println("sialan angka tidak boleh dimasukan");
        }
    }
}

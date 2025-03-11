/**
 * File : AngkaSialException.java
 * deskripsi : Eksepsi buatan sendiri, menolak angka sial(13) {tahayul}
 * nama : Ega Aryabima
 * tanggal : 4 Maret 2025
 */

public class AngkaSialException extends Exception {
    public AngkaSialException(){
        super("jangan masukan angka 15 karena, haram!!");
    }
}
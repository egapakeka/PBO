/**
 * File : Asersi1.java
 * deskripsi : Program untuk menunjukan asersi
 * nama : Ega Aryabima
 * tanggal : 4 Maret 2025
 */

public class Asersi1{
    public static void main(String[] args){
        int x = 0;
        if (x < 0){
            System.out.println("x harus lebih besar dari nol");
        } else {
            assert (x < 0) : "ada kesalahan code";
            System.out.println("x bilangan negatif");
        }
    }
}
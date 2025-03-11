/**
 * File : Asersi2.java
 * deskripsi : Program untuk menunjukan asersi jari2 ditolak jika bernilai nol
 * nama : Ega Aryabima
 * tanggal : 4 Maret 2025
 */

 // class lingkaran
class Lingkaran{
    private double jarijari;
    public Lingkaran(double jarijari){
        assert (jarijari > 0) : "Jari-jari tidak boleh nol atau negatif";
        this.jarijari = jarijari;
    }
    public double  hitungKeliling   (){
        double keliling = 2 * Math.PI * jarijari;
        return keliling;
    }
}

//class asersi2
public class Asersi2 {
    public static void main(String[] args){
        double jarijari = 0;
        //assert (jarijari > 0) : "Jari-jari tidak boleh nol atau negatif";
        Lingkaran lingkaran1 = new Lingkaran(jarijari);
        double kelilingLingkaran = lingkaran1.hitungKeliling();
        System.out.println("Keliling lingkaran = " + kelilingLingkaran);
    }
}

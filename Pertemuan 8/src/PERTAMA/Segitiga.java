package PERTAMA;
public class Segitiga extends BangunDatar {
    private double alas, tinggi, sisiMiring;

    public Segitiga(double alas, double tinggi, double sisiMiring) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisiMiring = sisiMiring;
    }

    public double hitungLuas() {
        return 0.5 * alas * tinggi;
    }

    public double hitungKeliling() {
        return alas + tinggi + sisiMiring;
    }
}

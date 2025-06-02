package PERTAMA;

public class MainBD {
    public static void main(String[] args) {
        BangunDatarGenerik<Persegi> persegi = new BangunDatarGenerik<>(new Persegi(6));
        BangunDatarGenerik<PersegiPanjang> pp = new BangunDatarGenerik<>(new PersegiPanjang(9, 5));
        BangunDatarGenerik<Segitiga> segitiga = new BangunDatarGenerik<>(new Segitiga(7, 10,4 ));

        System.out.println("Persegi:");
        persegi.tampilkanInfo();

        System.out.println("\nPersegi Panjang:");
        pp.tampilkanInfo();

        System.out.println("\nSegitiga:");
        segitiga.tampilkanInfo();
    }
}

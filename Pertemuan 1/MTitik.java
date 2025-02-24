public class MTitik {
    public static void main(String[] args) {
        // Membuat objek titik
        Titik t1 = new Titik(3, 4);
        Titik t2 = new Titik(-5, 2);
        Titik t3 = new Titik();

        // Menampilkan jumlah titik yang telah dibuat
        System.out.println("Jumlah Titik: " + Titik.getCounterTitik());

        // Menampilkan koordinat titik
        System.out.print("Titik 1: "); t1.printTitik();
        System.out.print("Titik 2: "); t2.printTitik();
        System.out.print("Titik 3: "); t3.printTitik();

        // Menampilkan kuadran titik
        System.out.println("Kuadran Titik 1: " + t1.getKuadran());
        System.out.println("Kuadran Titik 2: " + t2.getKuadran());
        System.out.println("Kuadran Titik 3: " + t3.getKuadran());

        // Menggeser titik
        t1.geser(2, -1);
        System.out.print("Titik 1 setelah digeser: "); t1.printTitik();

        // Menampilkan jarak ke pusat
        System.out.println("Jarak Titik 1 ke pusat: " + t1.getJarakPusat());
        System.out.println("Jarak Titik 2 ke pusat: " + t2.getJarakPusat());

        // Menampilkan jarak antara dua titik
        System.out.println("Jarak Titik 1 ke Titik 2: " + t1.getJarak(t2));

        // Refleksi terhadap sumbu X
        t1.setRefelksiX();
        System.out.print("Titik 1 setelah refleksi terhadap X: "); t1.printTitik();

        // Refleksi terhadap sumbu Y
        t1.setRefelksiY();
        System.out.print("Titik 1 setelah refleksi terhadap Y: "); t1.printTitik();

        // Mendapatkan titik baru setelah refleksi
        Titik refleksiX = t2.getRefleksiX();
        Titik refleksiY = t2.getRefleksiY();
        System.out.print("Titik 2 setelah refleksi terhadap X: "); refleksiX.printTitik();
        System.out.print("Titik 2 setelah refleksi terhadap Y: "); refleksiY.printTitik();
    }
}

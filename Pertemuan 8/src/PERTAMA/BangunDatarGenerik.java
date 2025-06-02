package PERTAMA;

public class BangunDatarGenerik<T extends BangunDatar> {
    private T bangun;

    public BangunDatarGenerik(T bangun) {
        this.bangun = bangun;
    }

    public void tampilkanInfo() {
        System.out.println("Luas: " + bangun.hitungLuas());
        System.out.println("Keliling: " + bangun.hitungKeliling());
    }
}

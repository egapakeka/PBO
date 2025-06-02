package KETIGA;

public class Burung extends Anabul {
    public Burung(String nama) {
        super(nama);
    }

    public void bunyi() {
        System.out.println(nama + " suaranya kurukuk");
    }

    public void gerak() {
        System.out.println(nama + " mabur");
    }
}
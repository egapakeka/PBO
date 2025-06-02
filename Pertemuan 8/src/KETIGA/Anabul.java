package KETIGA;

public abstract class Anabul {
    protected String nama;

    public Anabul(String nama) {
        this.nama = nama;
    }

    public abstract void bunyi();
    public abstract void gerak();

    public String getNama() {
        return nama;
    }
}

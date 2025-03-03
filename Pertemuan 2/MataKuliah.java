public class MataKuliah {
    private String idMatkul;
    private String nama;
    private int sks;

    public MataKuliah() {
        this.idMatkul = "";
        this.nama = "";
        this.sks = 000;
    }

    MataKuliah(String idMatkul, String nama, int sks) {
        this.idMatkul = idMatkul;
        this.nama = nama;
        this.sks = sks;
    }

    String getidMatkul() {
        return this.idMatkul;
    }

    String getnama() {
        return this.nama;
    }

    int getsks() {
        return this.sks;
    }

    void setidMatkul(String idMatkul) {
        this.idMatkul = idMatkul;
    }

    void setnama(String nama) {
        this.nama = nama;
    }   

    void setsks(int sks) {
        this.sks = sks;
    }
}
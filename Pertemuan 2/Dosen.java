public class Dosen {
    private String nip;
    private String nama;
    private String prodi;

    public Dosen() {
        this.nip = "";
        this.nama = "";
        this.prodi = "";
    }

    Dosen(String nip, String nama, String prodi) {
        this.nip = nip;
        this.nama = nama;
        this.prodi = prodi;
    }

    String getnip() {
        return this.nip;
    }

    String getnama() {
        return this.nama;
    }

    String getprodi() {
        return this.prodi;
    }

    void setnip(String nip) {
        this.nip = nip;
    }

    void setnama(String nama) {
        this.nama = nama;
    }

    void setprodi(String prodi) {
        this.prodi = prodi;
    }

}

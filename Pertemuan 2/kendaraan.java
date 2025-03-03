public class kendaraan {
    private String noPlat;
    private String jenis;

    public kendaraan() {
        this.noPlat = "";
        this.jenis = "";
    }

    kendaraan(String noPlat, String jenis) {
        this.noPlat = noPlat;
        this.jenis = jenis;
    }

    String getnoPlat() {
        return this.noPlat;
    }

    String getjenis() {
        return this.jenis;
    }

    void setnoPlat(String noPlat) {
        this.noPlat = noPlat;
    }

    void setjenis(String jenis) {
        this.jenis = jenis;
    }
}
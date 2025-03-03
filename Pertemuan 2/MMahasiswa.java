public class MMahasiswa {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa("24060123140116", "Ega Aryabima", "Informatika");

        Dosen dosen1 = new Dosen("12345", "Heri", "Informatika");
        mhs1.setDosenWali(dosen1);

        kendaraan kendaraan1 = new kendaraan("K 0 NT", "Pesawat");
        mhs1.setKendaraan(kendaraan1);

        System.out.println("\n=== INFORMASI MAHASISWA (Sebelum Tambah Mata Kuliah) ===");
        mhs1.printMhs();
        System.out.println("\nDosen Wali: " + mhs1.getDosenWali().getnama());
        System.out.println("Kendaraan: " + mhs1.getKendaraan().getjenis() + " - " + mhs1.getKendaraan().getnoPlat());

        MataKuliah matkul1 = new MataKuliah("BIO101", "Biologi Dasar", 3);
        MataKuliah matkul2 = new MataKuliah("IF199", "Struktur Data", 4);
        MataKuliah matkul3 = new MataKuliah("MTK69", "Matematika Dasar", 3);

        mhs1.addMatKul(matkul1);
        mhs1.addMatKul(matkul2);
        mhs1.addMatKul(matkul3);

        System.out.println("\n=== DATA MATA KULIAH ===");
        System.out.println("Jumlah Mata Kuliah: " + mhs1.getJumlahMatKul());
        System.out.println("Total SKS: " + mhs1.getJumlahSKS());

        System.out.println("\n=== INFORMASI DETAIL MAHASISWA ===");
        mhs1.printMhs();

        System.out.println("\n=== UJI FUNGSI LAINNYA ===");

        mhs1.setNim("24060123140116");
        System.out.println("NIM setelah diubah: " + mhs1.getNim());

        mhs1.setNama("Ega Aryabima");
        System.out.println("Nama setelah diubah: " + mhs1.getNama());

        mhs1.setProdi("Teknik Informatika");
        System.out.println("Prodi setelah diubah: " + mhs1.getProdi());

        Dosen dosen2 = new Dosen("67860", "Lasmien", "Teknik Informatika");
        mhs1.setDosenWali(dosen2);
        System.out.println("Dosen Wali setelah diubah: " + mhs1.getDosenWali().getnama());

        kendaraan kendaraan2 = new kendaraan("H 4 JI", "Becak");
        mhs1.setKendaraan(kendaraan2);
        System.out.println("Kendaraan setelah diubah: " + mhs1.getKendaraan().getjenis() + " - " + mhs1.getKendaraan().getnoPlat());

        System.out.println("\n=== DATA MATA KULIAH SETELAH MENAMBAH BANYAK MATA KULIAH ===");
        System.out.println("Jumlah Mata Kuliah: " + mhs1.getJumlahMatKul());
        System.out.println("Total SKS: " + mhs1.getJumlahSKS());
    }
}
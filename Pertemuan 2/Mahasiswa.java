import java.util.ArrayList;

public class Mahasiswa {
    private String nim;
    private String nama;
    private String prodi;
    ArrayList<MataKuliah> listMatkul;
    private int jumlahMatKul;
    private Dosen dosenWali;
    private kendaraan kendaraan;
   
    public Mahasiswa() {
        this.nim = "";
        this.nama = "";
        this.prodi = "";
        this.listMatkul = new ArrayList<>();
        this.jumlahMatKul = 0;
        this.dosenWali = null;
        this.kendaraan = null;
    }
   
    public Mahasiswa(String nim, String nama, String prodi) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.listMatkul = new ArrayList<>();
        this.jumlahMatKul = 0;
        this.dosenWali = null;
        this.kendaraan = null;
    }
    
    public String getNim() { 
        return nim; 
    }
    
    public void setNim(String nim) { 
        this.nim = nim; 
    }
    
    public String getNama() { 
        return nama; 
    }
    
    public void setNama(String nama) { 
        this.nama = nama; 
    }
    
    public String getProdi() { 
        return prodi; 
    }
    
    public void setProdi(String prodi) { 
        this.prodi = prodi; 
    }
    
    public Dosen getDosenWali() { 
        return dosenWali; 
    }
    
    public void setDosenWali(Dosen dosenWali) { 
        this.dosenWali = dosenWali; 
    }
    
    public kendaraan getKendaraan() { 
        return kendaraan; 
    }
    
    public void setKendaraan(kendaraan kendaraan) { 
        this.kendaraan = kendaraan; 
    }
    
    public void addMatKul(MataKuliah mk) {
        if (jumlahMatKul < 50) { 
            listMatkul.add(mk);
            jumlahMatKul++;
        } else {
            System.out.println("Mata kuliah sudah mencapai batas maksimum.");
        }
    }
    
    public int getJumlahSKS() {
        int totalSKS = 0;
        for (MataKuliah matkul : listMatkul) {
            totalSKS += matkul.getsks();
        }
        return totalSKS;
    }
    
    public int getJumlahMatKul() {
        return jumlahMatKul;
    }

    public void printMhs() {
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi);
    }
}
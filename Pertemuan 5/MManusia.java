import java.text.ParseException;

public class MManusia {
    public static void main(String[] args) throws ParseException {
        PNS p1 = new PNS("Budi Santoso", "26-06-2005", "Jl. Jalan Jalan", 120000000, "208302032006041002");
        Pengusaha pe1 = new Pengusaha("Akmal Santoso", "18-06-2005", "Jl.jl ke mekah", 12000000, "001-656-733-222-100-7");
        Petani pt1 = new Petani("Merdeka Santoso", "17-07-1945", "Jl. prof sudarto", 7000000, "wonodari");
        PNS p2 = new PNS("Adit Tolongin", "11-04-2015", "Desa Menco", 20000000, "808004212010041002");
        
        p2.setAlamat("Jl. Menuju Tuhan");

        System.out.println("Jumlah Manusia = " + Manusia.getCounterMns());
        System.out.println("Jumlah PNS = " + PNS.getCounterPNS());
        System.out.println("Jumlah Pengusaha = " + Pengusaha.getCounterPengusaha());
        System.out.println("Jumlah Petani = " + Petani.getCounterPetani());

        System.out.println("\nPajak:");
        System.out.println("Pajak PNS p1 = " + p1.hitungPajak());
        System.out.println("Pajak Pengusaha pe1 = " + pe1.hitungPajak());
        System.out.println("Pajak Petani pt1 = " + pt1.hitungPajak());

        System.out.println("\nMasa Kerja:");
        System.out.println("Masa Kerja p1 = " + p1.hitungMasakerja() + " tahun");
        System.out.println("Masa Kerja pe1 = " + pe1.hitungMasakerja() + " tahun");
        System.out.println("Masa Kerja pt1 = " + pt1.hitungMasakerja() + " tahun");

        System.out.println("\nInformasi Detail:");
        System.out.println("\nInformasi P1:");
        p1.cetakInfo();
        System.out.println("\nInformasi Pe1:");
        pe1.cetakInfo();
        System.out.println("\nInformasi Pt1:");
        pt1.cetakInfo();
    }
}
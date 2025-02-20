public class MTitik {
    public static void main(String[] args) {
        System.out.println("==========Membuat Objek Titik==========");
        // Membuat titik T1
        System.out.println("Titik T1:");
        Titik T1 = new Titik();
        Titik T2 = T1;
        T1.setAbsis(3);
        T1.setOrdinat(4);
        T1.printTitik();
        T1.geser(3, 4);
        T1.printTitik();
        T1.setAbsis(10); 
        T1.setOrdinat(10); 
        T2.printTitik(); 
        System.out.println("Berada di kuadran: " + T2.getKuadran());
        System.out.println("Jarak ke pusat: " + T1.getJarakPusat());
        System.out.println("Jarak ke pusat: " + T1.getJarak(T2)); 
        T1.setRefelksiX(); 
        T1.printTitik();         
        T1.setRefelksiY(); 
        T1.printTitik(); 

        System.out.println("Jumlah Objek Titik = " + Titik.getCounterTitik());
        System.out.println("Jumlah Objek Titik = " + Titik.getCounterTitik());
        
    }
}
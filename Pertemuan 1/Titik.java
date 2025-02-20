public class Titik {
    /* States/Atribut */
    double absis;
    double ordinat;
    static int counterTitik = 0;

    /* Behavior/Method */

    // Konstruktor
    Titik(double absis, double ordinat) {
        this.absis = absis;
        this.ordinat = ordinat;
        counterTitik++;
    }
    
    Titik() {
        this(0,0);
    }

    static int getCounterTitik(){
        return counterTitik;
    }

    // Mengembalikan nilai absis
    double getAbsis() {
        return this.absis;
    }

    // Mengembalikan nilai ordinat
    double getOrdinat() {
        return this.ordinat;
    }

    // Mengubah nilai absis
    void setAbsis(double x) {
        this.absis = x;
    }

    // Mengubah nilai ordinat
    void setOrdinat(double y) {
        this.ordinat = y;
    }

    // Menggeser nilai absis dan ordinat masing-masing sejauh x dan y
    void geser(double x, double y) {
        absis += x;
        ordinat += y;
    }

            //mengembalikan nilai kuadran titik
        int getKuadran() {
            if (this.absis > 0 && this.ordinat > 0) {
                return 1;
            } else if (this.absis < 0 && this.ordinat > 0) {
                return 2;
            } else if (this.absis < 0 && this.ordinat < 0) {
                return 3;
            } else if (this.absis > 0 && this.ordinat < 0) {
                return 4;
            } else {
                return 0;
            }
        }

        //mengembalikan nilai jarak titik ke pusat(0,0)
        double getJarakPusat() {
            return Math.sqrt(Math.pow(this.absis, 2) + Math.pow(this.ordinat, 2));
        }

        //mengembalikan nilai jarak antara titik akar(((absis-absis)^2) + ((ordinat-ordinat)^2))
        double getJarak(Titik T){
            return Math.sqrt(Math.pow(this.absis - T.absis, 2) + Math.pow(this.ordinat - T.ordinat, 2));
        }

        //merefleksikan Titik terhadap x(mengubah ordinat)
        void setRefelksiX() {
            this.ordinat = this.ordinat * (-1);
        }
        
        //merefleksikan Titik terhadap y(mengubah absis)
        void setRefelksiY() {
            this.absis = this.absis * (-1);
        }

        //mengembalikan Titik baru yang sudah direfleksikan terhadap x
        Titik getRefleksiX() {
            return new Titik(this.absis, -this.ordinat);
        }

        //mengembalikan Titik baru yang sudah direfleksikan terhadap x
        Titik getRefleksiY() {
            return new Titik(-this.absis, this.ordinat);
        }



    // Mencetak koordinat titik
    void printTitik() {
        System.out.println("Titik (" + absis + ", " + ordinat + ")");
    }
}
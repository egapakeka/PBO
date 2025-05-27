package Generic;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Asus
 */
public abstract class Anabul {
    protected String nama;

    public Anabul(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void ubahNama(String namaBaru) {
        System.out.println("Mengubah nama " + this.nama + " menjadi " + namaBaru);
        this.nama = namaBaru;
    }

    public abstract void bersuara();
    public abstract void bergerak();
}
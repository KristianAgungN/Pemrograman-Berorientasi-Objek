/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5;

/**
 *
 * @author xtian
 */
public class KendaraanDarat extends Kendaraan {
    int jumlahRoda;

    public KendaraanDarat(String nama, int kecepatan, int jumlahRoda) {
        this.nama = nama;
        this.kecepatan = kecepatan;
        this.jumlahRoda = jumlahRoda;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jumlah Roda    : " + jumlahRoda);
    }
}

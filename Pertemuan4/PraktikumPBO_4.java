/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4;

/**
 *
 * @author xtian
 */
public class PraktikumPBO_4 {
    public static void main(String[] args) {
        // Uji coba enkapsulasi dasar dengan objek Kendaraan
        kendaraan mobil1 = new kendaraan("Toyota Avanza", 180, "Bensin");
        mobil1.tampilkanInfoKendaraan();

        System.out.println("----------------------------");

        // Uji coba akses modifier lewat subclass Mobil
        Mobil mobil2 = new Mobil("Honda Civic", 220, "Bensin", 4);
        mobil2.tampilkanInfoKendaraan();  // Diwarisi dari Kendaraan
        mobil2.tampilkanInfoMobil();      // Method khusus Mobil

        System.out.println("----------------------------");

        // jenisMesin bersifat public, jadi bisa diakses langsung
        System.out.println("Akses langsung jenisMesin: " + mobil2.jenisMesin);

        // nama bersifat private, jadi HARUS lewat getter
        System.out.println("Akses lewat getter: " + mobil2.getNama());
    }
}

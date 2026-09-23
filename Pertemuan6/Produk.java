/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum6;

/**
 *
 * @author xtian
 */
public abstract class Produk {
    protected String nama;
    protected double harga;

    public Produk(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }

    // Setiap turunan wajib mendefinisikan cara hitung diskonnya sendiri
    public abstract double hitungDiskon();

    public double getHargaSetelahDiskon() {
        return harga - hitungDiskon();
    }

    @Override
    public String toString() {
        return String.format("%-12s | Harga: Rp%,.0f | Diskon: Rp%,.0f | Bayar: Rp%,.0f",
                nama, harga, hitungDiskon(), getHargaSetelahDiskon());
    }
}
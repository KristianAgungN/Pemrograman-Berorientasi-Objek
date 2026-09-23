/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum6;

/**
 *
 * @author xtian
 */
public class MainBelanja {
    public static void main(String[] args) {
        KeranjangBelanja keranjang = new KeranjangBelanja();

        keranjang.tambahProduk(new Buku("Change Your Habbit", 120000));
        keranjang.tambahProduk(new Buku("Detektif Konan", 100000));
        keranjang.tambahProduk(new Elektronik("Mouse", 300000));
        keranjang.tambahProduk(new Pakaian("Hoodie", 250000));
        keranjang.tambahProduk(new Pakaian("Tanktop", 80000));

        keranjang.tampilkanRincian();
    }
}

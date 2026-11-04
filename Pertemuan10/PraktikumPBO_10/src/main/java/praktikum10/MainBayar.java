/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum10;

/**
 *
 * @author xtian
 */
// Kelas MainBayar
public class MainBayar {
    public static void main(String[] args) {
        // Objek Elektronik
        Pembayaran elektronik = new Elektronik();
        System.out.println("Pajak Elektronik: " + elektronik.hitungPajak(100000));

        // Objek Makanan
        Pembayaran makanan = new Makanan();
        System.out.println("Pajak Makanan: " + makanan.hitungPajak(50000));
    }
}

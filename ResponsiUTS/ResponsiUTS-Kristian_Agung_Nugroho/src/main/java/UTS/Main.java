/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTS;

/**
 *
 * @author xtian
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("1. Output Produk");
        Elektronik laptop = new Elektronik("Laptop", 20000000, 3);
        laptop.tampilkanInfo();

        System.out.println("\n2. Output Pegawai");
        PegawaiTetap Tian = new PegawaiTetap("Tian", 10000000, 15000000);
        Tian.tampilkanInfo();

        System.out.println("\n3. Output Polimorfisme");
        Produk produk = new Makanan("ProteinBar", 16500, "2027-08-15");
        Pegawai pegawai = new PegawaiKontrak("Asep", 5000000, 12);

        produk.tampilkanInfo();
        pegawai.tampilkanInfo();
    }
}

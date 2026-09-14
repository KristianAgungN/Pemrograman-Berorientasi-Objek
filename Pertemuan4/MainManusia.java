/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum4;

/**
 *
 * @author xtian
 */
public class MainManusia {
    public static void main(String[] args) {
        Pekerja pekerja1 = new Pekerja("Villager", 20, "Librarian", 64);
        System.out.println("=== Informasi Awal ===");
        System.out.println(pekerja1);

        pekerja1.setNama("Mending scam");

        System.out.println("\n=== Informasi Setelah Nama Diubah ===");
        System.out.println(pekerja1);

        System.out.println("\n=== Percobaan Akses Langsung ===");
        System.out.println("usia (protected): " + pekerja1.usia);
        System.out.println("pekerjaan (public): " + pekerja1.pekerjaan);
    }
}

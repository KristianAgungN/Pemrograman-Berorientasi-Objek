/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspraktikum3;

/**
 *
 * @author xtian
 */
public class Main {
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil("McLaren", "720S", 2023);
        mobil1.setWarna("Hitam");

        Mobil mobil2 = new Mobil("Ferrari", "488 GTB", 2022);
        mobil2.setWarna("Hitam");

        mobil1.displayInfo();
        System.out.println();
        mobil2.displayInfo();
        System.out.println();

        mobil1.startEngine();
        mobil2.startEngine();
        System.out.println();

        mobil1.ubahWarna("Merah");
        System.out.println();
        mobil1.displayInfo();
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5;

/**
 *
 * @author xtian
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("=== Hierarki Hewan ===");
        Kucing kucing = new Kucing("Oscar");
        kucing.tampilkanInfo();
        kucing.bersuara();

        System.out.println();
        Anjing anjing = new Anjing("Hachiko");
        anjing.tampilkanInfo();
        anjing.bersuara();

        System.out.println("\n=== Hierarki Kendaraan (3 Level) ===");
        Mobil mobil = new Mobil("McLaren 720S", 341, 2);
        mobil.tampilkanInfo();

        System.out.println();
        SepedaMotor motor = new SepedaMotor("Ducati Panigale V4", 299, "V4 1103cc");
        motor.tampilkanInfo();
    }
}

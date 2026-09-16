/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5;

/**
 *
 * @author xtian
 */
public class SepedaMotor extends KendaraanDarat {
    String jenisMesin;

    public SepedaMotor(String nama, int kecepatan, String jenisMesin) {
        super(nama, kecepatan, 2);
        this.jenisMesin = jenisMesin;
    }
    
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jenis Mesin: " + jenisMesin);
    }
}

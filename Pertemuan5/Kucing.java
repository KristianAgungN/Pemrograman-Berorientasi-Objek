/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum5;

/**
 *
 * @author xtian
 */
public class Kucing extends Hewan {
    public Kucing(String nama) {
        super(nama, "Kucing");
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Ciri khas  : Suka tidur di atap rumah");
    }
    @Override
    public void bersuara() {
    System.out.println(nama + " bersuara: Meong!");
    }
}

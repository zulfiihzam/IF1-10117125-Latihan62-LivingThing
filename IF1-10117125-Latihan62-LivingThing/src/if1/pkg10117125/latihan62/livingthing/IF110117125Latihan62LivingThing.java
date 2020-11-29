/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10117125.latihan62.livingthing;

/**
 *
 * Nama  : Zulfi Ihzam Rahmat  
 * Kelas : IF-1
 * Nim   : 10117125 
 * Deskripsi Program : Program ini berisi tentang menampilkan seseorang sedang
 *                     melakukan berjalan, bernafas dan makan.
 *                     
 */
public class IF110117125Latihan62LivingThing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Human human = new Human();
        human.setNama("Zulfi Ihzam Rahmat");
        human.walk(human.getNama());
        human.breath(human.getNama());
        human.eat(human.getNama());
    }
    
}

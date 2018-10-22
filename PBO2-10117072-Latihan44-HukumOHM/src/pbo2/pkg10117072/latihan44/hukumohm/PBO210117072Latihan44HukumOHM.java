/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117072.latihan44.hukumohm;

/**
 *
 * @author
 * NAMA                 : Muhammad Riswanda Hasan
 * KELAS                : PBO2
 * NIM                  : 10117072
 * Deskripsi Program    : Program ini berisi program untuk Menghitung 
 *                        dan menampilkan rumus OHM
 */
public class PBO210117072Latihan44HukumOHM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Baterai btr = new Baterai();
        
        System.out.println("===HUKU OHM===");
        System.out.println("Kuat arus yang mengali pada suatu kawat penghantar"
                + " \nakan berbanding lurus dengan benda potensial \n"
                + "pada ujung-ujung kawat penghantar tersebut \n"
                + "asalkan suhu kawat dijaga konsisten. \n");
        
        btr.getHambatan();
        btr.getKuatArus();
        btr.hitungTegangan();
        
        System.out.println("Kuat Arus       : " +btr.getKuatArus()+ " ampere");
        System.out.println("Hambatan        : " +btr.getHambatan()+ " ohm");
        System.out.println("Hasil Tegangan  : " +btr.hitungTegangan()+ " volt");
    }
    
}

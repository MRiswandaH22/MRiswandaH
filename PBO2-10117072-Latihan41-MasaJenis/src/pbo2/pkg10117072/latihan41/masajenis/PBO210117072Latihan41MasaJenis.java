/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117072.latihan41.masajenis;

/**
 *
 * @author Muhammad Riswanda Hasan
 */
public class PBO210117072Latihan41MasaJenis {

    /**
 * @author
 * NAMA                 : Muhammad Riswanda Hasan
 * KELAS                : PBO2
 * NIM                  : 10117072
 * Deskripsi Program    : Program ini berisi program untuk Menghitung 
 *                        Massa Jenis Bangun datar Kubus
     */
    public static void main(String[] args) {
        
        Kubus kbs = new Kubus();
        
        kbs.setSisi(5);
        kbs.setMassa(250);
        
        System.out.println("====Massa Jenis Kubus====");  
        System.out.println("Sisi \t: " +kbs.getSisi() );  
        System.out.println("Massa \t: " +kbs.getMassa()); 
        
      
       
        System.out.println("=====Hasil Perhitungan=====");
        System.out.println("Volume \t\t: " +kbs.hitungVolume(5));
        System.out.println("Massa jenis \t: " +kbs.hitungMassaJenis(250, +kbs.hitungVolume(5)));
        
        
    }
    
}

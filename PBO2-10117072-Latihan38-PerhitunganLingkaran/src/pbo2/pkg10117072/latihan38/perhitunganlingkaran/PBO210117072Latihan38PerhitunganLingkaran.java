/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117072.latihan38.perhitunganlingkaran;

/**
 *
 * NAMA                 : Muhammad Riswanda Hasan
 * KELAS                : PBO2
 * NIM                  : 10117072
 * Deskripsi Program    : Program ini berisi program untuk menghitung luas 
 *                        lingkaran, dengan beberapa data masukan seperti
 *                        diameter lingkaran
 */
public class PBO210117072Latihan38PerhitunganLingkaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Lingkaran lingkaran = new Lingkaran();

        System.out.println("=======Perhitungan Lingkaran=======");
        lingkaran.validasiInput();
        lingkaran.hasilPerhitungan(lingkaran.diameter);
    }
    
}

    


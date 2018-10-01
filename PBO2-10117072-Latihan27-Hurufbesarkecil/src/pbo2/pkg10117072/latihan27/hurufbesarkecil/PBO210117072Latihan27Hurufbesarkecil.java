/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117072.latihan27.hurufbesarkecil;

import java.util.Scanner;

/**
 *
 * @author
 * NAMA                 : Muhammad Riswanda Hasan
 * KELAS                : PBO2
 * NIM                  : 10117072
 * Deskripsi Program    : Program ini berisi program untuk menampilkan sebuah
 *                        kalimat yang ditulis tidak beraturan, nanti 
 *                        ditampilkan dengan huruf kapital semua 
 *                        dan huruf kecil semua
 */
public class PBO210117072Latihan27Hurufbesarkecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        String  kalimat;
        
        Scanner scanner = new Scanner (System.in);
        
        System.out.print("MASUKAN KALIMAT : ");
       
        kalimat = scanner.nextLine();
        
        System.out.println("====HASIL FORMATING====");
        System.out.println("Huruf Besar :" +kalimat.toUpperCase());
        System.out.println("Huruf Kecil :" +kalimat.toLowerCase());
        
    }
    
}

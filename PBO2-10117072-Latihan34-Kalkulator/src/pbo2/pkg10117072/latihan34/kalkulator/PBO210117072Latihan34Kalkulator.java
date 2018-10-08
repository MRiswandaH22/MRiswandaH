/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117072.latihan34.kalkulator;

import java.util.Scanner;



/**
 *
 * NAMA                 : Muhammad Riswanda Hasan
 * KELAS                : PBO2
 * NIM                  : 10117072
 * Deskripsi Program    : Program ini berisi program untuk Menghitung Sebuah
 *                        Angka seperti Layaknya Kalkulator
 */
public class PBO210117072Latihan34Kalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

       double value1;
       double value2;
        
        System.out.println("===APLIKASI KALKULATOR BILANGAN===");

        Scanner scn = new Scanner (System.in);
        System.out.print("MASUKAN ANGKA KE-1 \t: ");
        value1 = scn.nextDouble();
        
        System.out.print("MASUKAN ANGKA KE-2 \t: ");
        value2 = scn.nextDouble();
        Kalkulator kalkulator = new Kalkulator();
        
        Kalkulator.tambahBilangan(value1,value2);
        Kalkulator.kurangBilangan(value1, value2);
        Kalkulator.kaliBilangan(value1, value2);
        Kalkulator.bagiBilangan(value1, value2);
        Kalkulator.sisaBilangan(value1, value2);
        
        System.out.println("DEVELOPED BY CIWAN");
        
    }   
    
    
}

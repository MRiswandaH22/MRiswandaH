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
class Kalkulator {

    static void tambahBilangan(double value1, double value2) {
        double hasilTambah;
       
    
                
        
        
        
        hasilTambah = value1+value2;
        System.out.println("\nHasil Pertambahan \t: " +hasilTambah);
        
       }

    static void kurangBilangan(double value1, double value2) {
        double hasilKurang;
        hasilKurang = value1-value2;
        System.out.println("Hasil Kurang \t\t: " +hasilKurang);
        
       
    
    }

    static void kaliBilangan(double value1, double value2) {
         double hasilKali;
         hasilKali = value1*value2;
        System.out.println("Hasil Kali \t\t: " +hasilKali);
        
  }

    static void bagiBilangan(double value1, double value2) {
        double hasilBagi;
               hasilBagi = value1/value2;
        System.out.println("Hasil Bagi \t\t: " +hasilBagi);
        
}

    static void sisaBilangan(double value1, double value2) {
        double hasilSisa;
           hasilSisa = value1-value2;
        System.out.println("Hasil Sisa \t\t: " +hasilSisa);
        
   
    
    }
    
}


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117072.latihan25.ejaannama;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA                 : Muhammad Riswanda Hasan
 * KELAS                : PBO2
 * NIM                  : 10117072
 * Deskripsi Program    : Program ini berisi program untuk menampilkan kata
 *                        yang dimana kata itu bisa dieja satu persatu huruf
 */
public class PBO210117072Latihan25EjaanNama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String namaDepan;
        int panjang;
        char huruf;
        
        Scanner scanner = new Scanner (System.in);
        
        System.out.print("Masukkan Nama depan anda untuk di eja :" );
         namaDepan = scanner.next();
         
         //jumlah huruf
         panjang = namaDepan.length();
         System.out.println("Ejaan untuk "+" \""+namaDepan+"\"  adalah");

         for (int i = 0; i< panjang; i++){
             System.out.println("Huruf ke-" +(i+1)+ " : " +namaDepan.charAt(i) );
         }
    
    }
    
    
}

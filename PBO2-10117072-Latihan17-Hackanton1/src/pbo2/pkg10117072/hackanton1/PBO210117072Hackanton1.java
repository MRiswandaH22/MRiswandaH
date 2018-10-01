/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117072.hackanton1;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA                 : Muhammad Riswanda Hasan
 * KELAS                : PBO2
 * NIM                  : 10117072
 * Deskripsi Program    : Program ini berisi program untuk menampilkan tunjangan
 *                        gaji karyawan yang memiliki ketentuan jika sudah
 *                        menikah mendapat tunjangan sebesar 35%
 */
public class PBO210117072Hackanton1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String statusPerkawinan;
        double gajiPokok;
        double nTunjangan;
        double totGaji;
        

                
        Scanner scanner = new Scanner (System.in);
        
        System.out.println("=========PROGRAM TUNJANGAN GAJI============");
        System.out.print(" GAJI POKOK ANDA PERBULAN \t\t\t\t\t: Rp ");
        gajiPokok = scanner.nextDouble();
        
        System.out.print(" STATUS MENIKAH (MENIKAH/BELUM) KETIK DENGAN HURUF BESAR \t: ");
        statusPerkawinan = scanner.next();
        
        
        System.out.println("==========HASIL PERHITUNGAN GAJI===========");
        System.out.println("GAJI POKOK\t\t : " +gajiPokok);
        
        //MENGHITUNG TUNJANGAN
        if (statusPerkawinan.equals("MENIKAH")){
         
            nTunjangan = gajiPokok * 0.35;
        }
        
        else nTunjangan = 0;
        System.out.println("TUNJANGAN\t\t : " +nTunjangan);
        
        //MENGHITUNG GAJI TOTAL
        
        totGaji = gajiPokok + nTunjangan;
        System.out.println("TOTALGAJI\t\t : " +totGaji);
        
    }
    
}

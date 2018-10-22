/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117072.latihan45.cetaknama;

import java.util.Scanner;

/**
 *
 * @author
 * NAMA                 : Muhammad Riswanda Hasan
 * KELAS                : PBO2
 * NIM                  : 10117072
 * Deskripsi Program    : Program ini berisi program untuk Mencetak Nama
 */
public class PBO210117072Latihan45CetakNama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Printer prt = new Printer();
        
        Scanner scn = new Scanner(System.in);
        
        System.out.println("==Aplikasi Pencetak Nama====");
        System.out.print("Masukan nama anda          : ");
        
        prt.setNama(scn.nextLine()) ;
        
        System.out.print("Mau cetak nama berapa Kali : ");
        
        prt.setJmlCetak(scn.nextInt());
        
        prt.cetak(prt.getNama());
        prt.cetak(prt.getJmlCetak(), prt.getNama());
    
    }
    
}

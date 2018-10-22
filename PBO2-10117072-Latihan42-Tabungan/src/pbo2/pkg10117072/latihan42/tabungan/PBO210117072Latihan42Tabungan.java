/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117072.latihan42.tabungan;

import java.util.Scanner;

/**
 *
 * @author
 * NAMA                 : Muhammad Riswanda Hasan
 * KELAS                : PBO2
 * NIM                  : 10117072
 * Deskripsi Program    : Program ini berisi program untuk Menghitung 
 *                        Saldo di ATM
 */
public class PBO210117072Latihan42Tabungan {


    public static void main(String[] args) {

   
        System.out.println("==Program Penarikan Uang===");
        
        Scanner scn = new Scanner(System.in);
        
        System.out.print("Masukan Saldo Awal \t\t: ");
        
        Tabungan tabungan = new Tabungan (scn.nextInt());
        
        System.out.print("Jumlah uang yang diambil \t: ");
        
        tabungan.ambilUang(scn.nextInt());
        
        System.out.println("Saldo Anda Sekarang \t\t: " +tabungan.ambilUang(0));
        
        
        
    
    }
}


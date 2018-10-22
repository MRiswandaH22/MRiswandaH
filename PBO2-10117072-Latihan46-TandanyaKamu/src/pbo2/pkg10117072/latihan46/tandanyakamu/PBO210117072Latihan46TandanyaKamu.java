/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117072.latihan46.tandanyakamu;

import java.util.Scanner;

/**
 *
 * @author
 * NAMA                 : Muhammad Riswanda Hasan
 * KELAS                : PBO2
 * NIM                  : 10117072
 * Deskripsi Program    : Program ini berisi program untuk Menghitung 
 *                        Umur anda saat ini
 */
public class PBO210117072Latihan46TandanyaKamu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Age umur = new Age(2018);
        
        
        Scanner scn = new Scanner(System.in);
        System.out.print("Masukan Tahun Lahir Anda : ");
        
        umur.setYearBirth(scn.nextInt());
        
        
        System.out.println("====Hasil Perhitungan====");
        System.out.println("Tahun Lahir Anda : " +umur.getYearBirth());
        System.out.println("Hari ini Tahun   : " +umur.getYearNow());
        System.out.println("Umur Kamu sampai hari ini adalah " +umur.hitungUmur()+" tahun");
        umur.tandanyaKamu(umur.hitungUmur());
    }
    
}

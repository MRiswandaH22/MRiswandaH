/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117072.latihan37.rataratanilai;

import java.util.Scanner;

/**
 *
 * NAMA                 : Muhammad Riswanda Hasan
 * KELAS                : PBO2
 * NIM                  : 10117072
 * Deskripsi Program    : Program ini berisi program untuk menampilkan sebuah
 *                        data rata-rata nilai mahasiswa 
 */
public class PBO210117072Latihan37RataRataNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        mahasiswa mhs = new mahasiswa();
        Scanner scn = new Scanner(System.in);

        int n;
        System.out.print("Masukkan Banyaknya Mahasiswa : ");
        n = scn.nextInt();

        mhs.HitungTotal(mhs.nilaiMhs, n);
        mhs.HitungRataRataNilaiMhs(mhs.totalNilaiMhs, n);

        System.out.println("\nMaka, Rata-rata Nilainya adalah : " + mhs.HitungRataRataNilaiMhs(mhs.totalNilaiMhs, n));
        

    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117072.latihan21.rataratanilai;

import java.util.Scanner;

/**
 *
 * @author
 * NAMA                 : Muhammad Riswanda Hasan
 * KELAS                : PBO2
 * NIM                  : 10117072
 * Deskripsi Program    : Program ini berisi program untuk menampilkan sebuah
 *                        data rata-rata nilai mahasiswa 
 */
public class PBO210117072Latihan21Rataratanilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int tNilai = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukan Banyaknya Mahasiswa : ");
        int banyakSiswa = scanner.nextInt();

        for (int i = 1; i <= banyakSiswa; i++) {
            System.out.print("Nilai Mahasiswa ke-" + i + " : ");

            int nilai = scanner.nextInt();
            tNilai += nilai;
        }
        
        double nRatarata = (double) tNilai/banyakSiswa;
        System.out.println("Maka, Rata-Rata Nilainya Adalah " +nRatarata);
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117072.latihan24.perbandinganduabuahnilai;

import java.util.Scanner;

/**
 *
 * @author
 * NAMA                 : Muhammad Riswanda Hasan
 * KELAS                : PBO2
 * NIM                  : 10117072
 * Deskripsi Program    : Program ini berisi program untuk menampilkan sebuah
 *                        perbandingan nilai, mana nilai yang terbesar ataupun
 *                        yang terkecil, dan bisa dilakukan beberapa kali
 */
public class PBO210117072Latihan24Perbandinganduabuahnilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int nilaiPertama;
        int nilaiKedua;
        String aksi;

        nilaiPertama = 0;
        nilaiKedua = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("===========Program Perbandingan Nilai==========");

        do {
            System.out.print("Masukan Nilai Pertama \t: ");
            nilaiPertama = scanner.nextInt();
            System.out.print("Masukan Nilai Kedua \t: ");
            nilaiKedua = scanner.nextInt();

            if (nilaiPertama > nilaiKedua) {
                System.out.println("Hasil : " + nilaiPertama + " Lebih besar dari " + nilaiKedua + "\n");
            } else if (nilaiPertama < nilaiKedua) {
                System.out.println("Hasil : " + nilaiPertama + " Lebih kecil dari " + nilaiKedua + "\n");
            } else {
                System.out.println("Hasil : " + nilaiPertama + " sama dengan " + nilaiKedua + "\n");
            }
            System.out.print("Ulangi Aktifitas ? (Ya/Tidak) : ");
            aksi = scanner.next();

            System.out.println("");
        } while (!aksi.equalsIgnoreCase("Tidak"));
    
    }

}

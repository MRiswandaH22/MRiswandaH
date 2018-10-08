/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117072.latihan39.nilaiterbesardanterkecil;

import java.util.Scanner;

/**
 *
 * NAMA                 : Muhammad Riswanda Hasan
 * KELAS                : PBO2
 * NIM                  : 10117072
 * Deskripsi Program    : Program ini berisi program untuk menampilkan sebuah
 *                        nilai nilai terbesar dan terkecil dari beberapa data
 *                        contonya data nilai mahasiswa
 */
public class PBO210117072Latihan39NilaiTerbesarDanTerkecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        petugas ptgs = new petugas();
        Nilai dafNilai = new Nilai();
        Scanner scn = new Scanner(System.in);

        System.out.println("=====Program Nilai Terbesar dan Terkecil Nilai=====");
        ptgs.inputPetugas();
        dafNilai.inputJumlahMhs();

//        input nilai mhs
        for (int i=0; i<dafNilai.jumlahMhs; i++) {
            System.out.print("Masukkan Nilai Mahasiswa ke-" + (i + 1) + " = ");
            dafNilai.nilaiMhs[i] = scn.nextInt();
            dafNilai.hitungNilaiTerbesar(i);
            dafNilai.hitungNilaiTerkecil(i);
        }
        dafNilai.hasilNilaiMhs();

        System.out.println("\nNilai Terbesar adalah "+dafNilai.nBesar);
        System.out.println("Nilai Terkecil adalah "+dafNilai.nKecil);

        System.out.print("\nPetugas : "+ptgs.namaPetugas+"\n");
    
    }
    
}

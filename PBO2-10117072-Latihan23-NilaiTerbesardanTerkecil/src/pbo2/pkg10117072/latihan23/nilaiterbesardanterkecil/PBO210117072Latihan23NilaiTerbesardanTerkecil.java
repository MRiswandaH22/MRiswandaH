/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117072.latihan23.nilaiterbesardanterkecil;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA                 : Muhammad Riswanda Hasan
 * KELAS                : PBO2
 * NIM                  : 10117072
 * Deskripsi Program    : Program ini berisi program untuk menampilkan sebuah
 *                        nilai nilai terbesar dan terkecil dari beberapa data
 *                        contonya data nilai mahasiswa
 */
public class PBO210117072Latihan23NilaiTerbesardanTerkecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String namaPetugas;
        int nMahasiswa;
        int nBesar;
        int nKecil;
        int nilaiMahasiswa[] = new int[20];
        
        System.out.println("===Porgram Nilai Terbesar dan Terkecil Nilai Mahasiswa====");
        
        Scanner scn = new Scanner(System.in);
        System.out.print("Masukan Nama Petugas : " );
        
        namaPetugas = scn.nextLine();
        
        System.out.print("Masukkan Banyaknya Nilai Mahasiswa : ");
        
        nMahasiswa = scn.nextInt();
        
        nBesar = 0;
        nKecil = 100;
        for (int i = 1 ; i<=nMahasiswa; i++){
            System.out.print("Masukkan Nilai Mahasiswa ke-"+i+" = ");
            nilaiMahasiswa[i] = scn.nextInt();
            
            nBesar = ((nBesar<=nilaiMahasiswa[i])?nilaiMahasiswa[i]:nBesar);
            nKecil = ((nKecil>=nilaiMahasiswa[i])?nilaiMahasiswa[i]:nKecil);
        }
        System.out.println("\n"+"======Hasil Nilai Mahasiswa======");
         for (int i = 1; i <= nMahasiswa; i++) {
            System.out.println("Nilai Mahasiswa ke-"+i+" = " + nilaiMahasiswa[i]);
         }
         
         //menampilkan hasil dari nilai terbesar dan nilai terkecil
        System.out.print("\nNilai Terbesar adalah : "+ nBesar);
        System.out.println("\nNilai Terkecil adalah : "+ nKecil);
        System.out.println("\n"+"Petugas : "+ namaPetugas);
    }
    
    
}

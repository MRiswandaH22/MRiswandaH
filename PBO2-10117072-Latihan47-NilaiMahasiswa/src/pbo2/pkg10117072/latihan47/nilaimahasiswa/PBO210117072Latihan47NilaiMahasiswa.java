/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117072.latihan47.nilaimahasiswa;

import java.util.Scanner;

/**
 *
 * @author
 * NAMA                 : Muhammad Riswanda Hasan
 * KELAS                : PBO2
 * NIM                  : 10117072
 * Deskripsi Program    : Program ini berisi program untuk Menampilkan
 *                        Hasil belajar (nilai) dalam satu Semester
 */
public class PBO210117072Latihan47NilaiMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NilaiMahasiswa nMhs = new NilaiMahasiswa();
        
        System.out.println("Masukan Nilai Anda");
        System.out.println("==================");
        
        Scanner scn = new Scanner(System.in);
        System.out.print("QUIZ : ");
        
        nMhs.setQuiz(scn.nextDouble());
        
       
        System.out.print("UTS : ");
        
        nMhs.setUts(scn.nextDouble());
        
       
        System.out.print("UAS : ");
        
        nMhs.setUas(scn.nextDouble());
        
        System.out.println("Nilai Akhir :" +nMhs.nilaiAkhir() );
        System.out.println("Indeks : " +nMhs.indekNilai());
        System.out.println("Keterangan : " +nMhs.keterangan());
        
    }
    
}

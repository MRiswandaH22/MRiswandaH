/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117072.latihan39.nilaiterbesardanterkecil;

import java.util.Scanner;

/**
 * 
 *
 * NAMA                 : Muhammad Riswanda Hasan
 * KELAS                : PBO2
 * NIM                  : 10117072
 * Deskripsi Program    : Program ini berisi program untuk menampilkan sebuah
 *                        nilai nilai terbesar dan terkecil dari beberapa data
 *                        contonya data nilai mahasiswa
 */
public class petugas {
    public String namaPetugas;
    Nilai dafNilai = new Nilai();
    Scanner scn = new Scanner(System.in);

    public void inputPetugas() {
        System.out.print("Masukkan Nama Petugas \t\t: ");
        namaPetugas = scn.next();
    }
}

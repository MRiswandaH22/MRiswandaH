/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117072.latihan35.programtunjangan;

import java.util.Scanner;

/**
 *
 * NAMA                 : Muhammad Riswanda Hasan
 * KELAS                : PBO2
 * NIM                  : 10117072
 * Deskripsi Program    : Program ini berisi program untuk menampilkan tunjangan
 *                        gaji karyawan yang memiliki ketentuan jika sudah
 *                        menikah mendapat tunjangan sebesar 35%
 */
public class PBO210117072Latihan35ProgramTunjangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

  
        Scanner scn = new Scanner(System.in);
        Perkawinan kawin = new Perkawinan();

        System.out.println("===========Program Tunjangan===========");
        System.out.print("Berapa gaji pokok Anda perbulan ? \t: Rp. ");
        kawin.gajiPokok = scn.nextDouble();
        System.out.print("Status Anda? (Menikah/Belum)\t\t: ");
        kawin.status = scn.next();

        kawin.HasilHitung(kawin.status, kawin.gajiPokok);

    }

    
    
}

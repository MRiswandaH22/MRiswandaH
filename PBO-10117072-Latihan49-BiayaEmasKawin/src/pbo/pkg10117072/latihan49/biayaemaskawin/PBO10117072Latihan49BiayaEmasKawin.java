/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.pkg10117072.latihan49.biayaemaskawin;

import java.util.Scanner;

/**
 *
 * @author
 * NAMA                 : Muhammad Riswanda Hasan
 * KELAS                : PBO2
 * NIM                  : 10117072
 * Deskripsi Program    : Program ini berisi program untuk Menghitung 
 *                        Emass kawin di bulan oktober
 */
public class PBO10117072Latihan49BiayaEmasKawin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        Emas mas = new Emas();
        
        Scanner scn = new Scanner (System.in);
        
        System.out.println("Program Emas Kawin");
        System.out.println("==================");
        
        System.out.print("Masukan Berat Emas : " );
        mas.setBerat(scn.nextDouble());
        
        mas.setHargaEmasBulan(570000);
        System.out.println("Harga Emas di bulan Oktober per 1 gram : " +mas.getHargaEmasBulan());
        System.out.println("Total Bayar Pembeli Emas : " +mas.totalBayar(mas.getBerat(), mas.getHargaEmasBulan()));
    }
    
}

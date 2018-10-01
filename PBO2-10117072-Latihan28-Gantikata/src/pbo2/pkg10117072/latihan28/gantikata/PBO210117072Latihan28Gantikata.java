/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117072.latihan28.gantikata;

import java.util.Scanner;

/**
 *
 * @author
 * NAMA                 : Muhammad Riswanda Hasan
 * KELAS                : PBO2
 * NIM                  : 10117072
 * Deskripsi Program    : Program ini berisi program untuk merubah suatu kata 
 *                        yang telah ditulis sebelumnya dan diganti
 *                        oleh kata baru
 */
public class PBO210117072Latihan28Gantikata {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String mKalimat;
        String baruKalimat;
        String gKata;
        String mKata;
        
        System.out.println("===Program Mengganti Kata====");
        
        Scanner scanner = new Scanner (System.in);
        System.out.print("Masukkan Kalimat : ");
        
        mKalimat = scanner.nextLine();
        
        System.out.print("Ganti Kata \t: " );
        gKata = scanner.nextLine();
        
        System.out.print("Menjadi Kata \t: " );
        mKata = scanner.nextLine();
        
        //proses
        baruKalimat =  (mKalimat).replaceAll(gKata, mKata);
    
        //keluaran
        System.out.println("/n====Hasil Formating====");
        System.out.println("Kalimat awal : " +mKalimat);
        System.out.println("Kalimat baru : " +baruKalimat);
    }
    
}

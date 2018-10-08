/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117072.latihan36.targetsaldotabungan;

/**
 *
 * NAMA                 : Muhammad Riswanda Hasan
 * KELAS                : PBO2
 * NIM                  : 10117072
 * Deskripsi Program    : Program ini berisi program untuk menampilkan sebuah
 *                        target saldo yang ingin dicapai setiap bulannya selama
 *                        bulan ke 8
 */
public class PBO210117072Latihan36TargetSaldoTabungan {

    /**
     * @param args the command line arguments
     */
 
      

    public static void main(String[] args) {
        saldoTabungan tab = new saldoTabungan();

        tab.saldo = 3500000;
        tab.bunga = 8;
        int saldoTarget = 6000000;

        tab.HitungLamaSaldoTarget(tab.saldo,saldoTarget);
    }
    
    
}

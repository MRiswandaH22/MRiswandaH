/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117072.latihan20.targetsaldotabungan;

/**
 *
 * @author
 * NAMA                 : Muhammad Riswanda Hasan
 * KELAS                : PBO2
 * NIM                  : 10117072
 * Deskripsi Program    : Program ini berisi program untuk menampilkan sebuah
 *                        target saldo yang ingin dicapai setiap bulannya selama
 *                        bulan ke 8
 */
public class PBO210117072Latihan20Targetsaldotabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int saldoAwal;
        int bungaBulan;
        int saldoTarget;
        
        saldoAwal = 3500000;
        bungaBulan = 0;
    
        while(saldoAwal < 6000000){
        
            bungaBulan = bungaBulan + 1;
            saldoAwal = (int) (saldoAwal + (saldoAwal * 0.08));
            
            String mataUang = String.format("Rp. "
                    + "%,3d", saldoAwal).replaceAll(",", ".");
            System.out.printf("Saldo di bulan ke-" + bungaBulan + " %s%n", mataUang);
        
        }
    }
}
    
    


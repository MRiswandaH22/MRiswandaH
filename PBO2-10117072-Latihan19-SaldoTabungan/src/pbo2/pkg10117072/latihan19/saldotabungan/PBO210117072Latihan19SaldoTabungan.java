/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117072.latihan19.saldotabungan;

/**
 *
 * @author 
 * NAMA                 : Muhammad Riswanda Hasan
 * KELAS                : PBO2
 * NIM                  : 10117072
 * Deskripsi Program    : Program ini berisi program untuk menampilkan sebuah
 *                        isi saldo di bank setiap bulannya, dan memiliki bunga
 *                        sebesar 15%
 */
public class PBO210117072Latihan19SaldoTabungan {


    public static void main(String[] args) {
       
        int saldoAwal = 2500000;
        double bunga = 0.15;
      
        int saldoTabungan;
        double saldoBulanan;
        int i = 0;
       
        
        while (i <= 5){
            saldoBulanan = saldoAwal * bunga;
            saldoAwal = (int) (saldoAwal + saldoBulanan);
            
            i = i + 1;
            
            String mataUang = String.format("Rp.%,3d", saldoAwal).replaceAll(",", ".");
            System.out.printf("Saldo di bulan ke-" + i + " %s%n", mataUang);
        }
        
        
    }
    
}

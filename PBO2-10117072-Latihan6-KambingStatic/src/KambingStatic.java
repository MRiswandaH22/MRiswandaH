/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @ author
 * NAMA                 : Muhammad Riswanda Hasan
 * KELAS                : PBO2
 * NIM                  : 10117072
 * Deskripsi Program    : Program ini berisi program untuk menampilkan data
 *                        benda milik seseorang (Midun;Domba)
 */

public class KambingStatic {

 // NAMA_KAMBING sebagai konstanta
    public static final String NAMA_KAMBING = "MIDUN";
    
    public static void main(String[] args) {
       Mamalia.jumlahKambing = 485000;
        System.out.println(NAMA_KAMBING + " Memiliki Kambing Sebanyak " + Mamalia.jumlahKambing);
        
    }
    
}

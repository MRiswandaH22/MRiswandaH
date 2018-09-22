/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author
 * NAMA                 : Muhammad Riswanda Hasan
 * KELAS                : PBO2
 * NIM                  : 10117072
 * Deskripsi Program    : Program ini berisi program untuk menampilkan data 
 *                        benda (kambing) yang memiliki data masukan
 *                        atau dapat diupdate
 */
public class KambingGlobal {

// Variabel jumlahkambing menjadi variabel instance
  
  int jumlahKambing = 88;
  
  // Method untuk menampilkan jumlah kambing
  public void getJumlahKambing() {
      System.out.println("Jumlah Kambing\t\t\t : " + jumlahKambing);
  }
  
  public void tambahKambing(){
      jumlahKambing = jumlahKambing + 5;
      System.out.println("Jumlah Kambing Setelah Ditambah\t : " + 
                         jumlahKambing);
  }
    public static void main(String[] args) {
      KambingGlobal kambingSusu = new KambingGlobal();
      
      // Menampilkan jumlah kambing yang ada saat program pertama x berjalan
      kambingSusu.getJumlahKambing();
      
      // Menambah satu kambing
      kambingSusu.tambahKambing();
      
      // Menampilkan jumlah kambing yang ada
      kambingSusu.getJumlahKambing();
    }
    
}

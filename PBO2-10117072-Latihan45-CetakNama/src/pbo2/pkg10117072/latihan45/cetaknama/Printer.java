/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117072.latihan45.cetaknama;

/**
 *
 * @author X441UV
 */
public class Printer {
    int jmlCetak;
    String nama;

    public int getJmlCetak() {
        return jmlCetak;
    }

    public void setJmlCetak(int jmlCetak) {
        this.jmlCetak = jmlCetak;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public void cetak (String nama){
        System.out.println("Nama Anda : " +nama);
    }
    public void cetak (int jmlCetak, String nama){
        System.out.println("Hasil Cetak  : " +nama);
        for (int i = 1; i <= jmlCetak; i++) {
            System.out.println(i+". " +nama);    
            
        }
        
    }
}

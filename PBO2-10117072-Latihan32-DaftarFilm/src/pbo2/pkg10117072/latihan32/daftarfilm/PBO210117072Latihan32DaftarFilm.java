/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117072.latihan32.daftarfilm;

/**
 *
 * NAMA                 : Muhammad Riswanda Hasan
 * KELAS                : PBO2
 * NIM                  : 10117072
 * Deskripsi Program    : Program ini berisi program untuk menampilkan
 *                        daftar film yang akan tayang
 */
public class PBO210117072Latihan32DaftarFilm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("===========DAFTAR FILM SEDANG TAYANG======== \n");
       
        Film Film = new Film();
        
       Film.nowPlaying("Venom", "Action ,Horror, Scifi", 8.5, 120);
       Film.nowPlaying("Small Foot", "Animation", 9.0, 96);
       Film.nowPlaying("Crazy Rich Asia", "Comedy", 7.8, 119);
       Film.nowPlaying("Asih", "Horror", 6.0, 100);
        
    }
    
}

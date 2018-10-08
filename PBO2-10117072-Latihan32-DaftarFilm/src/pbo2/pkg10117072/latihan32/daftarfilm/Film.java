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
class Film {
    
    public void nowPlaying (String filmName, String filmGenre, 
            double filmRating, int filmDuration ){
        
        
        System.out.println("Judul Film \t : " +filmName);
        System.out.println("Genre Film \t : " +filmGenre);
        System.out.println("Rating Film \t : " +filmRating);
        System.out.println("Duration Film \t : " +filmDuration+ " Menit \n");
    }

    
    
}

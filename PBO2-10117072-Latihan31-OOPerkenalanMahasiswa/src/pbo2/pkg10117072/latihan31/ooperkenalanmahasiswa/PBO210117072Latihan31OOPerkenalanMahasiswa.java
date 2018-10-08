/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117072.latihan31.ooperkenalanmahasiswa;

/**
 *
 * NAMA                 : Muhammad Riswanda Hasan
 * KELAS                : PBO2
 * NIM                  : 10117072
 * Deskripsi Program    : Program ini berisi program untuk menampilkan
 *                        nama mahasiswa beserta data diri mereka
 */
public class PBO210117072Latihan31OOPerkenalanMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       Mahasiswa mhSiswa = new Mahasiswa();
        
        mhSiswa.perkenalanDiri("10117072", "Muhammad Riswanda Hasan");
        mhSiswa.perkenalanDiri("10117073", "Dadi");
        mhSiswa.perkenalanDiri("10117074", "Tajusy");
        mhSiswa.perkenalanDiri("10117075", "Fandu");
    }
    
}

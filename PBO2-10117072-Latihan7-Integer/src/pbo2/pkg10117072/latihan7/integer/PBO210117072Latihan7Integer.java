/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117072.latihan7.integer;

/**
 *
 * @author 
 * NAMA                 : Muhammad Riswanda Hasan
 * KELAS                : PBO2
 * NIM                  : 10117072
 * Deskripsi Program    : Program ini berisi program untuk menampilkan data
 *                        masukan berupa byte, short, integer, dan long
 */
public class PBO210117072Latihan7Integer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        byte b;
        short s;
        int i;
        long l;
        
        b = 120;
        s = 32767;
        i = 1_000_000_000;
        l = 90000000000L;
        
        System.out.println("byte\t : " + b);
        System.out.println("short\t : " + s);
        System.out.println("int\t : " + i);
        System.out.println("long\t : " + l);
    }
    
}

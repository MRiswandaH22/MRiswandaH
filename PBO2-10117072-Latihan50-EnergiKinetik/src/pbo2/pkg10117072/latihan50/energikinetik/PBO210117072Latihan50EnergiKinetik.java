/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117072.latihan50.energikinetik;

/**
 *
 * @author
 * NAMA                 : Muhammad Riswanda Hasan
 * KELAS                : PBO2
 * NIM                  : 10117072
 * Deskripsi Program    : Program ini berisi program untuk Menghitung 
 *                        Energi kinetik dan Usaha Bola Baseball
 */
public class PBO210117072Latihan50EnergiKinetik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       

        BolaBaseball ball = new BolaBaseball(145, 25);

        System.out.println("PROGRAM HITUNG RUMUS FISIKA");
        System.out.println("===========================\n");

        System.out.print("Massa \t\t: "+ball.getMassa()+ " gram");

        ball.setMassa(ball.getMassa()/1000);

        System.out.println(" atau "+ball.getMassa()+" kilogram");

        System.out.println("Kecepatan \t: "+ball.getKecepatan()+ " m/s");


        System.out.println("\nEnergi Kinetik \t: "+ball.hitungEnergiKinetik()+" joule");
        System.out.println("Usaha bola \t: "+ball.hitungUsaha(0, 25)+" joule");

    }

}
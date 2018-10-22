/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117072.latihan48.kalkulator;

import java.util.Scanner;

/**
 *
 * NAMA                 : Muhammad Riswanda Hasan
 * KELAS                : PBO2
 * NIM                  : 10117072
 * Deskripsi Program    : Program ini berisi program untuk Menghitung 
 *                        suatu masukan seperti halnya Kalkulator
 */
public class PBO210117072Latihan48Kalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Kalkulator klt = new Kalkulator();
       
       Scanner scn = new Scanner(System.in);
       
        System.out.print("VALUE 1 = ");
        klt.setValue1(scn.nextDouble());

        System.out.print("VALUE 2 = ");
        klt.setValue2(scn.nextDouble());

        System.out.println("Tis project shown you how to manage method in java");
    
        System.out.println("Result Ad is = " +klt.add(klt.getValue1(), klt.getValue2()));
        System.out.println("Result Minus is = "+klt.minus(klt.getValue1(), klt.getValue2()));
        System.out.println("Result Multiple is = "+klt.multiplication(klt.getValue1(), klt.getValue2()));
        System.out.println("Result Division is = "+klt.division(klt.getValue1(), klt.getValue2()));
    }
    
}

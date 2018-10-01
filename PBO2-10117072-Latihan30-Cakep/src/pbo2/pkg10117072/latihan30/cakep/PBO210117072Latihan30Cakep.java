/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117072.latihan30.cakep;

import java.util.Scanner;

/**
 *
 * @author
 * NAMA                 : Muhammad Riswanda Hasan
 * KELAS                : PBO2
 * NIM                  : 10117072
 * Deskripsi Program    : Program ini berisi program untuk menampilkan sebuah
 *                        kata atau kalimat yang berwarna. dan juga pertanyaan
 *                        terhadap tugas yang diberikan
 */
public class PBO210117072Latihan30Cakep {


        //Text Color
         public static final String ANSI_RESET = "\u001B[0m";
         public static final String ANSI_BLACK = "\u001B[30m";
         public static final String ANSI_RED = "\u001B[31m";
         public static final String ANSI_GREEN = "\u001B[32m";
         public static final String ANSI_YELLOW = "\u001B[33m";
         public static final String ANSI_BLUE = "\u001B[34m";
         public static final String ANSI_PURPLE = "\u001B[35m";
         public static final String ANSI_CYAN = "\u001B[36m";
         public static final String ANSI_WHITE = "\u001B[37m";
         
         //BACKGROUN COLLOR
         public static final String ANSI_RESET_BACKGROUND = "\u001B[40m";
         public static final String ANSI_BLACK_BACKGROUND = "\u001B[41m";
         public static final String ANSI_RED_BACKGROUND = "\u001B[42m";
         public static final String ANSI_GREEN_BACKGROUND = "\u001B[43m";
         public static final String ANSI_YELLOW_BACKGROUND = "\u001B[44m";
         public static final String ANSI_BLUE_BACKGROUND = "\u001B[45m";
         public static final String ANSI_PURPLE_BACKGROUND = "\u001B[46m";
         public static final String ANSI_CYAN_BACKGROUND = "\u001B[47m";
    
         //METHOD UTAMA
         public static void main (String[] args){
             
         String nJawab;
         Scanner scanner = new Scanner(System.in);
         
        System.out.print(ANSI_RED+"Kamu "+ANSI_RESET);
        System.out.print(ANSI_GREEN+"ngerjain sendiri "+ANSI_RESET);
        System.out.print(ANSI_YELLOW+"latihan 17 sampe "+ANSI_RESET);
        System.out.print(ANSI_BLUE+"latihan 30 ini? \n"+ANSI_RESET);
        System.out.print(ANSI_BLUE+"Jawab "+ANSI_RESET);
        System.out.print(ANSI_RED+"(Yoi/Enggak) : "+ANSI_RESET);
        nJawab = scanner.next();
        
        String jawaban = nJawab.toUpperCase();
        if (jawaban.equals("YOI")){
            System.out.println(ANSI_RED+"CAKEP BENER. "+ANSI_RESET);
            System.out.println(ANSI_CYAN+"GOOD JOB "+ANSI_RESET);
              
        }else {
            System.out.println(ANSI_RED+"TETEP CAKEP SIH. "+ANSI_RESET);
            System.out.println(ANSI_CYAN+"SING PENTING PAHAM KONSEP NYA YEE "+ANSI_RESET);
            System.out.println(ANSI_BLACK+"KEEP THE CODE WORK DUDE "+ANSI_RESET);
            
        }

    }
    
}

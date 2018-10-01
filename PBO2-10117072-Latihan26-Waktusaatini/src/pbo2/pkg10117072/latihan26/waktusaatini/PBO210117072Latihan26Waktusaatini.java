/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117072.latihan26.waktusaatini;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author
 * NAMA                 : Muhammad Riswanda Hasan
 * KELAS                : PBO2
 * NIM                  : 10117072
 * Deskripsi Program    : Program ini berisi program untuk menampilkan tanggal
 *                        dan informasi waktu dengan real time
 */
public class PBO210117072Latihan26Waktusaatini {


   public static void main(String args[]) {

      Date date = new Date();
      Calendar cale = Calendar.getInstance();
      
       // hari dalam format angka
       int daysOfWeek = cale.get(Calendar.DAY_OF_WEEK);
      
       //Format tanggal dan waktu
       SimpleDateFormat formatIndo = new SimpleDateFormat ("dd MMM yyyy  hh:mm:ss ");

       // Array Hari
       String[] starDays = new String[]{"Sabtu","Minggu","Senin","Selasa","Rabu","Kamis","Jumat"};
       
       System.out.println("HARI INI ADALAH HARI : " + (starDays[daysOfWeek])+" ," +formatIndo.format(date));
   
   }
}
    
    

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117072.latihan46.tandanyakamu;

/**
 *
 * @author X441UV
 */
public class Age {
    private int yearBirth;
    private int yearNow;
    private String red;
    


    Age( int yearNow) {
        this.yearNow = yearNow;
    }

   
    
      public int getYearBirth() {
        return yearBirth;
    }

    public void setYearBirth(int yearBirth) {
        this.yearBirth = yearBirth;
    }
    
    public int getYearNow() {
        return yearNow;
    }

    public int hitungUmur(){
        
        return yearNow - yearBirth;
    
}
    public String tandanyaKamu(int umur){
        
        umur = hitungUmur();
       
        if ((umur >= 0)&(umur <=5)){
            System.out.println("Kamu Masih anak anak");
        }
        else if ((umur >= 5 )& (umur <=10)){
            System.out.println("Kamu Bocil");
        }
        else if ((umur >= 10 )& (umur <=13)){
            System.out.println("Kamu Menuju Ganteng");
        }    
        
        else if ((umur >= 13 )& (umur <=19)){
            System.out.println("Kamu Ganteng");
        }    
        
        else if ((umur >= 19 )& (umur <=35)){
            System.out.println("Ganting Tapi Kolot");
        }    
        
        else if ((umur >= 35 )& (umur <=150)){
            System.out.println("Kolot");
        }    else System.out.println("Sudah Punah");
        
        
        return null;
        
        
    }
}

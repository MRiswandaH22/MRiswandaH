/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117072.latihan44.hukumohm;

/**
 *
 * @author X441UV
 */
public class Baterai {
    
    private float kuatArus;
    private float hambatan;

    
  public Baterai (){
  
  }
  public Baterai(float kuatArus, float hambatan){
        this.kuatArus = kuatArus;
        this.hambatan = hambatan;
          
  }
   public float getKuatArus() {
        return kuatArus = (float) 3.0;
    }

   public float getHambatan() {
        return hambatan = (float) 12.0;
    }
   
   public float hitungTegangan(){
       
       return hambatan * kuatArus;
   }
  
    
}

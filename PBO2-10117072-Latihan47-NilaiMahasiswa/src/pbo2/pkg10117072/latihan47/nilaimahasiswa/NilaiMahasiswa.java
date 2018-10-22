/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117072.latihan47.nilaimahasiswa;

/**
 *
 * @author X441UV
 */
public class NilaiMahasiswa {
   private double quiz;
   private double uts;
   private double uas;
   private char indeks;
   private double nilaiAkhir;

    public double getnnilaiAkhir() {
        return nilaiAkhir;
    }

    public void setnilaiAkhir(double nilaiAkhir) {
        this.nilaiAkhir = nilaiAkhir;
    }

    public char getIndeks() {
        return indeks;
    }

    public void setIndeks(char indeks) {
        this.indeks = indeks;
    }
    public double getQuiz() {
        return quiz;
    }

    public void setQuiz(double quiz) {
        this.quiz = quiz;
    }

    public double getUts() {
        return uts;
    }

    public void setUts(double uts) {
        this.uts = uts;
    }

    public double getUas() {
        return uas;
    }

    public void setUas(double uas) {
        this.uas = uas;
    }
      
    
    public double nilaiAkhir(){
        double nA = (0.3*uts)+(0.5*uas)+(0.2*quiz);
       
        return this.nilaiAkhir = nA;
        
    }
    

    
    public char indekNilai(){
        char idx = ' ';
        
        if ((nilaiAkhir >=80)&(nilaiAkhir <=100)){
          idx ='A';
    
        } else if ((nilaiAkhir >=68)&(nilaiAkhir <=80)){
        idx ='B';
    
        } else if ((nilaiAkhir >=56)&(nilaiAkhir <=68)){
        idx ='C';
    
        } else if ((nilaiAkhir >=45)&(nilaiAkhir <=56)){
        idx ='A';
    
        } else if ((nilaiAkhir >=0)&(nilaiAkhir <=45)){
        idx ='A';
    
        }else {
            System.out.println("Tidak Terdeteksi");
        }
      
       return this.indeks = idx;
    }
        
    public String keterangan(){
       String ket =" ";
       
       
       switch (indeks) {
          
           case 'A':
               ket = "Sangat Baik";
               
           break;
           case 'B':
               ket = " Baik";
               
           break;
           
           case 'C':
               ket = "Cukup";
               
           break;
           case 'D':
               ket = "Kurang";
               
           break;
           case 'E':
               ket = "Sangat Kurang";
               
           break;
           
       }
       
       return ket;
            
    }

  
    }

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.pkg10117072.latihan49.biayaemaskawin;

/**
 *
 * @author X441UV
 */
public class Emas {
    
    private double berat;
    private int hargaEmasBulan;

    public int getHargaEmasBulan() {
        return hargaEmasBulan;
    }

    public void setHargaEmasBulan(int hargaEmasBulan) {
        this.hargaEmasBulan = hargaEmasBulan;
    }

    public double getBerat() {
        return berat;
    }

    public void setBerat(double berat) {
        this.berat = berat;
    }
    
    public double totalBayar(double berat, int hargaEmasBulan){
        return berat * hargaEmasBulan;
        
        
    }
    
}

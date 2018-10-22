/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117072.latihan50.energikinetik;

/**
 *
 * @author X441UV
 */
public class BolaBaseball {

    private double massa;

    private double kecepatan;



    public BolaBaseball(double massa, double kecepatan) {

        this.massa=massa;

        this.kecepatan=kecepatan;

    }



    public void setMassa(double massa) {

        this.massa = massa;

    }



    public double getMassa() {

        return massa;

    }



    public double getKecepatan() {

        return kecepatan;

    }



    public double hitungEnergiKinetik() {



    return 0.5*massa*(kecepatan*kecepatan);}



    public double hitungUsaha(double kecAwal, double kecAkhir) {

        double energiKinetik1 = 0.5*massa*(kecAwal*kecAwal);

        double energiKinetik2 = 0.5*massa*(kecAkhir*kecAkhir);

    return energiKinetik2-energiKinetik1;}



}

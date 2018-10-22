/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117072.latihan42.tabungan;

import java.util.Scanner;

/**
 *
 * @author X441UV
 */
public class Tabungan {

    private int saldo;
    
    public Tabungan(int saldo){
        this.saldo = saldo;
        
        
    }
    
    public int ambilUang(int jumlah){
        saldo = saldo - jumlah;
        
        return saldo;
    }
 }

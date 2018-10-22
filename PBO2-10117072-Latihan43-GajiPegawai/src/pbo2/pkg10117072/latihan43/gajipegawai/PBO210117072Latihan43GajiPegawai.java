/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117072.latihan43.gajipegawai;

/**
 *
 * @author
 * NAMA                 : Muhammad Riswanda Hasan
 * KELAS                : PBO2
 * NIM                  : 10117072
 * Deskripsi Program    : Program ini berisi program untuk Menampilkan
 *                        Data gaji Pegawai
 */
public class PBO210117072Latihan43GajiPegawai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    System.out.println("DATA GAJI PEGAWAI CIWAN COMPANY");
    System.out.println("===============================");
    
    GajiPegawai gjPegawai = new GajiPegawai();
    gjPegawai.setNama("Riswan");
    gjPegawai.setAlamat("Kp.Sumur");
    gjPegawai.setUangTranport(250000);
    gjPegawai.setUangTunjangan(300000);
    gjPegawai.setGajiPokok(4500000);
    gjPegawai.setTotalGaji(gjPegawai.getTotalGaji());
    gjPegawai.tampilData(gjPegawai.getNama(), gjPegawai.getAlamat(), 
            gjPegawai.getUangTranport(), gjPegawai.getUangTunjangan(),
            gjPegawai.getGajiPokok(), gjPegawai.getTotalGaji());
    
            }
}
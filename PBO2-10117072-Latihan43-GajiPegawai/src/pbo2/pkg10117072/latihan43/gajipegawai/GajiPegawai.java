/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10117072.latihan43.gajipegawai;

/**
 *
 * @author X441UV
 */
public class GajiPegawai {
    private String nama;
    private String alamat;
    private int uangTranport;
    private int uangTunjangan;
    private int gajiPokok;
    private int totalGaji;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public int getUangTranport() {
        return uangTranport;
    }

    public void setUangTranport(int uangTranport) {
        this.uangTranport = uangTranport;
    }

    public int getUangTunjangan() {
        return uangTunjangan;
    }

    public void setUangTunjangan(int uangTunjangan) {
        this.uangTunjangan = uangTunjangan;
    }

    public int getGajiPokok() {
        return gajiPokok;
    }

    public void setGajiPokok(int gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    public int getTotalGaji() {
        return totalGaji = uangTunjangan + uangTranport + gajiPokok;
    }

    public void setTotalGaji(int totalGaji) {
        this.totalGaji = totalGaji;
    }

    public int totalGaji(int uangTunjangan, int uangTransport, int gajiPokok){
        totalGaji = uangTunjangan + uangTransport + gajiPokok;
        
        return totalGaji;
    }
    public void tampilData( String nama,String alamat,int uangTranport,int uangTunjangan,int gajiPokok,int totalGaji){
        System.out.println(" Data Gaji Pegawai ");
        System.out.println(" ----------------- ");
        System.out.println(" Nama Karyawan \t\t: " +nama);
        System.out.println(" Alamat  \t\t: "+alamat);
        System.out.println(" uang transport  \t: "+uangTranport);
        System.out.println(" uang tunjangan  \t: "+uangTunjangan);
        System.out.println(" uang gaji Pokok  \t: "+gajiPokok);
        System.out.println(" uang Total Gaji  \t: " +totalGaji);
    }
}

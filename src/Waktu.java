/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author khosy
 */
public class Waktu {
    public int pesanBrpJam;
    private String hari;
    private String jam;

    public Waktu(int pesanBrpJam, String hari, String jam) {
        this.pesanBrpJam = pesanBrpJam;
        this.hari = hari;
        this.jam = jam;
    }

    public void setPesanBrpJam(int pesanBrpJam) {
        this.pesanBrpJam = pesanBrpJam;
    }

    public void setHari(String hari) {
        this.hari = hari;
    }

    public void setJam(String jam) {
        this.jam = jam;
    }

    public int getPesanBrpJam() {
        return pesanBrpJam;
    }

    public String getHari() {
        return hari;
    }

    public String getJam() {
        return jam;
    }
    
    public String info(){
        String info = "";
        info += "Pesan Lapangan Untuk Berapa Jam    : " + this.pesanBrpJam + "\n";
        info += "Pada Hari/Tanggal Berapa           : " + this.hari + "\n";
        info += "Jam Berapa?                        : " + this.jam + "\n";        
        return info;
    }
}

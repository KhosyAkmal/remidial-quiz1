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
    private int pesanBrpJam;
    private String hari;
    private String Jam;

    public Waktu(int pesanBrpJam, String hari, String Jam) {
        this.pesanBrpJam = pesanBrpJam;
        this.hari = hari;
        this.Jam = Jam;
    }

    public void setPesanBrpJam(int pesanBrpJam) {
        this.pesanBrpJam = pesanBrpJam;
    }

    public void setHari(String hari) {
        this.hari = hari;
    }

    public void setJam(String Jam) {
        this.Jam = Jam;
    }

    public int getPesanBrpJam() {
        return pesanBrpJam;
    }

    public String getHari() {
        return hari;
    }

    public String getJam() {
        return Jam;
    }
    
    public String info(){
        String info = "";
        info += "Pesan Lapangan Untuk Berapa Jam    : " + this.pesanBrpJam + "\n";
        info += "Pada Hari/Tanggal Berapa           : " + this.hari + "\n";
        info += "Jam Berapa?                        : " + this.Jam + "\n";        
        return info;
    }
}

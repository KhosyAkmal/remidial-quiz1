/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author khosy
 */
public class Lapangan {
    private String lapBrp;
    private Peminjam pinjam;
    private Waktu time;

    public Lapangan(String lapBrp, Peminjam pinjam, Waktu time) {
        this.lapBrp = lapBrp;
        this.pinjam = pinjam;
        this.time = time;
    }

    public void setLapBrp(String lapBrp) {
        this.lapBrp = lapBrp;
    }

    public void setPinjam(Peminjam pinjam) {
        this.pinjam = pinjam;
    }

    public void setTime(Waktu time) {
        this.time = time;
    }

    public String getLapBrp() {
        return lapBrp;
    }

    public Peminjam getPinjam() {
        return pinjam;
    }

    public Waktu getTime() {
        return time;
    }
    
    public String info(){
        String info = "";
        info += "Main di Lapangan Berapa : " + this.lapBrp + "\n";
        info += "Nama/Tim Peminjam: " + this.pinjam + "\n";
        info += "Peminjaman Pada Saat: " + this.time + "\n"; 
        return info;
    }  
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author khosy
 */
public class Pembayaran {
       private int bayarDp;
       private int bayarFull;
       private Waktu time;
       private int hargaPerJam;

    public Pembayaran() {
    }

    public void setTime(Waktu time) {
        this.time = time;
    }

    public void setHargaPerJam(int hargaPerJam) {
        this.hargaPerJam = hargaPerJam;
    }

    public Waktu getTime() {
        return time;
    }

    public int getHargaPerJam() {
        return hargaPerJam;
    } 
       
    public int pembayaranFull(){
        int wkt = this.time.pesanBrpJam;
           return bayarFull = hargaPerJam * wkt;
       }
    
    public int PembayaranDP(){
        int wkt = this.time.pesanBrpJam;
        float dp = (float) 0.5;
        return bayarDp = (int) (hargaPerJam * dp)*wkt;
    }
    
    public String info(){
        String info = "";
        if (bayarDp == PembayaranDP()){
            info += "Permbayaran DP                    : " + this.PembayaranDP() + "\n"+ "Total yang Harus Anda Bayarkan    : "+this.PembayaranDP()*2;
            
        } else if(bayarFull == pembayaranFull()){
            info += "Permbayaran Full        : " + this.pembayaranFull()+ "\n";
        }else {
            System.out.println("Anda Harus memilih tipe Pembayaran");
        }
        return info;
    }         
}

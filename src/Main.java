/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author khosy
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Peminjam khosy = new Peminjam("Khosy", "085250036553");
        Waktu time1 = new Waktu(3, "Senin, 13-08-18", "Jam 4 Sore - 7 Malam");       
        Lapangan lap1 = new Lapangan("Lapangan 1", khosy, time1);
        System.out.println(lap1.info());
        
        Pembayaran bayar1= new Pembayaran();
        bayar1.setHargaPerJam(100000);
        bayar1.setTime(time1);
        int PembayaranDP = bayar1.PembayaranDP();
        System.out.println(bayar1.info());
        
        System.out.println("===========================================================");
        System.out.println("");
        System.out.println("===========================================================");
        
        Peminjam akmal = new Peminjam("Akmal", "08125503367");
        Waktu time2 = new Waktu(4, "Senin, 13-08-18", "Jam 6 Sore - 10 Malam");
        Lapangan lap2 = new Lapangan("Lapangan 2", akmal, time2);
        System.out.println(lap2.info());
        Pembayaran bayar2 = new Pembayaran();
        bayar2.setHargaPerJam(200000);
        bayar2.setTime(time2);
        int pembayaranFull = bayar2.pembayaranFull();
        System.out.println(bayar2.info());  
    }
}

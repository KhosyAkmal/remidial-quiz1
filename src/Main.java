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
        Peminjam pjm = new Peminjam("Khosy", "085250036553");
        Waktu time = new Waktu(3, "Senin, 13-08-18", "Jam 4 Sore - 7 Malam");
        Lapangan lap = new Lapangan("Lapangan 1", pjm, time);
        
        System.out.println(lap.info());
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author khosy
 */
public class Peminjam {
    private String nama;
    private String  noHp;

    public Peminjam(String nama, String noHp) {
        this.nama = nama;
        this.noHp = noHp;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNoHp(String noHp) {
        this.noHp = noHp;
    }

    public String getNama() {
        return nama;
    }

    public String getNoHp() {
        return noHp;
    }
    
    public String info(){
        String info = "";
        info += "Nama Peminjam          : " + this.nama + "\n";
        info += "Nomor Hp Peminjam      : " + this.noHp + "\n";        
        return info;
    }
}

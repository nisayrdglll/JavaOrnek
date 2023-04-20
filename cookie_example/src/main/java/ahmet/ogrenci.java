/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ahmet;

/**
 *
 * @author narve
 */
public class ogrenci {
    int ogrenciid;
    String isim;

    public ogrenci(int ogrenciid, String isim) {
        this.ogrenciid = ogrenciid;
        this.isim = isim;
    }
    
    

    public ogrenci() {
    }

    public String getIsim() {
        return isim;
    }

    public int getOgrenciid() {
        return ogrenciid;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public void setOgrenciid(int ogrenciid) {
        this.ogrenciid = ogrenciid;
    }
    
    
}

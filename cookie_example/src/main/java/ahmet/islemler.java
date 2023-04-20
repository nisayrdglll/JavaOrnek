/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ahmet;

import java.util.ArrayList;

/**
 *
 * @author narve
 */
public class islemler {
    public ArrayList<ogrenci>  test_ahmet(){
    
        ArrayList<ogrenci> ogrenci_liste = new ArrayList<>();
        ogrenci temp = new ogrenci();
        temp.setIsim("Ahmet");
        temp.setOgrenciid(2345);
        ogrenci_liste.add(temp);
        
        ogrenci temp2 = new ogrenci(2345, "Ahmet Müngen");
        ogrenci_liste.add(temp2);
        
        ogrenci_liste.add(new ogrenci(2345, "Ahmet Müngen"));
        
        return ogrenci_liste;
    }
}

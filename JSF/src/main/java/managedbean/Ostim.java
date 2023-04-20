/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package managedbean;

import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author narve
 */
@ManagedBean
@RequestScoped

public class Ostim {
    String uni;

    public String getUni() {
        return uni;
    }

    public void setUni(String uni) {
        this.uni = uni;
    }
    
}

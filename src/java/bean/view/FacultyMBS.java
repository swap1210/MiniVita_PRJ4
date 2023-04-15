/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package bean.view;

import common.MiniVitaStore;
import jakarta.faces.bean.ManagedBean;
import jakarta.faces.bean.ManagedProperty;
import jakarta.faces.bean.ViewScoped;
import java.io.Serializable;
import models.Faculty;

/**
 *
 * @author swapn
 */
@ManagedBean
@ViewScoped
public class FacultyMBS  implements Serializable{
    private Faculty current;
    /**
     * Creates a new instance of FacultyManagedBeanView
     */
    @ManagedProperty(value="#{miniVitaStore}")
    private MiniVitaStore miniVitaStore;
    
    public MiniVitaStore getMiniVitaStore() {
        return miniVitaStore;
    }

    public void setMiniVitaStore(MiniVitaStore miniVitaStore) {
        this.miniVitaStore = miniVitaStore;
    }
    
    public FacultyMBS() {
    }

    public Faculty getCurrent() {
        return current;
    }

    public void setCurrent(Faculty current) {
        System.out.println("Current setting "+current.getEmail());
        this.current = current;
    }
    
    
    
    public String openFaculty(int hashcode){
        this.current = this.miniVitaStore.getFaculty(hashcode);
        return "faculty.xhtml";
    }
}

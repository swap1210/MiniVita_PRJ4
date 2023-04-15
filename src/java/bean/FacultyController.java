/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package bean;

import common.MiniVitaStore;
import jakarta.faces.bean.ApplicationScoped;
import jakarta.faces.bean.RequestScoped;
import jakarta.faces.bean.ManagedBean;
import jakarta.faces.bean.ManagedProperty;
import java.io.Serializable;
import models.Faculty;

/**
 *
 * @author swapn
 */
@ManagedBean
@RequestScoped
public class FacultyController  implements Serializable{
    private Faculty faculty;
    @ManagedProperty(value="#{miniVitaStore}")
    private MiniVitaStore miniVitaStore;

    /**
     * Creates a new instance of NewFacultyController
     */
    public FacultyController() {
        faculty = new Faculty();
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    public MiniVitaStore getMiniVitaStore() {
        return miniVitaStore;
    }

    public void setMiniVitaStore(MiniVitaStore miniVitaStore) {
        this.miniVitaStore = miniVitaStore;
    }
      
    public String tryAddingFaculty(){
        //db code here
        if(!miniVitaStore.getFaculties().contains(faculty)){
               miniVitaStore.getFaculties().add(faculty);
               return "/landing.xhtml";
        }else{
            return "";
        }
    }
    
    
    public String tryDeletingFaculty(int hashCode){
        //db code here
        if(miniVitaStore.removeFaculty(hashCode)){
               return "/landing.xhtml";
        }else{
            return "";
        }
    }
    
    
}
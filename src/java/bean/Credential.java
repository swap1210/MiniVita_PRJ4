/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bean;

/**
 *
 * @author swapn
 */
import common.MiniVitaStore;
import jakarta.faces.bean.ManagedBean;  
import jakarta.faces.bean.ManagedProperty;
import jakarta.faces.bean.SessionScoped;  
import java.io.Serializable;
import models.User;
@ManagedBean(name="credential", eager = true)
@SessionScoped
public class Credential implements Serializable{
    
    private User user = new User();

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

	@ManagedProperty(value="#{miniVitaStore}")
	private MiniVitaStore miniVitaStore;

	//must povide the setter method
	public void setMiniVitaStore(MiniVitaStore miniVitaStore) {
		this.miniVitaStore = miniVitaStore;
	}
    
    
    public String check(){
        if(miniVitaStore.getUsers().contains(user)){
            return "landing.xhtml";
    }
            return "";
        
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Dr. Bala
 */
@ManagedBean(name = "aj", eager = true)
@SessionScoped
public class AJAX {
private String name;
    /**
     * Creates a new instance of UserInfo
     */
    public AJAX() {
    }
   
   public String getName() {
      return name;
   }
   
   public void setName(String name) {
      this.name = name;
   }

}

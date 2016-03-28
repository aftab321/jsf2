/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.jsf2;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Aftab Ahmed Khan
 */

public class IndexBean {
                   private String message = "hello World";
                   
                   public String getMessage(){
                   return message;
                   }
                   public void setMessage(String message){
                   this.message = message;
                   }
}

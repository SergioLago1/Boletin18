/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin.pkg18;

/**
 *
 * @author slagogonzalez
 */
public class Correo {

    private String contido;
    private boolean leido=false;
    
    public Correo(String contido){
        this.contido=contido;
    }
  
    public String toString(){
         return "Correo{" + contido + '}';
    }
    
    public String getContido(){
        return contido;
     }
    public void setContido(){
        this.contido=contido;
    }
    public boolean esLeido(){
        return leido;
    }
     public void setLeido(boolean leido) {
        this.leido = leido;
    }
    
    
    
}

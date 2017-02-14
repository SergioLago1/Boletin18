/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin.pkg18;

import java.util.ArrayList;

/**
 *
 * @author slagogonzalez
 */
public class Buzón {
    
    ArrayList<Correo> email = new ArrayList<Correo>();
    private boolean leido = false;//non lido

    public int numeroDeCorreos() {
        int count = 0;
        for (int i = 0; i < email.size(); i++) {
            if (email.get(i) != null) {
                count++;
            }
        }
        return count;
    }

    public void engadir(Correo c) {
        email.add(c);
    }

    public boolean isLeido() {
        return leido;
    }

    public boolean porLer() {
        for (int i = 0; i < email.size(); i++) {
            if (!email.get(i).esLeido()) {
                return true;
            }
        }
        return false;
    }

    public String amosaPrimerNoLeido() {
        for (int i = 0; i < email.size(); i++) {
            if (!email.get(i).esLeido()) {
                return email.get(i).toString();
            }
        }
        return "Todos los correos leidos.";
    }

    public String amosar(int k) {
        email.get(k).setLeido(true);
        return email.get(k).toString();
    }

    public void elimina(int k) {
        email.remove(k);

    }
}
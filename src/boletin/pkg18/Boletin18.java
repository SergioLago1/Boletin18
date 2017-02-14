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
public class Boletin18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Buzón miBuzon = new Buzón();
     miBuzon.engadir(new Correo("Primer Correo"));
     miBuzon.engadir(new Correo("SegundoCorreo"));
     miBuzon.engadir(new Correo("Tercer correo "));
     System.out.println(miBuzon.amosaPrimerNoLeido());
     System.out.println("Número de correos: " +miBuzon.numeroDeCorreos());
     System.out.println(miBuzon.porLer());
     miBuzon.elimina(2);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agencedevoyage;

/**
 *
 * @author yassine
 */
public class AgenceDeVoyage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // creation de client 
        Client c1 = new Client();
        c1.setNom("oujaa");
        c1.setPrenom("yassine");
        c1.setAge(21);
        c1.setGenre("M");
        c1.setCIN("00000");
        c1.setDateExpirationCIN("20 sep");
        c1.setNumeroPassport("12345");
        c1.setDateExperationPassport("30 oct");
        
        // creation de Formule 
        FormuleDeVoyage f1 = new FormuleDeVoyage();
        f1.setId(1);
        f1.setGenre("chi 7aja ");
        f1.setDescription("bla bla bla bla ");
        f1.setVilleDeDestination("Marrakech");
        f1.setVilleDeRetour("Rabat");
        f1.setPrixTTC(500);
        
        //creation de feedback 
        Feedback fe1 = new Feedback();
        fe1.setNote(1);
        fe1.setmessage("hadchi 3yaaaan 3ndkomm");
        fe1.setC(c1);
        
        // ajouter la formule f1 à client f1
        c1.setF(f1);
        
        // afficher client & son feedback 
        c1.affiche();
        fe1.affiche();
        
        // creation client 2 par copie 
        Client c2 = new Client(c1);
        
        // changer des information de client 2
        c2.setCIN("11111");
        c2.setDateExpirationCIN("2 june");
        c2.setNumeroPassport("89468");
        c2.setDateExperationPassport("20 mars");
        
        // afficher client 2 
        c2.affiche();
        
        
    }
    
}

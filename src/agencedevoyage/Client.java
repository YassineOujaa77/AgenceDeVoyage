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
public class Client {
    private String nom ;
    private String prenom ;
    private int age;
    private String genre ; 
    private FormuleDeVoyage F;
    private String CIN;
    private String dateExpirationCIN;
    private String numeroPassport ;
    private String dateExperationPassport ; 

    public Client() {
    }

    

    public Client(String nom, String prenom, int age, String genre, FormuleDeVoyage F, String CIN, String dateExpirationCIN, String numeroPassport, String dateExperationPassport, Feedback feedback) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.genre = genre;
        this.F = F;
        this.CIN = CIN;
        this.dateExpirationCIN = dateExpirationCIN;
        this.numeroPassport = numeroPassport;
        this.dateExperationPassport = dateExperationPassport;
     
    }
    
    public Client(Client c) {
        this.nom = c.nom;
        this.prenom = c.prenom;
        this.age = c.age;
        this.genre = c.genre;
        this.F = c.F;
        this.CIN = c.CIN;
        this.dateExpirationCIN = c.dateExpirationCIN;
        this.numeroPassport = c.numeroPassport;
        this.dateExperationPassport = c.dateExperationPassport;
        
    }

 

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public int getAge() {
        return age;
    }

    public String getGenre() {
        return genre;
    }

    public FormuleDeVoyage getF() {
        return F;
    }

    public String getCIN() {
        return CIN;
    }

    public String getDateExpirationCIN() {
        return dateExpirationCIN;
    }

    public String getNumeroPassport() {
        return numeroPassport;
    }

    public String getDateExperationPassport() {
        return dateExperationPassport;
    }


    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setF(FormuleDeVoyage F) {
        this.F = F;
    }

    public void setCIN(String CIN) {
        this.CIN = CIN;
    }

    public void setDateExpirationCIN(String dateExpirationCIN) {
        this.dateExpirationCIN = dateExpirationCIN;
    }

    public void setNumeroPassport(String numeroPassport) {
        this.numeroPassport = numeroPassport;
    }

    public void setDateExperationPassport(String dateExperationPassport) {
        this.dateExperationPassport = dateExperationPassport;
    }

    @Override
    public String toString() {
        return "Client{" + "nom=" + nom + ", prenom=" + prenom + ", age=" + age + ", genre=" + genre + ", \n F=" + F + ", \n CIN=" + CIN + ", dateExpirationCIN=" + dateExpirationCIN + ", numeroPassport=" + numeroPassport + ", dateExperationPassport=" + dateExperationPassport + "}\n";
    }
    
    public void affiche(){
        System.out.println(this.toString());
    }
    
    
}

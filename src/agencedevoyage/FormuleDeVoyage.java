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
public class FormuleDeVoyage {
    private String genre ; 
    private int id ;
    private String Description ;
    private String VilleDeDestination ; 
    private String VilleDeRetour;
    private float PrixTTC;

    public FormuleDeVoyage() {
    }

    public FormuleDeVoyage(String genre, int id, String Description, String VilleDeDestination, String VilleDeRetour, float PrixTTC) {
        this.genre = genre;
        this.id = id;
        this.Description = Description;
        this.VilleDeDestination = VilleDeDestination;
        this.VilleDeRetour = VilleDeRetour;
        this.PrixTTC = PrixTTC;
    }
    
     public FormuleDeVoyage(FormuleDeVoyage f) {
        this.genre = f.genre;
        this.id = f.id;
        this.Description = f.Description;
        this.VilleDeDestination = f.VilleDeDestination;
        this.VilleDeRetour = f.VilleDeRetour;
    }

    public String getGenre() {
        return genre;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return Description;
    }

    public String getVilleDeDestination() {
        return VilleDeDestination;
    }

    public String getVilleDeRetour() {
        return VilleDeRetour;
    }

    public float getPrixTTC() {
        return PrixTTC;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public void setVilleDeDestination(String VilleDeDestination) {
        this.VilleDeDestination = VilleDeDestination;
    }

    public void setVilleDeRetour(String VilleDeRetour) {
        this.VilleDeRetour = VilleDeRetour;
    }

    public void setPrixTTC(float PrixTTC) {
        this.PrixTTC = PrixTTC;
    }

    @Override
    public String toString() {
        return "FormuleDeVoyage{" + "genre=" + genre + ", id=" + id + ", Description=" + Description + ", VilleDeDestination=" + VilleDeDestination + ", VilleDeRetour=" + VilleDeRetour + ", PrixTTC=" + PrixTTC + '}';
    }
    
    public void affiche(){
        System.out.println(this.toString());
    }
    
}

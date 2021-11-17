package agencedevoyage;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yassine
 */
public class Feedback {
    private int note ; 
    private String message ; 
    private Client c; 

    public Feedback() {
    }

    public Feedback(int note, String message) {
        this.note = note;
        this.message = message;
    }
    public Feedback(Feedback fe) {
        this.note = fe.note;
        this.message = fe.message;
    }

    public int getNote() {
        return note;
    }

    public String getmessage() {
        return message;
    }

    public Client getC() {
        return c;
    }
    
    

    public void setNote(int note) {
        this.note = note;
    }

    public void setmessage(String message) {
        this.message = message;
    }

    public void setC(Client c) {
        this.c = c;
    }
    
    

    @Override
    public String toString() {
        return "Feedback{" + "note=" + note + ", message=" + message + "} \n";
    }
    
    public void affiche(){
        System.out.println(this.toString());
    }
    
}

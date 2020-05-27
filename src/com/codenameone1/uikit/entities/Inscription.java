/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codenameone1.uikit.entities;

/**
 *
 * @author bhk
 */
public class Inscription {
    private int id;
    private String nomEnfant, Club;

    public Inscription( String nomEnfant, String Club) {
        this.nomEnfant = nomEnfant;
        this.Club = Club;
        
    }

    public String getClub() {
        return Club;
    }

    public Inscription(int id) {
        this.id = id;
    }

    public void setClub(String Club) {
        this.Club = Club;
    }
    
    

    

    public String getNomEnfant() {
        return nomEnfant;
    }

    public void setNomEnfant(String nomEnfant) {
        this.nomEnfant = nomEnfant;
    }
       

    public Inscription() {
        
    }

    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    

    

    @Override
    public String toString() {
        return "\n" + "\nid=" + id + ", \nNomClub=" + Club + ", \nNomEnfant=" + nomEnfant + '}';
    }
    
    
    
}

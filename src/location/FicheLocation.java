/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package location;

import java.util.ArrayList;

/**
 *
 * @author Vaiarii_Tepa
 */
public class FicheLocation {
    
    private Voiture voiture;
    private Client client;
    private int duree;
    
    public FicheLocation(Client client_save,Voiture voiture_save, int duree){
        this.client = client_save;
        this.voiture = voiture_save;
        this.duree = duree;
    }
    
    /**
     * Constructeur par default
     */
    public FicheLocation(){
        
    }
    
    /**
     * getDuree
     * @return 
     */
    public int getDuree(){
        return this.duree;
    }
    
    /**
     * setDuree
     * @param duree 
     */
    public void setDuree(int duree){
        this.duree = duree;
    }
    
    
    
    public void setListClient(Client client){
        this.client = client;
    }
    
    public Client getListClient(){
        return this.client;
    }
    
    public void setListVoiture(Voiture voiture){
        this.voiture = voiture;
    }
    
    public Voiture getListVoiture(){
        return this.voiture;
    }
}

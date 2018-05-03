package location;

public class Company {
    
    private Voiture voiture;
    private Client client;
    
    public Company(Voiture voiture, Client client){
        this.voiture = voiture;
        this.client = client;
    }
    
    public Company(){
        
    }
    
    /**
     * accesseur
     * @return 
     */
    public Voiture getVoiture(){
        return this.voiture;
    }
    
    /**accesseur
     * SetVoiture
     * @param voiture
     */
    public void setVoiture(Voiture voiture){
        this.voiture = voiture;
    }
    
    /**
     * accesseur
     * @return 
     */
    public Client getClient(){
        return this.client;
    }
    
    /**
     * accesseur
     */
    public void setClient(){
        this.client = client;
    }
    
    
    
}

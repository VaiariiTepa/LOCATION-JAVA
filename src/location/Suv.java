package location;

public class Suv extends Voiture{
    
    public Suv(int immatriculation, int passenger,int prix,int type){
            
            this.immatriculation = immatriculation;
            this.passenger = passenger;
            this.prix = prix;
            this.disponibilite = 1;
            this.totalKilometre = totalKilometre;
            this.nbLocation = nbLocation;
            this.type = type;
        }
    
    /**
     * Constructeur par default
     */
    public Suv(){
        
    }
}

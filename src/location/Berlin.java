package location;

import java.util.ArrayList;

public class Berlin extends Voiture{
    // v to vehicule
    private static final ArrayList<Voiture> v = new ArrayList<Voiture>();
    // cl to client
    private static final ArrayList<Client> cl = new ArrayList<Client>();
    
    public Berlin(int immatriculation, int passenger,int prix,int type){
            
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
    public Berlin(){
       
    }
    
    

}

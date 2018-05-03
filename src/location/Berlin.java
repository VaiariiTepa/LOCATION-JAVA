package location;

import java.util.ArrayList;

public class Berlin extends Voiture {
            
    
    //Liste de voiture
    private static final ArrayList<Voiture> voiture = new ArrayList<Voiture>();
    //Liste de clients
    private static final ArrayList<Client> clients = new ArrayList<Client>();
    
    public Berlin() {
        
    }
    
    public Berlin(int immatriculation, int passenger,int prix,int type){
            
        this.numImmatricul = immatriculation;
        this.nbrPassage = passenger;
        this.Tarife = prix;
        this.verife = true;
        this.totalKilometre = totalKilometre;
        this.nbLocation = nbLocation;
        this.type = type;
    }

   

    
    
    
}

package location;

/**
 * 
 * @author tepav
 */
public class Citadine extends Voiture {

    
        /**
         * 
         * @param immatriculation
         * @param passenger
         * @param prix
         * @param totalKilometre
         * @param disponibilite
         * @param nbLocation
         * @param type 
         */
        public Citadine(int immatriculation,int passenger,int prix,int totalKilometre,boolean disponibilite,int nbLocation,String type){
            
            this.immatriculation = immatriculation;
            this.passenger = passenger;
            this.prix = prix;
            this.disponibilite = 1;
            this.totalKilometre = totalKilometre;
            this.nbLocation = nbLocation;
            //this.type = type;
        }
        
        /**
         * Constructeur par default
         */
        public Citadine(){
            
        }
        
    
}

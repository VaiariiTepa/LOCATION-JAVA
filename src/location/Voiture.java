package location;


/**
 * 
 * @author tepav
 */
public class Voiture {
   protected int immatriculation;
   protected int passenger;
   protected int prix;
   protected int totalKilometre = 0;
   protected int disponibilite = 1;
   protected int nbLocation;
   protected int type;
   
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
   public Voiture(int immatriculation,int passenger,int prix) {
       
       this.immatriculation = immatriculation;
       this.passenger = passenger;
       this.prix = prix;
   }
   
   /**
    * Constructeur par default
    */
   public Voiture(){
       
   }
   
   /**
    * 
    * @return 
    */
   protected int getImmatriculation() {
       return this.immatriculation;
   }
   
   /**
    * 
    * @param newImmatriculation 
    */
   protected void setImmatriculation(int newImmatriculation) {
       this.immatriculation = newImmatriculation;
   }
   
   /**
    * 
    * @return 
    */
   protected int getPassenger() {
       return this.passenger;
   }
   
   /**
    * 
    * @param qt 
    */
   protected void setPassenger(int qt) {
       this.passenger = qt;
   }
   
   /**
    * 
    * @return 
    */
   protected int getprix() {
       return this.prix;
   }
   
   /**
    * 
    * @param cout 
    */
   protected void setprix(int cout) {
       this.prix= cout;
   }
   
   /**
    * 
    * @return 
    */
   protected int gettotalKilometre() {
       return this.totalKilometre;
   }
   
   /**
    * 
    * @param valeur 
    */
   protected void settotalKilometre(int valeur) {
       this.totalKilometre = valeur;
   }
   
   /**
    * 
    * @return 
    */
   protected int isdisponibilite() {
       return this.disponibilite;
   }
   
   /**
    * 
    * @param valeur 
    */
   protected void setAvailable(int valeur) {
       this.disponibilite = valeur;
   }
   
   /**
    * 
    * @return 
    */
   protected int getnbLocation() {
       return this.nbLocation;
   }
   
   /**
    * 
    * @param valeur 
    */
   protected void setRentalQty(int valeur) {
       this.nbLocation = valeur;
   }
   
  // protected String getType() {
   //    return this.type;
   //}
   
   //protected void setType(String newType) {
   //    this.type = newType;
  // }

 
}
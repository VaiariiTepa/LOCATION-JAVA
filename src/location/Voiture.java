package location;

public class Voiture {
    
    protected int type;
    protected int numImmatricul;
    protected int nbrPassage;
    protected int Tarife;
    protected int totalKilometre = 0;
    protected boolean verife;
    protected int nbLocation;
    protected int id;
    
    
    
    public static int COUNT =0;
    
    public Voiture() {
        COUNT ++;
        this.id = COUNT;
    }

    public Voiture(int type) {
        this.type = type;
    }
    
    public Voiture(int immatriculation,int passenger,int prix) {
       
       this.numImmatricul = immatriculation;
       this.nbrPassage = passenger;
       this.Tarife = prix;
   }
    
    public int getId() {
        return id;
    }

    public void setString(int type){
        this.type = type;
    }
    
    public int getType() {
        return type;
    }

    public int getNumImmatricul() {
        return numImmatricul;
    }

    public void setNumImmatricul(int numImmatricul) {
        this.numImmatricul = numImmatricul;
    }

    public int getNbrPassage() {
        return nbrPassage;
    }

    public void setNbrPassage(int nbrPassage) {
        this.nbrPassage = nbrPassage;
    }

    public int getTarife() {
        return Tarife;
    }

    public void setTarife(int Tarife) {
        this.Tarife = Tarife;
    }
    
    public int getTotalKilometre() {
        return totalKilometre;
    }

    public void setTotalKilometre(int valeur) {
        this.totalKilometre = valeur;
    }
    
    public boolean verife(int vérife) {
        if (vérife == 0){
            return true;
            
        }
        
        return false;
    }
    
    public void setNbLocation( int nbLocation) {
        this.nbLocation = nbLocation;
    }
    
    public int getNbLocation() {
        return nbLocation;
    }

    public static int getCOUNT() {
        return COUNT;
    }

    public static void setCOUNT(int COUNT) {
        Voiture.COUNT = COUNT;
    }

    

    

        
}

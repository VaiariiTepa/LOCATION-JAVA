package location;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Location {
    
    // v to vehicule
    private static final ArrayList<Voiture> v = new ArrayList<Voiture>();
    // b to berlin
    private static final ArrayList<Berlin> b = new ArrayList<Berlin>();
    // c to citadine
    private static final ArrayList<Citadine> c = new ArrayList<Citadine>();
    // s to SUV
    private static final ArrayList<Suv> s = new ArrayList<Suv>();
    // cl to client
    private static final ArrayList<Client> cl = new ArrayList<Client>();
    // fl to fiche location
    private static final ArrayList<FicheLocation> fl = new ArrayList<FicheLocation>();
    
    private static int prix;
    private static int select_vehicule;
    private static int select_client;
    
    
    /**
     * 
     * @param args 
     */
    public static void main(String[] args) {
        init();
        Menu_principal();
    }
    
    public static void Menu_principal(){
        FicheLocation fichelocation = new FicheLocation();
        
        // Local variable
        int swValue;

        // Display menu graphics
        System.out.println("=================================");
        System.out.println("|   MENU PRINCIPAL              |");
        System.out.println("=================================");
        System.out.println("|                               |");
        System.out.println("| 1. Acquérir voiture           |");
        System.out.println("| 2. Enregistrer nouveau client |");
        System.out.println("| 3. Louer véhicule             |");
        System.out.println("| 4. Rendre véhicule            |");
        System.out.println("| 0. Quitter                    |");
        System.out.println("|                               |");
        System.out.println("=================================");
        swValue = Keyin.inInt(" Votre choix : ");

        // Switch construct
        switch (swValue) {
            case 1:
              System.out.println("Acquérir voiture");
              //choix type voiture
              choixVoiture_acquisition();
              break;
            case 2:
              System.out.println("Enregistrer nouveau client");
              inscription();
              break;
            case 3:
              Save_fiche_Liste_client();
              break;
            case 4:
                System.out.println("Rendre véhicule");
              Rendre_vehicule();
              break;
            case 0:
                System.out.println("Quitter");
              break;
            default:
              System.out.println("Default");
              break; // This break is not really necessary
        }
        
    }
    
    /**
     * Donnée initial
     */
    public static void init(){
       //Liste Vehicule
       c.add(new Citadine(12,3,2000,0));
       c.add(new Citadine(21,2,1200,0));
       c.add(new Citadine(32,2,1300,0));
       
       b.add(new Berlin(78459621,4,3000,1));
       b.add(new Berlin(651236,1,3070,1));
       b.add(new Berlin(8459,4,3026,1));
       
       s.add(new Suv(78459621,4,3780,2));
       s.add(new Suv(96217845,8,4500,2));
       s.add(new Suv(96278451,7,3450,2));
       
       //Liste Client
       cl.add(new Client("Tulipe","Maezzena",21,999));
       cl.add(new Client("Paté","Taylor",30,777));
       //Liste Location
       fl.add(new FicheLocation(new Client("Tulipe","Maezzena",21,999),new Berlin(12345,5,1500,1),4));
       fl.add(new FicheLocation(new Client("Paté","Tobleronne",30,777),new Berlin(54321,5,1000,1),9));
    }
    
    /**
     * Acquisition d'un nouveau véhicule
     */
    public static void newVehicule_citadine(){
        Citadine citadine = new Citadine();
        
        int immatriculation = Keyin.inInt("Immatriculation du véhicule");
        citadine.setImmatriculation(immatriculation);
        
        int passenger = Keyin.inInt("Nombre de passager");
        citadine.setPassenger(passenger);
        
        int prix = Keyin.inInt("Tarif par jour");
        citadine.setprix(prix);
        
        c.add(citadine);
        
        for(int i = 0;i<c.size();i++){
            System.out.println("immatriculation "+c.get(i).getImmatriculation()
                                +" - "+c.get(i).getPassenger()
                                +" personnes - "+c.get(i).getprix()
                                +" XPF/Jour");
        }
        Location.Menu_principal();
    }  
    
    /**
     * Choix type Véhicule - acquisition nouvelle voiture
     */
    public static void choixVoiture_acquisition() {
        // Local variable
        int swValue;

        // Display menu graphics
        System.out.println("=================================");
        System.out.println("|   Choix type Véhicule         |");
        System.out.println("=================================");
        System.out.println("|                               |");
        System.out.println("| 1. Citadine                   |");
        System.out.println("| 2. Berline                    |");
        System.out.println("| 3. S.U.V                      |");
        System.out.println("| 0. Retour au menu principal   |");
        System.out.println("|                               |");
        System.out.println("=================================");
        swValue = Keyin.inInt(" Votre choix : ");

        // Switch construct
        switch (swValue) {
            case 1:
              System.out.println("Citadine");
              newVehicule_citadine();
              break;
            case 2:
              System.out.println("Berline");
              break;
            case 3:
              System.out.println("S.U.V");
              break;
            case 0:
                System.out.println("Quitter");
                Location.Menu_principal();
              break;
            default:
              System.out.println("Default");
              break; // This break is not really necessary
        }
    }
    /**
     * Choix type Véhicule - acquisition nouvelle voiture
     */
    public static void choixVoiture_location() {
        // Local variable
        int swValue;

        // Display menu graphics
        System.out.println("=================================");
        System.out.println("|   Choix type Véhicule         |");
        System.out.println("=================================");
        System.out.println("|                               |");
        System.out.println("| 1. Citadine                   |");
        System.out.println("| 2. Berline                    |");
        System.out.println("| 3. S.U.V                      |");
        System.out.println("| 0. Retour au menu principal   |");
        System.out.println("|                               |");
        System.out.println("=================================");
        swValue = Keyin.inInt(" Votre choix : ");

        // Switch construct
        switch (swValue) {
            case 1:
              System.out.println("Citadine");
              Save_fiche_liste_citadine();
              break;
            case 2:
              System.out.println("Berline");
              Save_fiche_liste_berlin();
              break;
            case 3:
              System.out.println("S.U.V");
              Save_fiche_liste_suv();
              break;
            case 0:
                System.out.println("Quitter");
                Location.Menu_principal();
              break;
            default:
              System.out.println("Default");
              break; // This break is not really necessary
        }
    }
    
    /**
     * Inscription nouveaux client :D
     */
    public static void inscription() {
        
            Client client = new Client();
            
            String nom = Keyin.inString("Nom :");
            client.setNom(nom);

            String prénom = Keyin.inString("Prenom :");
            client.setPrenom(prénom);

            int age = Keyin.inInt("Age :");
            client.setAge(age);

            int NumPermis = Keyin.inInt("N° Permis :");
            client.setAge(NumPermis);

            cl.add(client);
            
            for(int i = 0;i<cl.size();i++){
            System.out.println("Nom "+cl.get(i).getNom()
                                +" - Prenom "+i+" - "+cl.get(i).getPrenom()
                                +" - Age "+cl.get(i).getAge()
                                +" - Numéro de permis "+cl.get(i).getNumPermis());
        }
        Location.Menu_principal();
    }
    
    private static void Save_fiche_liste_citadine() {
        FicheLocation fichelocation = new FicheLocation();
              for(int i=0;i<c.size();i++){
                  System.out.println("Immatriculation: "+c.get(i).getImmatriculation()
                                    +" - Personnes: "+c.get(i).getPassenger()
                                    +" - Prix: "+c.get(i).getprix());
              }
              
               location.Location.select_vehicule = Keyin.inInt("Sélectionner le Vehicule");
        
                Citadine citadine = c.get(location.Location.select_vehicule);
                fichelocation.setListVoiture(citadine);
    
                int select_duree = Keyin.inInt("Indiqué une durée /JOUR");
                fichelocation.setDuree(select_duree);
        
                fl.add(fichelocation);
                
        for(int i=0;i<fl.size();i++){
            System.out.println("N° Location "+i+" - Client "+fl.get(i).getListVoiture().getImmatriculation()
                                +" - Duree "+fl.get(i).getDuree());
        }
        Menu_principal();
    }
    
    private static void Save_fiche_liste_suv() {
        FicheLocation fichelocation = new FicheLocation();
              for(int i=0;i<s.size();i++){
                  System.out.println("Immatriculation: "+s.get(i).getImmatriculation()
                                    +" - Personnes: "+s.get(i).getPassenger()
                                    +" - Prix: "+s.get(i).getprix());
              }
              
               location.Location.select_vehicule = Keyin.inInt("Sélectionner le Vehicule");
        
                Suv suv = s.get(location.Location.select_vehicule);
                fichelocation.setListVoiture(suv);
    
                int select_duree = Keyin.inInt("Indiqué une durée /JOUR");
                fichelocation.setDuree(select_duree);
        
                fl.add(fichelocation);
                
        for(int i=0;i<fl.size();i++){
            System.out.println("N° Location "+i+" - Client "+fl.get(i).getListVoiture().getImmatriculation()
                                +" - Duree "+fl.get(i).getDuree());
        }
        Menu_principal();
    }
    
    private static void Save_fiche_liste_berlin() {
        FicheLocation fichelocation = new FicheLocation();

        for(int i=0;i<b.size();i++){
              System.out.println("Immatriculation: "+b.get(i).getImmatriculation()
                                +" - Personnes: "+b.get(i).getPassenger()
                                +" - Prix: "+b.get(i).getprix());
          }

           location.Location.select_vehicule = Keyin.inInt("Sélectionner le Vehicule");

            Berlin berlin = b.get(location.Location.select_vehicule);
            fichelocation.setListVoiture(berlin);

            int select_duree = Keyin.inInt("Indiqué une durée /JOUR");
            fichelocation.setDuree(select_duree);

            fl.add(fichelocation);

        for(int i=0;i<fl.size();i++){
            System.out.println("N° Location "+i+" - Client "+fl.get(i).getListVoiture().getImmatriculation()
                                +" - Duree "+fl.get(i).getDuree());
        }
        Menu_principal();
    }
    
    private static void Save_fiche_Liste_client(){
        FicheLocation fichelocation = new FicheLocation();
        System.out.println("========= LOUER VEHICULE =========");        
//Affichage liste Client
        for(int i=0;i<cl.size();i++){
            
            System.out.println("ID "+i+" - "+"Prenom "+cl.get(i).getPrenom());
        }
        //Scanne selection liste client + Affecté scanne dans une autre variable
        location.Location.select_client = Keyin.inInt("Sélectionner le client");
        
        Client client = cl.get(location.Location.select_client);
        fichelocation.setListClient(client);
        choixVoiture_location();
    }
   
    public static void Rendre_vehicule(){
        
        for(int i=0;i<fl.size();i++){
            System.out.println("N° Location "+i+" - Client "+fl.get(i).getListVoiture().getImmatriculation()
                                +" - Duree "+fl.get(i).getDuree());
        }
        
        int select_numLocation = Keyin.inInt("Entrée le numéros de Location :_");
        FicheLocation fichelocation = fl.get(select_numLocation);
        int montant_total = fichelocation.getListVoiture().getprix()*fichelocation.getDuree();
        
        System.out.println("Merci le montant à régler est de "+montant_total+" XPF");
        
        Location.Menu_principal();
        
    }

    public static void Total_prix(){

    int total_location = location.Location.prix;
    System.out.println(total_location);

    }
}

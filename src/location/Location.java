package location;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Location {
    
    // v to vehicule
    private static final ArrayList<Voiture> v = new ArrayList<Voiture>();
    // cl to client
    private static final ArrayList<Client> cl = new ArrayList<Client>();
    // b to berlin
    private static final ArrayList<Berlin> b = new ArrayList<Berlin>();
    // c to citadine
    private static final ArrayList<Citadine> c = new ArrayList<Citadine>();
    // s to SUV
    private static final ArrayList<Suv> s = new ArrayList<Suv>();
    // fl to fiche location
    private static final ArrayList<FicheLocation> fl = new ArrayList<FicheLocation>();
    //Prix total à payé pour la location
    private static int prix;
    
    
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
        System.out.println("| 1. Acquérir voiture           |");
        System.out.println("| 2. Enregistrer nouveau client |");
        System.out.println("| 3. Louer véhicule             |");
        System.out.println("| 4. Rendre véhicule            |");
        System.out.println("| 0. Quitter                    |");
        System.out.println("=================================");
        swValue = Keyin.inInt(" Votre choix : ");

        // Switch construct
        switch (swValue) {
            case 1:
              choixVoiture(0);
              
              break;
            case 2:
              System.out.println("*****************************");
              System.out.println("Enregistrer nouveau client");
              inscription();
              break;
            case 3:
              louer_un_vehicule();

              break;
            case 4:
                System.out.println("Rendre véhicule");
                TotaPrix();
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
        
       //Liste des véhicules pour le type Citadine
       c.add(new Citadine(12,3,2000,1));
       c.add(new Citadine(21,2,1200,1));
       c.add(new Citadine(32,2,1300,1));
       
       //Liste de véhicule pour le type Berlin
       b.add(new Berlin(78459621,4,3000,1));
       b.add(new Berlin(78459621,4,3000,1));
       b.add(new Berlin(78459621,4,3000,1));
       
       //Liste de véhicule pour le type Suv
       s.add(new Suv(78459621,4,3000,1));
       s.add(new Suv(78459621,4,3000,1));
       s.add(new Suv(78459621,4,3000,1));
        
       //Liste des Vehicule
       v.add(new Voiture(123456,2,1800));
       v.add(new Voiture(645213,4,3500));
       
       //Liste des Client
       cl.add(new Client("Tulipe","Maezzena",21,999));
       cl.add(new Client("Paté","Taylor",30,777));
       
       //Liste de Location
       fl.add(new FicheLocation(new Client("Tulipe","Maezzena",21,999),new Berlin(12345,5,2500,2),4));
       fl.add(new FicheLocation(new Client("Paté","Taylor",30,777),new Berlin(12345,5,2500,2),9));
    }
    
    /**
     * Acquisition d'un nouveau véhicule
     */
    public static void newVehicule(){
        Voiture voiture = new Voiture();
        
        int immatriculation = Keyin.inInt("Immatriculation du véhicule :");
        voiture.setImmatriculation(immatriculation);
        
        int passenger = Keyin.inInt("Nombre de passager :");
        voiture.setPassenger(passenger);
        
        int prix = Keyin.inInt("Tarif par jour :");
        voiture.setprix(prix);
        
        v.add(voiture);
        
        for(int i = 0;i<v.size();i++){
            System.out.println("immatriculation "+v.get(i).getImmatriculation()
                                +" - "+v.get(i).getPassenger()
                                +" personnes - "+v.get(i).getprix()
                                +" XPF/Jour");
        }
        Location.Menu_principal();
    }
    
    /**
     * Choix type Véhicule
     */
    public static void choixVoiture(int option) {
        
        // Local variable
        int swValue;

        // Display menu graphics
        System.out.println("=================================");
        System.out.println("|     Type de véhicule          |");
        System.out.println("=================================");
        System.out.println("| 1. Citadine                   |");
        System.out.println("| 2. Berline                    |");
        System.out.println("| 3. Suv                        |");
        System.out.println("=================================");
        swValue = Keyin.inInt("Choix : ");

        // Switch construct
        switch (swValue) {
            case 1:
                System.out.println("Citadine");
                if (option == 0) {
                    newVehicule();
                }else {
                    //Boucle pour afficher la liste des voitures du type Citadine
                    for(int i=0;i<c.size();i++){
                     System.out.println(i+" - "+"Immatriculation "+c.get(i).getImmatriculation()
                                            +" - nbPassager "+c.get(i).getPassenger()
                                            +" - Prix "+c.get(i).getprix());
                    }
                }
                
              break;
            case 2:
                System.out.println("Berline");
                if (option == 0) {
                    newVehicule();
                }else {
                    //Boucle pour afficher la liste des voitures du type Berlin
                    for(int i=0;i<b.size();i++){
                     System.out.println(i+" - "+"Immatriculation "+b.get(i).getImmatriculation()
                                            +" - nbPassager "+b.get(i).getPassenger()
                                            +" - Prix "+b.get(i).getprix());
                    }    
                }
              break;
            case 3:
                System.out.println("Suv");
                if (option == 0) {
                    newVehicule();
                }else {
                    //Boucle pour afficher la liste des voitures du type Suv
                    for(int i=0;i<s.size();i++){
                     System.out.println(i+" - "+"Immatriculation "+s.get(i).getImmatriculation()
                                            +" - nbPassager "+s.get(i).getPassenger()
                                            +" - Prix "+s.get(i).getprix());
                    }
                }
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
        
        //Ont Affiche le client
        for(int i = 0;i<cl.size();i++){
            System.out.println("=================================");
            System.out.println("Numéro de client :"+i);
            System.out.println("Nom :"+cl.get(i).getNom());
            System.out.println("Prénom :"+cl.get(i).getPrenom());
            System.out.println("Age :"+cl.get(i).getAge());
            System.out.println("Numéro de permis :"+cl.get(i).getNumPermis());
           
        }
        System.out.println("*********************************");
        System.out.println("Merci !");
        
        //Ont retourn dans le menu principale
        Location.Menu_principal();
    }
    
    
    
    public static void louer_un_vehicule(){
        
        FicheLocation fichelocation = new FicheLocation();
        
        //Ont Affiche la liste des clients
        for(int i=0;i<cl.size();i++){
            System.out.println(+i+" - "+"Prenom "+cl.get(i).getPrenom());
        }
        
        //Ont choisie le client 
        int select_client = Keyin.inInt("Sélectionner le client :");
        
        Client client = cl.get(select_client);
        fichelocation.setListClient(client);
        
        //ont appelle la fonction pour sélèctioné le type de voiture
        choixVoiture(1);
        
        
        
        int select_voiture = Keyin.inInt("Sélectionner une voiture :");
        
        Voiture voiture = v.get(select_voiture);
        fichelocation.setListVoiture(voiture);
        
        int select_duree = Keyin.inInt("Indiqué la duré de location par jour :");
        fichelocation.setDuree(select_duree);
        
        fl.add(fichelocation);
        
        for(int i=0;i<fl.size();i++){
           System.out.println("N° Location "+i+" - Client "+fl.get(i).getListVoiture().getImmatriculation()
                                +" - Duree "+fl.get(i).getDuree());
        }       
        
        location.Location.prix = fl.get(select_duree).getDuree()*v.get(select_voiture).getprix();
        
        //Ont retourn dans le menu principale
        Location.Menu_principal();
    }
    
    public static void Total_prix(){
        
        int total_location = location.Location.prix;
        System.out.println(total_location);
        
    }
   
   public static void TotalPrix() {
       for(int i=0;i<fl.size();i++){
            System.out.println("N° Location "+i+" - Client "+fl.get(i).getListVoiture().getImmatriculation()
                                +" - Duree "+fl.get(i).getDuree());
        }
       
        int select_numLocation = Keyin.inInt("Entrée le numéros de Location :");
        FicheLocation fichelocation = fl.get(select_numLocation);
        int montant_total = fichelocation.getListVoiture().getprix()*fichelocation.getDuree();
        
        
        System.out.println("Merci le montant à régler est de " +montant_total+ "XPF");
        Location.Menu_principal();
   
   }
    

}

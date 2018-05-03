package location;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Location {
    
    // v to vehicule
    private static final ArrayList<Voiture> v = new ArrayList<Voiture>();
    // cl to client
    private static final ArrayList<Client> cl = new ArrayList<Client>();
    // fl to fiche location
    private static final ArrayList<FicheLocation> fl = new ArrayList<FicheLocation>();
    
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
              newVehicule();
              break;
            case 2:
              System.out.println("Enregistrer nouveau client");
              inscription();
              break;
            case 3:
              louer_un_vehicule();

              break;
            case 4:
                System.out.println("Rendre véhicule");
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
       v.add(new Voiture(78459621,4,3000));
       v.add(new Voiture(123456,2,1800));
       v.add(new Voiture(645213,4,3500));
       //Liste Client
       cl.add(new Client("Tulipe","Maezzena",21,999));
       cl.add(new Client("Paté","Taylor",30,777));
       //Liste Location
       fl.add(new FicheLocation(new Client("Tulipe","Maezzena",21,999),new Berlin(12345,5,2500,2),4));
       fl.add(new FicheLocation(new Client("Paté","Taylor",30,777),new Berlin(12345,5,2500,2),9));
    }
    
    /**
     * Acquisition d'un nouveau véhicule
     */
    public static void newVehicule(){
        Voiture voiture = new Voiture();
        
        int immatriculation = Keyin.inInt("Immatriculation du véhicule");
        voiture.setImmatriculation(immatriculation);
        
        int passenger = Keyin.inInt("Nombre de passager");
        voiture.setPassenger(passenger);
        
        int prix = Keyin.inInt("Tarif par jour");
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
    public static void choixVoiture() {
        // Local variable
        int swValue;

        // Display menu graphics
        System.out.println("=================================");
        System.out.println("|   Choix type Véhicule         |");
        System.out.println("=================================");
        System.out.println("|                               |");
        System.out.println("| 1. Citadine                   |");
        System.out.println("| 2. Berline                    |");
        System.out.println("| 3. Sport.Utilitie.Vehicule    |");
        System.out.println("| 0. Retour au menu principal   |");
        System.out.println("|                               |");
        System.out.println("=================================");
        swValue = Keyin.inInt(" Votre choix : ");

        // Switch construct
        switch (swValue) {
            case 1:
              System.out.println("Citadine");
              break;
            case 2:
              System.out.println("Berline");
              break;
            case 3:
              System.out.println("Sport.Utilitie.Vehicule");
              louer_un_vehicule();
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
    
    
    public static void renderCars() {
        Voiture Voiture = new Voiture();
        String nom = Keyin.inString("n° de location :");
        //Voiture.setNom(nom);
        System.out.println("Merci le montant à régler est de " );
    }
    
    public static void louer_un_vehicule(){
        FicheLocation fichelocation = new FicheLocation();
        //Affichage liste Client
        for(int i=0;i<cl.size();i++){
            System.out.println("ID "+i+" - "+"Prenom "+cl.get(i).getPrenom());
        }
        //Scanne selection liste client + Affecté scanne dans une autre variable
        int select_client = Keyin.inInt("Sélectionner le client");
        
        Client client = cl.get(select_client);
        fichelocation.setListClient(client);
        
        //Boucle affichage liste voiture + id
        for(int i=0;i<v.size();i++){
            System.out.println("ID "+i+" - "+"Immatriculation "+v.get(i).getImmatriculation()
                                            +" - nbPassager "+v.get(i).getPassenger()
                                            +" - Prix "+v.get(i).getprix());
        }
        
        int select_voiture = Keyin.inInt("Sélectionner une voiture");
        
        Voiture voiture = v.get(select_voiture);
        fichelocation.setListVoiture(voiture);
        
        int select_duree = Keyin.inInt("Indiqué une durée /JOUR");
        fichelocation.setDuree(select_duree);
        
        fl.add(fichelocation);
        
        for(int i=0;i<fl.size();i++){
            System.out.println("Client "+fl.get(i).getListClient().getPrenom()
                                +" - Voiture "+fl.get(i).getListVoiture().getImmatriculation()
                                +" - Duree "+fl.get(i).getDuree());
        }
        
        System.out.println("=================================");
        System.out.println("|   RESUMER DE LA LOCATION       |");
        System.out.println("=================================");        
        
        int test = fl.get(select_duree).getDuree()*v.get(select_voiture).getprix();
        System.out.println("Prix TOTAL a payer "+test+" XPF");
    }
   
   

}

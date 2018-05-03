package location;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Location {
    
    private static ArrayList<Client> clients = new ArrayList();
    private static ArrayList<Voiture> voiture = new ArrayList();
    private static final ArrayList<FicheLocation> report = new ArrayList<FicheLocation>();
    private static Scanner in = new Scanner(System.in);
    
    
    /**
     * 
     * @param args 
     */
    public static void main(String[] args) {
        init();
        Menu_principal();
        
    }
    
    public static void Menu_principal(){
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
        System.out.println("=================================");
        swValue = Keyin.inInt("Choix : ");

        // Switch construct
        switch (swValue) {
            case 1:
                
              choixVoiture();
                            
              break;
            case 2:
              System.out.println("=================================");
              System.out.println("ENREGISTREMENT DU CLIENT ");
              inscription();
              
              System.out.println("=================================");
              break;
            case 3:
              louer_un_vehicule();
              break;
            case 4:
                System.out.println("Rendre véhicule");
                //renderCars() ;
              break;
            case 0:
                System.out.println("Quitter");
              break;
            default:
              System.out.println("Default");
              break; // This break is not really necessary
        }
        
    }
    
    public static void init(){
       //Liste des Vehicules
       voiture.add(new Voiture(78459621,4,3000));
       voiture.add(new Voiture(123456,2,1800));
       voiture.add(new Voiture(645213,4,3500));
       //Liste des Clients
       clients.add(new Client("Tulipe","Maezzena",21,999));
       clients.add(new Client("Paté","Taylor",30,777));
       //Liste de Location
       report.add(new FicheLocation(new Client("Tulipe","Maezzena",21,999),new Berlin(12345,5,2500,2),2));
       report.add(new FicheLocation(new Client("Paté","Taylor",30,777),new Berlin(12345,5,2500,2),2));
    }
    
    
    //Menu 1 (Chois du type de voiture)
    public static void choixVoiture() {
        
        int swValue;
        System.out.println("=================================");
        System.out.println("|        CATEGORIE VOITURE      |");
        System.out.println("=================================");
        System.out.println("| 0. Citadine                   |");
        System.out.println("| 1. Berlin                     |");
        System.out.println("| 2. Suv                        |");
        System.out.println("=================================");
        swValue = Keyin.inInt("Choix : ");
        
        switch(swValue) {
            case 0:
              System.out.println("Citadine");
              
              // Appelle à la fonction
              acquisition();
              break;
            case 1:
              System.out.println("Berlin");
              // Appelle à la fonction
              acquisition();
              break;
            case 2:
              System.out.println("Suv");
              // Appelle à la fonction
              acquisition();
              break;
            default:
              System.out.println("Default");
              break;
        }
        
        System.out.println("Merci !");
        Menu_principal();
    }
    
    //Menu 1.1 pour la fonction choixVoiture()
    public static void acquisition() {
        Voiture cars = new Voiture();
            
        int numImmatricul = Keyin.inInt("Immatriculation du véhicule :");
        cars.setNumImmatricul(numImmatricul);

        int nbrPassagers = Keyin.inInt("Nombre de passager :");
        cars.setNbrPassage(nbrPassagers);

        int price = Keyin.inInt("Tarif par jour :");
        cars.setTarife(price);
        
        voiture.add(cars);
        
        
    }
    

    //Fonction pour incsrire le client
    public static void inscription() {
        
        Client client = new Client();

        String nom = Keyin.inString("Nom :");
        client.setNom(nom);

        String prénom = Keyin.inString("Prenom :");
        client.setPrénom(prénom);

        int age = Keyin.inInt("Age :");
        client.setAge(age);

        int NumPermis = Keyin.inInt("N° Permis :");
        client.setAge(NumPermis);

        clients.add(client);

        System.out.println("Numéro de client :"+ Client.COUNT);
        System.out.println("Merci !");
        
        //Ont retourne au menu principale
        Location.Menu_principal();
    }
    
       
    public static void louer_un_vehicule(){
        FicheLocation fichelocation = new FicheLocation();
        
        //Affiche la liste des clients
        System.out.println("Choix du Client");
        for(int i=0;i<clients.size();i++){
            System.out.println(i+" - "+clients.get(i).getPrénom());
        }
        
        //Ont choisie le client et ont affècte dans une variable
        int select_client = Keyin.inInt("Sélectionner le client");
        Client client = clients.get(select_client);
        fichelocation.setListClient(client);
                
        //Boucle affichage liste client + id
        for(int i=0;i<voiture.size();i++){
            System.out.println("ID "+i+" - "+"Immatriculation "+voiture.get(i).getNumImmatricul()
                                            +" - nbPassager "+voiture.get(i).getNbrPassage()
                                            +" - Prix "+voiture.get(i).getTarife());
        }
    }
    
    /*
    public static void totalPrix() {
        
        int.total = sefse.get(select_duré).getDure()*voiture.get(select_voiture).getprix();
    }
    */
    /*
    public static void renderCars() {
        Voiture voiture = new Voiture();
        int numLocation = Keyin.inInt("N° de location :");
            voiture.get(id);
            
        
        
        System.out.println("Merci le montant à régler est de " );
    }*/
   
   

}

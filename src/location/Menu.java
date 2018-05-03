/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Location;

import static java.awt.SystemColor.menu;
import java.util.ArrayList;

/**
 *
 * @author tepav
 */
public class Menu {
     String afficher;
     String cout;
     String endl;
    public Menu(){
        
    }

    public void menu(){
        // Local variable
        int swValue;

        // Display menu graphics
        System.out.println("=================================");
        System.out.println("|   MENU PRINCIPAL              |");
        System.out.println("=================================");
        System.out.println("| Options:                      |");
        System.out.println("| 1. Acquérir voiture           |");
        System.out.println("| 2. Enregistrer nouveau client |");
        System.out.println("| 3. Louer véhicule             |");
        System.out.println("| 4. Rendre véhicule            |");
        System.out.println("| 0. Quitter                    |");
        System.out.println("=================================");
        swValue = Keyin.inInt(" Select option: ");

        // Switch construct
        switch (swValue) {
        case 1:
          System.out.println("Option 1 selected");
          
          break;
        case 2:
          System.out.println("Afficher camion");
          
          break;
        case 3:
          System.out.println("Exit selected");
          break;
        case 4:
          System.out.println("Exit selected");
          
          break;
        default:
          System.out.println("Invalid selection");
          break; // This break is not really necessary
        }
        
    }

    public void get_list_camion(){
        ArrayList<Location> client = new ArrayList<Location>();
        for(int i = 0;i<client.size();i++){
            Voiture voiture = Location.get(i).getVoiture();
            Location location = (Location)voiture;
            System.out.println(location.nom()+" "+location.Client());
        }
    }
  
        
       
    
    
}

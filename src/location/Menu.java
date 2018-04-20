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
        System.out.println("============================");
        System.out.println("|   MENU SELECTION DEMO    |");
        System.out.println("============================");
        System.out.println("| Options:                 |");
        System.out.println("| 1. Option 1              |");
        System.out.println("| 2. Afficher camion       |");
        System.out.println("| 3. Exit                  |");
        System.out.println("============================");
        swValue = Keyin.inInt(" Select option: ");

        // Switch construct
        switch (swValue) {
        case 1:
          System.out.println("Option 1 selected");
          
          break;
        case 2:
          System.out.println("Afficher camion");
          this.test();
          break;
        case 3:
          System.out.println("Exit selected");
          break;
        default:
          System.out.println("Invalid selection");
          break; // This break is not really necessary
        }
        
    }

    public void get_list_camion(){
        ArrayList<Location> personne = new ArrayList<Location>();
        for(int i = 0;i<personne.size();i++){
            Voiture voiture = personne.get(i).getVoiture();
            Camion camion = (Camion)voiture;
            System.out.println(camion.nom()+" "+camion.volume_benne());
        }
    }
  
        
    
   
       
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hungerGames.view;

import byui.cit260.hungerGames.control.GameControl;
import byui.cit260.hungerGames.control.MapControl;
import byui.cit260.hungerGames.control.TributeControl;
import byui.cit260.hungerGames.model.Item;
import byui.cit260.hungerGames.model.Location;
import byui.cit260.hungerGames.model.Map;
import byui.cit260.hungerGames.model.Scene;
import hungergames.HungerGames;
import java.util.Scanner;

/**
 *
 * @author Zack
 */
public class GameMenuView extends View {
    
           public GameMenuView() {
               super("\n"
            +"\n----------------------------------------------"
            +"\n| Game Play Menu                             |"
            +"\n----------------------------------------------"
            +"\nI - Inventory"
            +"\nT - Set Trap"
            +"\nM - Map"
            +"\nR - Remaining Tributes"
            +"\nS - Save Game"   
            +"\nH - Help"
            +"\nQ - Quit"
            +"\n----------------------------------------------");
            
           }
             
    /**
     *
     * @param obj
     * @return
     */
    @Override
    public boolean doAction(Object obj) {
        
        String value = (String) obj;
        char selection = value.charAt(0);
        
        switch(selection){
            case 'I':
            case 'i':
                this.viewInventoryMenu();
                break;
            case 'T':
            case 't':
                this.setTrap();
                break;
            case 'M':
            case 'm':
                this.viewMap();
                break;
            case 'R':
            case 'r':
                this.viewRemainingTributes();
                break;
            case 'S':
            case 's':
                this.saveGame();
                break;
            case 'H':
            case 'h':
                this.displayHelpMenu();
                break;
            case 'Q':
            case 'q':
                return false;
            default:
                System.out.println("\n*** Invalid selection, please try again. ***");
                break;
        }
        return true;
    }

    private void viewInventoryMenu() {

        InventoryMenuView inventoryMenuView = new InventoryMenuView(null);
        inventoryMenuView.display();
      
        
  }

    private void setTrap() {
        TrapView trapView = new TrapView();
        trapView.displayTrapView();
    }

    private void viewMap() {
        
        Location[][] locations = HungerGames.getCurrentGame().getMap().getLocations(); 
        System.out.println("\n***** Welcome to the 67th Annual Hunger Games ******");
        System.out.println("         |  0  |  1  |  2  |  3  |  4  |  5  |      ");
                
        for(int i = 0; i < locations[0].length; i++){
            System.out.println("\n---------------------------------------------------------");
            System.out.format("%2d", i);
            for(int j = 0; j < locations[0].length; j++){
                System.out.println(" | ");
                System.out.println(locations[i][j].getScene());

            }
            System.out.println(" | ");
        }
        System.out.println("\n---------------------------------------------------------");
    }
    
    private void viewRemainingTributes() {
        TributeControl tributeControl = new TributeControl(); 

    }
 
    private void saveGame() {
        System.out.println("*** saveGame function called ***");
    }

    private void displayHelpMenu() {
        
        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.display();
    }
    
}

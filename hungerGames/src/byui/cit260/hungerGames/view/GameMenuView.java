/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hungerGames.view;

import byui.cit260.hungerGames.control.GameControl;
import byui.cit260.hungerGames.control.MapControl;
import byui.cit260.hungerGames.model.Item;
import byui.cit260.hungerGames.model.Location;
import byui.cit260.hungerGames.model.Map;
import byui.cit260.hungerGames.model.Scene;
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
    }
//        InventoryMenuView inventoryMenuView = new InventoryMenuView();
//        inventoryMenuView.display();
//        Item[] item = Item;
//        
//        System.out.println("\nList of Inventory Items");
//        System.out.println("Description:" + "\t" +
//                            "Skill Point increase:" + "\t" +
//                            "Amount in inventory:" + "\t" );
//        
//        for (Item Item : item) {
//            
//            System.out.println(Item.getDescription() + "\t    " +
//                               Item.getStats() + "\t     " + 
//                               Item.getAmount());
//            
//        }
//        
//    }

    private void setTrap() {
        TrapView trapView = new TrapView();
        trapView.displayTrapView();
    }

    private void viewMap() {
//        
//        Location[][] locations = MapControl.assignScenesToLocations(Map map, Scene[] scenes);
//        System.out.println("\n"
//            +"\n---------------------------------------------------------"
//            +"\n|                          Map                          |"
//            +"\n---------------------------------------------------------"
//            +"\n|       |   0   |   1   |   2   |   3   |   4   |   5   |"
//            +"\n|       |       |       |       |       |       |       |"
//            +"\n|_______|_______|_______|_______|_______|_______|_______|"
//            +"\n|       |       |       |       |       |       |       |"
//            +"\n|   0   |       |       |       |       |       |       |"
//            +"\n|_______|_______|_______|_______|_______|_______|_______|"
//            +"\n|       |       |       |       |       |       |       |"
//            +"\n|   1   |       |       |       |       |       |       |"
//            +"\n|_______|_______|_______|_______|_______|_______|_______|"
//            +"\n|       |       |       |       |       |       |       |"
//            +"\n|   2   |       |       |       |       |       |       |"
//            +"\n|_______|_______|_______|_______|_______|_______|_______|"
//            +"\n|       |       |       |       |       |       |       |"
//            +"\n|   3   |       |       |       |       |       |       |"
//            +"\n|_______|_______|_______|_______|_______|_______|_______|"
//            +"\n|       |       |       |       |       |       |       |"
//            +"\n|   4   |       |       |       |       |       |       |"
//            +"\n|_______|_______|_______|_______|_______|_______|_______|"
//            +"\n|       |       |       |       |       |       |       |"
//            +"\n|   5   |       |       |       |       |       |       |"
//            +"\n|_______|_______|_______|_______|_______|_______|_______|"
//            +"\n---------------------------------------------------------");
//            
//                
//        for(){
//            
//            
//            for(){
//
//                
//                if (visited = true){
//                    //display map symbol
//                    
//                }
//                    else
//                    //display ?
//                    
//            }
//        }
    }
       
    private void viewRemainingTributes() {
        System.out.println("*** viewRemainingTributes function called ***");
    }
 
    private void saveGame() {
        System.out.println("*** saveGame function called ***");
    }

    private void displayHelpMenu() {
        
        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.display();
    }
    
}

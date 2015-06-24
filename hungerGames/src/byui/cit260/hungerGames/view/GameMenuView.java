/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hungerGames.view;

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
        InventoryMenuView inventoryMenuView = new InventoryMenuView();
        inventoryMenuView.display();
    }

    private void setTrap() {
        TrapView trapView = new TrapView();
        trapView.displayTrapView();
    }

    private void viewMap() {
        System.out.println("*** viewMap function called ***");
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

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
public class GameMenuView {
        
        private final String GAME_PLAY_MENU = "\n"
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
            +"\n----------------------------------------------";
            

    public void displayMenu() {
        
        char selection = ' ';
        do {
            System.out.println(GAME_PLAY_MENU);
            
            String input = this.getInput();
            selection = input.charAt(0);
            
            this.doAction(selection);
            
        } while(selection != 'Q');
        
    }
        
    private String getInput() {
        boolean valid = false;
        Scanner keyboard=new Scanner(System.in);
        String menuItem ="";
        
        while(!valid) {
            
            System.out.println("Enter a menu option.");
            
            menuItem = keyboard.nextLine();
            menuItem = menuItem.trim();
            
            if(menuItem.length()< 1) {
                System.out.println("Invalid selection, please try again.");
                continue;
            }
            break;
        }
        
        return menuItem;
    }
            
                
    public void doAction(char choice) {
        
        switch(choice){
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
                return;
            default:
                System.out.println("\n*** Invalid selection, please try again. ***");
                break;
        }
    }

    private void viewInventoryMenu() {
        InventoryMenuView inventoryMenuView = new InventoryMenuView();
        inventoryMenuView.displayMenu();
    }

    private void setTrap() {
        System.out.println("*** setTrap function called ***");
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
        helpMenuView.displayMenu();
    }
    
}
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
public class InventoryMenuView {
    
        private final String INVENTORY_MENU = "\n"
            +"\n----------------------------------------------"
            +"\n| Inventory Menu                                  |"
            +"\n----------------------------------------------"
            +"\nF - Food"
            +"\nW - Weapons"
            +"\nS - Supplies"
            +"\nB - Back"
            +"\n----------------------------------------------";
            

    public void displayMenu() {
        
        char selection = ' ';
        do {
            System.out.println(INVENTORY_MENU);
            
            String input = this.getInput();
            selection = input.charAt(0);
            
            this.doAction(selection);
            
        } while(selection != 'B');
        
    }
        
    private String getInput() {
        boolean valid = false;
        Scanner keyboard=new Scanner(System.in);
        String menuItem ="";
        
        while(!valid) {
            
            System.out.println("Enter an Inventory menu option.");
            
            menuItem = keyboard.nextLine();
            menuItem = menuItem.trim();
            
            if(menuItem.length()< 1) {
                System.out.println("Invalid option, please try again.");
                continue;
            }
            break;
        }
        
        return menuItem;
    }
               

    public void doAction(char choice) {
        
        switch(choice){
            case 'F':
            case 'f':
                this.viewFood();
                break;
            case 'W':
            case 'w':
                this.viewWeapons();
                break;
            case 'S':
            case 's':
                this.viewSupplies();
                break;
            case 'B':
            case 'b':
                return;
            default:
                System.out.println("\n*** Invalid selection, try again. ***");
                break;
        }
    }

    private void viewFood() {
                System.out.println("\n\n********************************************"
                            +"\n************** Food Items ***************"
                            +"\n* Food items will help you increase your*"
                            +"\n* skill points. As you explore each*"
                            +"\n* killing the other 23 tributes with       *"
                            +"\n* weapons you collect during the game.     *"
                            +"\n* After you kill the last tribute you will *"
                            +"\n* be declared the winner of the 67th annual*"
                            +"\n* Hunger Games!                            *"
                            +"\n********************************************");
    }

    private void viewWeapons() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void viewSupplies() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

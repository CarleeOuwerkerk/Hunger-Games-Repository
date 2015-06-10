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
            
        } while(selection != 'B' && selection != 'b');
        
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
                System.out.println("\n\n******************************************"
                            +"\n************** Food Items ****************"
                            +"\n* Food items will help you increase your *"
                            +"\n* skill points. As you explore each      *"
                            +"\n* location you will find various food    *"
                            +"\n* types that will increase your skill    *"
                            +"\n* points in a different way. For example:*"
                            +"\n* Fruits will increase your skill points *"
                            +"\n* by 3 points. While meat will increase  *"
                            +"\n* your skill points by 5.                *"
                            +"\n******************************************");
    }

    private void viewWeapons() {
                System.out.println("\n\n********************************************"
                            +"\n************** Weapon Items ****************"
                            +"\n* Weapon items will help you increase your *"
                            +"\n* skill points by 1, 3, or 5. As you find  *"
                            +"\n* and equip these weapons your skill points*"
                            +"\n* will go up. A bat, plank and knife will  *"
                            +"\n* raise your skill points by 1. A sword,   *"
                            +"\n* or crossbow will increase your skill     *"
                            +"\n* points by 3. And a bow and arrow, or     *"
                            +"\n* spear will increase your skill points by *"
                            +"\n* 5 skill points.                          *"
                            +"\n********************************************");
    }

    private void viewSupplies() {
               System.out.println("\n\n*******************************************"
                            +"\n************* Supply Items ****************"
                            +"\n* Supply items will help you increase your*"
                            +"\n* skill points. As you explore each       *"
                            +"\n* location you will find various supply   *"
                            +"\n* types that will increase your skill     *"
                            +"\n* points or be used to set a trap. Each   *"
                            +"\n* item will be identified and used        *"
                            +"\n* correctly depending on it's use.        *"
                            +"\n*******************************************");
    }
    
}

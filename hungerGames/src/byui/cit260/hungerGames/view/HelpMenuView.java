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
public class HelpMenuView {
    
    private final String HELP_MENU = "\n"
            +"\n----------------------------------------------"
            +"\n| Help Menu                                  |"
            +"\n----------------------------------------------"
            +"\nO - Objective"
            +"\nC - Controls "
            +"\nG - Gathering supplies"
            +"\nV - View inventory"
            +"\nB - Back"
            +"\n----------------------------------------------";
            

    public void displayMenu() {
        
        char selection = ' ';
        do {
            System.out.println(HELP_MENU);
            
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
            
            System.out.println("Enter a help menu option");
            
            menuItem = keyboard.nextLine();
            menuItem = menuItem.trim();
            
            if(menuItem.length()< 1) {
                System.out.println("Invalid option, please try again");
                continue;
            }
            break;
        }
        
        return menuItem;
    }
               

    public void doAction(char choice) {
        
        switch(choice){
            case 'O':
                this.viewObjectives();
                break;
            case 'C':
                this.viewControls();
                break;
            case 'G':
                this.gatherSupplies();
                break;
            case 'V':
                this.viewInventoryHelp();
                break;
            case 'B':
                return;
            default:
                System.out.println("\n*** Invalid selection, try again ***");
                break;
        }
    }

    private void viewObjectives() {
        System.out.println("\n\n********************************************"
                    +"\n************* The Objectives ***************"
                    +"\n* The goal of the game is to be the last   *"
                    +"\n* tribute standing, by defeating the other *"
                    +"\n* 23 tributes. You can do this by killing  *"
                    +"\n* them with weapons that you collect during*"
                    +"\n* the game. After you kill the last tribute*"
                    +"\n* you will be declared the winner of the   *"
                    +"\n* 67th annual Hunger Games!                *"
                    +"\n********************************************");
                   
    }

    private void viewControls() {
        System.out.println("\n\n********************************************"
                    +"\n************** The Controls ****************"
                    +"\n* In order to move to a new location, you  *"
                    +"\n* must first consult your map. This is     *"
                    +"\n* done by going to the Gameplay Menu and   *"
                    +"\n* entering the letter 'M' Here you will be *"
                    +"\n* able to view your current location as    *"
                    +"\n* well as the locations you have previously*"
                    +"\n* visited. Areas you have not yet visited  *"
                    +"\n* will appear with question marks on them, *"
                    +"\n* while the areas that you have visited    *"
                    +"\n* will have the terrain listed, as well as *"
                    +"\n* the name of any  tribute you have snuck  *"
                    +"\n* past while in that location.             *"                         
                    +"\n********************************************");
    
    }

    private void gatherSupplies() {
        System.out.println("\n\n********************************************"
                    +"\n************* Gather Supplies **************"
                    +"\n* To gather supplies, you must explore     *"
                    +"\n* locations. Some locations are empty,     *"
                    +"\n* others have weapons, supplies, or food   *"
                    +"\n* that will help you with your objective.  *"
                    +"\n* When you reach a location that has an    *"
                    +"\n* item, you will be given the option to    *"
                    +"\n* pick the item pick and add it to your    *"
                    +"\n* inventory or leave the item behind.      *"
                    +"\n********************************************");
    }

    private void viewInventoryHelp() {
        System.out.println("\n\n********************************************"
                    +"\n*************** Inventory ******************"
                    +"\n* In order to view your inventory, you must*"
                    +"\n* go to the Gameplay menu and enter the    *"
                    +"\n* letter 'I' This will take you right to   *"
                    +"\n* your inventory where you may view the    *"
                    +"\n* items by category: Food, Weapons, and    *"
                    +"\n* Supplies.                                *"
                    +"\n********************************************");
    }
    
}

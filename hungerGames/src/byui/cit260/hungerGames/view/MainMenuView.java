/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hungerGames.view;

import byui.cit260.hungerGames.control.GameControl;
import hungergames.HungerGames;
import java.util.Scanner;

/**
 *
 * @author Zack
 */
public class MainMenuView {
    
    private final String MENU = "\n"
            +"\n----------------------------------------------"
            +"\n| Main Menu                                  |"
            +"\n----------------------------------------------"
            +"\nN - New Game"
            +"\nC - Continue Saved Game"
            +"\nH - Help"
            +"\nQ - Quit"
            +"\n----------------------------------------------";
            

    public void displayMenu() {
        
        char selection = ' ';
        do {
            System.out.println(MENU);
            
            String input = this.getInput();
            selection = input.charAt(0);
            
            this.doAction(selection);
            
        } while(selection != 'Q' && selection != 'q');
        
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
            case 'N':
            case 'n':
                this.startNewGame();
                break;
            case 'C':
            case 'c':
                this.continueExistingGame();
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
    private void startNewGame() {
        GameControl.creatNewGame(HungerGames.getPlayer());
        
        GameMenuView gameMenu = new GameMenuView();
        gameMenu.displayMenu();
    }


    private void continueExistingGame() {
        System.out.println("*** continueExistingGame function called ***");
    }

    private void displayHelpMenu() {
        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.displayMenu();
    }
 
    
}

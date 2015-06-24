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
public abstract class View implements ViewInterface {
    
    private String promptMessage;
    
    public View(String promptMessage) {
        this.promptMessage= promptMessage;
    }

    public String getPromptMessage() {
        return promptMessage;
    }

    public void setPromptMessage(String promptMessage) {
        this.promptMessage = promptMessage;
    }
    
@Override
public void display() {
        
        char firstLetter;

        do {
            System.out.println(promptMessage);
            
            String selection = this.getInput();
            firstLetter = selection.toUpperCase().charAt(0);
            
            this.doAction(selection);
            
        } while(firstLetter != 'B' && firstLetter != 'Q');
        
    }
        
    @Override
    public String getInput() {
        boolean valid = false;
        Scanner keyboard=new Scanner(System.in);
        String menuItem ="";
        
        while(!valid) {
            
            System.out.println("Please make a selection.");

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
}

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

//    public String getPromptMessage() {
//        return promptMessage;
//    }
//
//    public void setPromptMessage(String promptMessage) {
//        this.promptMessage = promptMessage;
//    }
    
    @Override
    public void display() {
        String selection = " ";
        boolean done = false;
        
        do {
            System.out.println(this.promptMessage);
            selection = this.getInput();
            done = this.doAction(selection);
            
        } while(!done);
        
    }
        
    @Override
    public String getInput() {
        boolean valid = false;
        Scanner keyboard = new Scanner(System.in);
        String selection = null;
        
        while(!valid) {
            
            System.out.println("Enter a menu option.");
            
            selection = keyboard.nextLine();
            selection = selection.trim();
            
            if(selection.length()< 1) {
                System.out.println("Invalid selection, please try again.");
                continue;
            }
            break;
        }
        
        return selection;
    }
    
}

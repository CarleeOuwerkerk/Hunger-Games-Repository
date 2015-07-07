/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hungerGames.view;

import hungergames.HungerGames;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Zack
 */
public abstract class View implements ViewInterface {
    
    private String promptMessage;
    
    protected final BufferedReader keyboard = HungerGames.getInFile();
    protected final PrintWriter console = HungerGames.getOutFile();
    
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
        String menuItem ="";
        
        while(!valid) {
            
            try {
                System.out.println("Please make a selection.");
                
                menuItem = this.keyboard.readLine();
                menuItem = menuItem.trim();
                
                if(menuItem.length()< 1) {
                    System.out.println("Invalid option, please try again");
                    continue;
                }
                break;
            } catch (Exception e) {
                System.out.println("Error reading input: " + e.getMessage());
            }
        }
        
        return menuItem;
    }
}

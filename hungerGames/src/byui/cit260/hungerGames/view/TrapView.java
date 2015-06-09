/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hungerGames.view;

import byui.cit260.hungerGames.control.TrapControl;
import java.util.Scanner;

/**
 *
 * @author Zack
 */
public class TrapView {
    
    private final String TRAP_VIEW = "\n"
            +"\n----------------------------------------------"
            +"\n| You decide to set a trap. You see a tree   |"
            +"\n| branch that is 8 feet away and 6 feet in   |"
            +"\n| the air. You plan on setting a trap to get |"
            +"\n| some food. What is the slant that you must |"
            +"\n| throw your rope over the branch?           |"
            +"\n|                                            |"
            +"\n| Hint: Think of the equation A^2 + B^2 = ?? |"
            +"\n----------------------------------------------";
    
    public void displayTrapView() {
        
        boolean result = false;
        
        char selection = ' ';
        do {
            System.out.println(TRAP_VIEW);
            
            String input = this.getInput();
            
            result=this.doAction(input);
            
        } while(!result);
        
    }
    
    private String getInput() {
    boolean valid = false;
    Scanner keyboard=new Scanner(System.in);
    String menuItem ="";

    while(!valid) {

        System.out.println("What is the slant?");

        menuItem = keyboard.nextLine();
        menuItem = menuItem.trim();

        if(menuItem.length()<1) {
            System.out.println("Invalid selection, please try again.");
            continue;
        }
        break;
    }

    return menuItem;
}


public boolean doAction(String choice) {
        
        int guess = Integer.parseInt(choice);
        return TrapControl.calculateAngle(8, 6, guess);
                
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hungerGames.view;

import java.util.Scanner;

/**
 *
 * @author Carlee Ouwerkerk
 */

public class FightView {
    
    private final String SNEAK_OR_FIGHT = "\n"
            +"\n----------------------------------------------"
            +"\n| As you examine your location, you notice   |"
            +"\n| another tribute. They don't see you,       |"
            +"\n| however. Their skill point level is +      |"
            +"\n| skillPointLevel + .  You have the option   |"
            +"\n| to either fight them or to try to sneak    |"
            +"\n| past them.                                 |"
            +"\n|                                            |"
            +"\n| F - I want to fight the other tribute.     |"
            +"\n| S - I want to try to sneak past.           |"
            +"\n----------------------------------------------";
    
    public void displaySneakOrFight() {
        
        char selection = ' ';
        do {
            System.out.println(SNEAK_OR_FIGHT);
            
            String input = this.getInput();
            selection = input.charAt(0);
            
            this.doAction(selection);
            
        } while(selection != 'F' && selection !='f' && selection !='S' && selection !='s' );
        
    }
    
    private String getInput() {
    boolean valid = false;
    Scanner keyboard=new Scanner(System.in);
    String menuItem ="";

    while(!valid) {

        System.out.println("What do you choose?");

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
        case 'F':
        case 'f':
            this.fightTribute();
            break;
        case 'S':
        case 's':
            this.sneakPast();
            break;
        default:
            System.out.println("\n*** Invalid selection, please try again. ***");
            break;
    }
}

    private void fightTribute() {
        System.out.println("*** fightTribute function called ***");
    }

    private void sneakPast() {
        System.out.println("*** sneakPast function called ***");
    }
    
}

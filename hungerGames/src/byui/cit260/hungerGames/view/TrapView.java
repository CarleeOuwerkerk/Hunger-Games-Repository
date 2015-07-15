/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hungerGames.view;

import byui.cit260.hungerGames.control.TrapControl;
import byui.cit260.hungerGames.exceptions.TrapControlException;

/**
 *
 * @author Zack
 */
public class TrapView extends View {

    public TrapView() {
        super("\n"
                + "\n----------------------------------------------"
                + "\n| You decide to set a trap. You see a tree   |"
                + "\n| branch that is 8 feet away and 6 feet in   |"
                + "\n| the air. You plan on setting a trap to get |"
                + "\n| some food. What is the slant that you must |"
                + "\n| throw your rope over the branch?           |"
                + "\n|                                            |"
                + "\n| Hint: Think of the equation A^2 + B^2 = ?? |"
                + "\n----------------------------------------------"
                + "\n \n What is the slant?");
    }

    @Override
    public boolean doAction(Object obj) {
        String choice = (String) obj;
        try {
            int guess = Integer.parseInt(choice);
            if (TrapControl.calculateAngle(8, 6, guess)) {
                this.console.println("\n Trap was SUCESSFUL!");
                return true;
//                break;
            } else {
                ErrorView.display(this.getClass().getName(), "\n Invalid number, please try again.");
                return false;
            }
        } catch (TrapControlException te) {
            this.console.println(te.getMessage());
            return true;
        }
        
    // display that meat was added successfully
    
    // return end user to GameMenuView
    }

}

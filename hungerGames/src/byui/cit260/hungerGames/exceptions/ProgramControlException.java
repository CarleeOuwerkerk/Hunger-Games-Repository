/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hungerGames.exceptions;

/**
 *
 * @author Zack
 */
public class ProgramControlException extends Exception {

    public ProgramControlException() {
    }

    public ProgramControlException(String message) {
        super();
//                "Player's name is not valid."
//             +" Please enter a name with atleast"
//             +" two characters in it.");
    }

    public ProgramControlException(String message, Throwable cause) {
        super(message, cause);
    }

    public ProgramControlException(Throwable cause) {
        super(cause);
    }

    public ProgramControlException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
    
    
}

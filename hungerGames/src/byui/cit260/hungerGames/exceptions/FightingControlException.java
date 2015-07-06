/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hungerGames.exceptions;

/**
 *
 * @author Carlee Ouwerkerk
 */
public class FightingControlException extends Exception{

    public FightingControlException() {
    }

    public FightingControlException(String message) {
        super(message);
    }

    public FightingControlException(String message, Throwable cause) {
        super(message, cause);
    }

    public FightingControlException(Throwable cause) {
        super(cause);
    }

    public FightingControlException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
    
    
}

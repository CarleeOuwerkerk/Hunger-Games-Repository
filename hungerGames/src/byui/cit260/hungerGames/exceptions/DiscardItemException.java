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
public class DiscardItemException extends Exception {

    public DiscardItemException() {
    }

    public DiscardItemException(String message) {
        super(message);
    }

    public DiscardItemException(String message, Throwable cause) {
        super(message, cause);
    }

    public DiscardItemException(Throwable cause) {
        super(cause);
    }

    public DiscardItemException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

}

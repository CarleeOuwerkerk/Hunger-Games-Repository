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
public class UseItemException extends Exception {

    public UseItemException() {
    }

    public UseItemException(String message) {
        super(message);
    }

    public UseItemException(String message, Throwable cause) {
        super(message, cause);
    }

    public UseItemException(Throwable cause) {
        super(cause);
    }

    public UseItemException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

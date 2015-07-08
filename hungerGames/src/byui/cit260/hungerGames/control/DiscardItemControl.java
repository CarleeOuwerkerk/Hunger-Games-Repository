/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hungerGames.control;

import byui.cit260.hungerGames.exceptions.DiscardItemException;

/**
 *
 * @author Zack
 */
public class DiscardItemControl {

    public static void discardItem(Object obj) throws DiscardItemException {
        System.out.println("\n Could not discard item because you do not have one");
    }
}

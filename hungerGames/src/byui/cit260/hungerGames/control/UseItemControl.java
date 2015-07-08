/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hungerGames.control;

import byui.cit260.hungerGames.exceptions.UseItemException;

/**
 *
 * @author Zack
 */
public class UseItemControl {

    public static void useItem(Object obj) throws UseItemException {
        System.out.println("\n*** Item was not used because you do not have any items ***");
    }
}

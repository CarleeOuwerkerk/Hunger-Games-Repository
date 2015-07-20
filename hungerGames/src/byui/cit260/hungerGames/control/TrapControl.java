/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hungerGames.control;

import byui.cit260.hungerGames.exceptions.TrapControlException;
import byui.cit260.hungerGames.model.AssignedItem;
import byui.cit260.hungerGames.model.Item;
import hungergames.HungerGames;
import java.util.ArrayList;

/**
 *
 * @author Carlee Ouwerkerk
 */
public class TrapControl {

    public static boolean checkTrap(int height, int distance, int angle) throws TrapControlException {

        // check to see if trap was successful by calling the calculateAngle function
        TrapControl.calculateAngle(height, distance, angle);
        boolean successful = calculateAngle(height, distance, angle);

        if (successful) {

            // call searchList function for meat
            TrapControl.searchList(HungerGames.getCurrentGame().itemList, Item.meat);
            AssignedItem meatItem = searchList(HungerGames.getCurrentGame().itemList, Item.meat);

            if (meatItem == null) {
                // add new assignedItem to inventory for meat
                meatItem = new AssignedItem(Item.meat, 1);
            } else {
                // add 1 meat to current amount of assignedItem
//                AssignedItem assignedItem = HungerGames.getPlayer().getLocation().getAssignedItem();
//                meatItem = assignedItem.setAmount(assignedItem.getAmount() + 1);
            }
            return true;
            
        } else {
            
            return false;
            
        }
    }

    static public boolean calculateAngle(int height, int distance, int angle) throws TrapControlException {

        if (height != 8) {
            throw new TrapControlException("The height must be equal to eight.");
        }

        if (distance != 6) {
            throw new TrapControlException("The distance must be equal to six.");
        }

        if (angle != 10) {
            return false;
        }

        double heightDistance = Math.pow(height, 2) + Math.pow(distance, 2);
        if (heightDistance == Math.pow(angle, 2)) {
            return true;
        } else {
            return false;
        }

    }

    public static AssignedItem searchList(ArrayList<AssignedItem> assignedItems, Item item) {

        for (int i = 0; i < assignedItems.size(); i++) {
            if (assignedItems.get(i).getItem().equals(item)) {
                return assignedItems.get(i);
            }

        }
        return null;
    }
}

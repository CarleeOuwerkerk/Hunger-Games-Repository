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
            ArrayList<AssignedItem> itemList = HungerGames.getCurrentGame().getItemList();
            
            AssignedItem meatItem = searchList(itemList, Item.meat);

            if (meatItem == null) {
                // add new assignedItem to inventory for meat
                meatItem = new AssignedItem(Item.meat, 1);
                itemList.add(meatItem);
            } else {
                // add 1 meat to current amount of assignedItem
                meatItem.setAmount(meatItem.getAmount() + 1);
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

        for (AssignedItem assignedItem : assignedItems) {
            if (assignedItem.getItem().equals(item)) {
                return assignedItem;
            }
        }
        return null;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hungerGames.control;

import byui.cit260.hungerGames.exceptions.UseItemException;
import byui.cit260.hungerGames.model.AssignedItem;
import byui.cit260.hungerGames.model.Item;
import byui.cit260.hungerGames.model.Player;
import hungergames.HungerGames;
import java.util.ArrayList;

/**
 *
 * @author Zack
 */
public class UseItemControl {

    public static void useItem(Item item) throws UseItemException {

        ArrayList<AssignedItem> itemList = HungerGames.getCurrentGame().getItemList();

        // call the searchList function in trapControl
        TrapControl.searchList(itemList, item);

        // if assignedItem == null, throw an exception
        if (item == null) {
            throw new UseItemException("Item is not in your inventory");

            // if assignedItem's amount is > 0, throw an exception
            if (item.getAmount() > 0) {
                throw new UseItemException("Not enough " + item.getDescription() + " to use.");
                // subtract from the itemList by 1
                item.setAmount(item.getAmount() - 1);

                // get the players stats
                Player player = HungerGames.getPlayer();
                double skillPoints = player.getSkillPoints();

                // set players new stats to be added by item's stats
                double newStats = skillPoints + item.getStats();
                player.setSkillPoints(newStats);
            }
        }
    }

}

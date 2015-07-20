/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hungerGames.control;

import byui.cit260.hungerGames.exceptions.TrapControlException;
import byui.cit260.hungerGames.model.AssignedItem;
import byui.cit260.hungerGames.model.Item;
import static byui.cit260.hungerGames.model.Item.meat;
import hungergames.HungerGames;
import java.util.ArrayList;
import static jdk.nashorn.internal.objects.NativeString.search;

/**
 *
 * @author Carlee Ouwerkerk
 */
public class TrapControl {

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
        //I think we should change it so meat is in every location, that way you can set a trap anywhere
        //or, this may make thing easier, we could make it so there is ininity meat in every location
        //that way, we wouldn't have to check if there was meat.  This would make it easy to cheat, but
        //who's going to be really playing this?
        
        //we need something  here to check if there is an assigned meat item in this location.
        //if there isn't, we should println(You have already set a trap here) and return to the game menu
        //if there is meat available, we should proceed with this function
        double heightDistance = Math.pow(height, 2) + Math.pow(distance, 2);
        if (heightDistance == Math.pow(angle, 2)) {
         
            //We need to subtract one from the assigned meat item
           AssignedItem assignedItem = HungerGames.getPlayer().getLocation().getAssignedItem();
            
           //I'm not sure what this is doing
           // get assigned amount
           assignedItem.setAmount(assignedItem.getAmount() - 1);
    
        // get inventory
           
           //this will add meat to inventory from the trap
           meat.amount = meat.getAmount() + 1;
          
           
           //again, I'm not sure what this is doing
//           if inventory was found
            // new assignedlist for meat
                //set amount to 1
           
           //or what this is for
//           else 
                // get assigneditem for meat
                    //set amount(currentamount +1)
    
            return true;
        } else {
            return false;
        }

    }
    
//    public static AssignedItem searchList(Item[] assignedItems, Item item) {
//        
////        AssignedItem assignedItem = HungerGames.getPlayer().getLocation().getAssignedItem();
////        
////        for(Item Item : assignedItems) {
////            if(item.Item != meat) {
////                return assignedItem;
////            }
////        }
////        else {
////                return null;
////                }
////    }
    
} 

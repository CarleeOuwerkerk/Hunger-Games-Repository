/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hungerGames.model;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Zack
 */
public class Game implements Serializable {
    
    private Map map;
    private Player player;
    
    private Item[] foodItems = null;
    private Item[] weaponItems = null;
    private Item[] supplyItems = null;
   

    public Game() {
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Item[] getFoodItems() {
        return foodItems;
    }

    public void setFoodItems(Item[] foodItems) {
        this.foodItems = foodItems;
    }

    public Item[] getWeaponItems() {
        return weaponItems;
    }

    public void setWeaponItems(Item[] weaponItems) {
        this.weaponItems = weaponItems;
    }

    public Item[] getSupplyItems() {
        return supplyItems;
    }

    public void setSupplyItems(Item[] supplyItems) {
        this.supplyItems = supplyItems;
    }

    
}

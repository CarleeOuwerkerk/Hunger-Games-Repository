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

    public ArrayList<AssignedItem> itemList = new ArrayList<>();

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

    public ArrayList<AssignedItem> getItemList() {
        return itemList;
    }

    public void setItemList(ArrayList<AssignedItem> itemList) {
        this.itemList = itemList;
    }

    public void setItem(Item[] item) {
        System.out.println("\n*** setItem Stub Function called ***");
    }

}

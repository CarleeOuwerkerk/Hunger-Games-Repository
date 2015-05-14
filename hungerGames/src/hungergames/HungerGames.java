/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hungergames;

import byui.cit260.hungerGames.model.Inventory;
import byui.cit260.hungerGames.model.Items;
import byui.cit260.hungerGames.model.Map;
import byui.cit260.hungerGames.model.Player;
import byui.cit260.hungerGames.model.Scene;
import byui.cit260.hungerGames.model.Tributes;
import java.awt.Point;

/**
 *
 * @author Carlee Ouwerkerk
 */
public class HungerGames {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Player playerOne = new Player();
        
        playerOne.setName("Lord Voldemort");
 
        String playerInfo = playerOne.toString();
        System.out.println(playerInfo);
        
        Scene sceneOne = new Scene();
        sceneOne.setDescription("Sand Dune in dessert");
        sceneOne.setTerrainType("sand");
        sceneOne.setTrap(true);
        sceneOne.setStats(-3);
        sceneOne.setBlocked(false);
        
        String sceneInfo = sceneOne.toString();
        System.out.println(sceneInfo);
        
        Inventory inventoryOne = new Inventory();
        inventoryOne.setInventoryType("Weapon");
        inventoryOne.setNumberInStock(2);
        
        String inventoryInfo = inventoryOne.toString();
        System.out.println(inventoryInfo);
        
        Items itemOne = new Items();
        itemOne.setDescription("Bow and Arrow");
        itemOne.setType("Weapon");
        itemOne.setStats(7);
        itemOne.setNumberInStock(1);
        
        String itemInfo = itemOne.toString();
        System.out.println(itemInfo);
        
        Tributes tributeOne = new Tributes();
        
        tributeOne.setName("Player One");
        tributeOne.setDistrict(11);
        tributeOne.setStats(7);
        tributeOne.setLocation(new Point(3, 7));
        tributeOne.setGender("male");
        
        String tributeInfo = tributeOne.toString();
        System.out.println(tributeInfo);
        
        Map map = new Map();
        
        map.setRow(5);
        map.setColumn(2);
        
        String mapInfo = map.toString();
        System.out.println(mapInfo);
    }
    
}
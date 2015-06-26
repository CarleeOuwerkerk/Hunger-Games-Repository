/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hungerGames.control;

import byui.cit260.hungerGames.model.Game;
import byui.cit260.hungerGames.model.Item;
import byui.cit260.hungerGames.model.Map;
import byui.cit260.hungerGames.model.Player;
import hungergames.HungerGames;

/**
 *
 * @author Carlee Ouwerkerk
 */
public class GameControl {

    public static void creatNewGame(Player player) {
        Game game = new Game();
        HungerGames.setCurrentGame(game);
        
        game.setPlayer(player);
        
        Item[] foodItem = GameControl.createFoodList();
        GameControl.createFoodList();
        Item[] weaponItem = GameControl.createWeaponList();
        GameControl.createWeaponList();
        Item[] SupplyItem = GameControl.createSupplyList();
        GameControl.createSupplyList();
        
        Map map = MapControl.createMap();
        game.setMap(map);
        
        MapControl.moveTributesToStartingLocation(map);
    }

    public static Item[] createFoodList() {
        
        Item[] item = new Item[3];
        
        Item fruit = new Item();
        fruit.setDescription("Fruit");
        fruit.setStats(3);
        fruit.setAmount(0);
        item[0] = fruit;
        
        Item meat = new Item();
        meat.setDescription("Meat");
        meat.setStats(5);
        meat.setAmount(0);
        item[1] = meat;
        
        Item water = new Item();
        water.setDescription("Water");
        water.setStats(2);
        water.setAmount(0);
        item[2] = water;
        
        return item;
        
    }
    
    public static Item[] createWeaponList() {
        
        Item[] item = new Item[5];
        
        Item bat = new Item();
        bat.setDescription("Bat");
        bat.setStats(1);
        bat.setAmount(0);
        item[0] = bat;
        
        Item knife = new Item();
        knife.setDescription("Knife");
        knife.setStats(1);
        knife.setAmount(0);
        item[1] = knife;
        
        Item sword = new Item();
        sword.setDescription("Sword");
        sword.setStats(3);
        sword.setAmount(0);
        item[2] = sword;
        
        Item bowAndArrow = new Item();
        bowAndArrow.setDescription("Bow & Arrow");
        bowAndArrow.setStats(3);
        bowAndArrow.setAmount(0);
        item[3] = bowAndArrow;
        
        Item spear = new Item();
        spear.setDescription("Spear");
        spear.setStats(5);
        spear.setAmount(0);
        item[4] = spear;
        
        return item;
    }
    
        public static Item[] createSupplyList() {
        
        Item[] item = new Item[1];
        
       Item rope = new Item();
        rope.setDescription("Rope");
        rope.setStats(0);
        rope.setAmount(0);
        item[0] = rope;
        
        return item;

    }
        
}
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
        
        Item[] item = GameControl.createFoodList();
        Item[] item = GameControl.createWeaponList();
        Item[] item = GameControl.createSupplyList();
        game.setItem(item);
        
        Map map = MapControl.createMap();
        game.setMap(map);
        
        MapControl.moveTributesToStartingLocation(map);
    }

    public static Item[] createFoodList() {
        
        Item[] item = new FoodItem[3];
        
        FoodItem fruit = new FoodItem();
        fruit.setDescription("Fruit");
        fruit.setStats(3);
        fruit.setAmount(0);
        item[0] = fruit;
        
        FoodItem meat = new FoodItem();
        meat.setDescription("Meat");
        meat.setStats(3);
        meat.setAmount(0);
        item[0] = meat;
        
        FoodItem water = new FoodItem();
        water.setDescription("Water");
        water.setStats(3);
        water.setAmount(0);
        item[0] = water;
        
        return null;
        
    }
    
    public static Item[] createWeaponList() {
        
        Item[] item = new WeaponItem[3];
        
        WeaponItem bat = new WeaponItem();
        bat.setDescription("Bat");
        bat.setStats(3);
        bat.setAmount(0);
        item[0] = bat;
        
        WeaponItem knife = new WeaponItem();
        knife.setDescription("Knife");
        knife.setStats(3);
        knife.setAmount(0);
        item[0] = knife;
        
        WeaponItem sword = new WeaponItem();
        sword.setDescription("Sword");
        sword.setStats(3);
        sword.setAmount(0);
        item[0] = sword;
        
        WeaponItem bowAndArrow = new WeaponItem();
        bowAndArrow.setDescription("Bow & Arrow");
        bowAndArrow.setStats(3);
        bowAndArrow.setAmount(0);
        item[0] = bowAndArrow;
        
        WeaponItem spear = new WeaponItem();
        spear.setDescription("Spear");
        spear.setStats(3);
        spear.setAmount(0);
        item[0] = spear;
        
        return null;
    }
    
        public static Item[] createSupplyList() {
        
        Item[] item = new SupplyItem[3];
        
        SupplyItem bat = new SupplyItem();
        rope.setDescription("Rope");
        rope.setStats(3);
        rope.setAmount(0);
        item[0] = rope;
        
        return null;

    }
        
}
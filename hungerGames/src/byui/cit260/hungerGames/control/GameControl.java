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
import byui.cit260.hungerGames.model.Scene;
import hungergames.HungerGames;

/**
 *
 * @author Carlee Ouwerkerk
 */
public class GameControl {

    public static void createNewGame(Player player) {
        Game game = new Game();
        HungerGames.setCurrentGame(game);
        
        game.setPlayer(player);
        
        Item[] item = GameControl.createItemList();
        game.setItem(item);
        
        
        Map map = MapControl.createMap();
        game.setMap(map);
        
        MapControl.moveTributesToStartingLocation(map);
    }
        
      
    public static Item[] createItemList() {
        
        Item[] item = new Item[Constants.NUMBER_OF_ITEMS];
        
        
        Item fruit = new Item();
        fruit.setDescription("Fruit");
        fruit.setStats(3);
        fruit.setAmount(0);
        item[Item.fruit.ordinal()] = fruit;
        
        
        Item meat = new Item();
        meat.setDescription("Meat");
        meat.setStats(3);
        meat.setAmount(0);
        item[Item.meat.ordinal()] = meat;
        
        Item water = new Item();
        water.setDescription("Water");
        water.setStats(3);
        water.setAmount(0);
        item[Item.water.ordinal()] = water;
        
        Item bat = new Item();
        bat.setDescription("Bat");
        bat.setStats(3);
        bat.setAmount(0);
        item[Item.bat.ordinal()] = bat;
        
        Item knife = new Item();
        knife.setDescription("Knife");
        knife.setStats(3);
        knife.setAmount(0);
        item[Item.knife.ordinal()] = knife;
        
        Item sword = new Item();
        sword.setDescription("Sword");
        sword.setStats(3);
        sword.setAmount(0);
        item[Item.sword.ordinal()] = sword;
        
        Item bowAndArrow = new Item();
        bowAndArrow.setDescription("Bow & Arrow");
        bowAndArrow.setStats(3);
        bowAndArrow.setAmount(0);
        item[Item.bowAndArrow.ordinal()] = bowAndArrow;
        
        Item spear = new Item();
        spear.setDescription("Spear");
        spear.setStats(3);
        spear.setAmount(0);
        item[Item.spear.ordinal()] = spear;
        
        Item rope = new Item();
        rope.setDescription("Rope");
        rope.setStats(3);
        rope.setAmount(0);
        item[Item.rope.ordinal()] = rope;
        
        return null;

    }

    private static Item[] item(Item[] item1, Item[] item2, Item[] item3) {
        System.out.println("\n*** Created a New Game ***");
        return null;
    }

        
//        Item[] foodItem = GameControl.createFoodList();
//        GameControl.createFoodList();
//        Item[] weaponItem = GameControl.createWeaponList();
//        GameControl.createWeaponList();
//        Item[] supplyItem = GameControl.createSupplyList();
//        GameControl.createSupplyList();
//        
//        Map map = MapControl.createMap();
//        game.setMap(map);
//        
//        MapControl.moveTributesToStartingLocation(map);
//    }
//        
//        public enum weaponItem{
//            bat,
//            knife,
//            sword,
//            bowAndArrow,
//            spear;
//            }
//        
//        public enum supplyItem{
//            rope;
//            }
//        
//    public static Item[] createFoodList() {
//        
//        Item[] item = new Item[Constants.NUMBER_OF_FOOD_ITEMS];
//        
//        
//        Item fruit = new Item();
//        fruit.setDescription("Fruit");
//        fruit.setStats(3);
//        fruit.setAmount(0);
//        item[Item.fruit.ordinal()] = fruit;
//        
//        
//        Item meat = new Item();
//        meat.setDescription("Meat");
//        meat.setStats(3);
//        meat.setAmount(0);
//        item[1] = meat;
//        
//        Item water = new Item();
//        water.setDescription("Water");
//        water.setStats(3);
//        water.setAmount(0);
//        item[2] = water;
//        
//        return null;
//        
//    }
//    
//    public enum foodItem{
//            fruit,
//            meat,
//            water;
//            }
//        
//    
//    public static Item[] createWeaponList() {
//        
//        Item[] item = new Item[3];
//        
//        Item bat = new Item();
//        bat.setDescription("Bat");
//        bat.setStats(3);
//        bat.setAmount(0);
//        item[0] = bat;
//        
//        Item knife = new Item();
//        knife.setDescription("Knife");
//        knife.setStats(3);
//        knife.setAmount(0);
//        item[0] = knife;
//        
//        Item sword = new Item();
//        sword.setDescription("Sword");
//        sword.setStats(3);
//        sword.setAmount(0);
//        item[0] = sword;
//        
//        Item bowAndArrow = new Item();
//        bowAndArrow.setDescription("Bow & Arrow");
//        bowAndArrow.setStats(3);
//        bowAndArrow.setAmount(0);
//        item[0] = bowAndArrow;
//        
//        Item spear = new Item();
//        spear.setDescription("Spear");
//        spear.setStats(3);
//        spear.setAmount(0);
//        item[0] = spear;
//        
//        return null;
//    }
//    
//        public static Item[] createSupplyList() {
//        
//        Item[] item = new Item[3];
//        
//        Item rope = new Item();
//        rope.setDescription("Rope");
//        rope.setStats(3);
//        rope.setAmount(0);
//        item[0] = rope;
//        
//        return null;
//
//    }
//
//    private static Item[] item(Item[] item1, Item[] item2, Item[] item3) {
//        System.out.println("\n*** Created a New Game ***");
//        return null;
//    }

    static void assignScenesToLocations(Map map, Scene[] scenes) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    static void assignScenesToLocations(Map map, Scene[] scenes) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}
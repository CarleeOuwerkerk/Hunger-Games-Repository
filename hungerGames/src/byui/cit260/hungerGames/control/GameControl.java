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
        
        
        Map map = MapControl.createMap();
        game.setMap(map);
        
        MapControl.moveTributesToStartingLocation(map);
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
//    private static Item[] item(Item[] item1, Item[] item2, Item[] item3) {
//        System.out.println("\n*** Created a New Game ***");
//        return null;
//    }


    //    public static Item[] sortItems() {
    
//        Item [] orginalItemList = HungerGames.getCurrentGame().getItemList();
//        
//        Item [] item
    
    public static Item [] items = Item.values(); {
    
    for(int i = 0; i < items.length - 1; i++) {
        int index = 1;
        for (int j = i + 1; j < items.length; j++)
            if( items[j].compareToIgnoreCase(items[index]) < 0)
            index = j;
            
        Item smaller = items[index];
        items[index] = items[i];
        items[i] = smaller;
        
        }
    
    }
    
    
    
    }

            
   
    


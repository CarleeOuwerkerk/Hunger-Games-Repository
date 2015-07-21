/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hungerGames.control;

import byui.cit260.hungerGames.exceptions.MapControlException;
import byui.cit260.hungerGames.model.AssignedItem;
import byui.cit260.hungerGames.model.Item;
import byui.cit260.hungerGames.model.Location;
import byui.cit260.hungerGames.model.Map;
import byui.cit260.hungerGames.model.Player;
import byui.cit260.hungerGames.model.Scene;
import byui.cit260.hungerGames.model.Tribute;
import hungergames.HungerGames;
import java.awt.Point;

/**
 *
 * @author Carlee Ouwerkerk
 */
public class MapControl {

    static Map createMap() {
        Map map = new Map(6, 6);

        MapControl.assignScenesToLocations(map);
        MapControl.assignItemToLocation(map);

        return map;
    }


    private static void assignScenesToLocations(Map map) {
        Location[][] locations = map.getLocations();

    
        locations[0][0].setScene(Scene.start);
        locations[0][1].setScene(Scene.field);
        locations[0][2].setScene(Scene.marsh);
        locations[0][3].setScene(Scene.marsh);
        locations[0][3].setTribute(Tribute.amber);
        locations[0][4].setScene(Scene.marsh);
        locations[0][5].setScene(Scene.marsh);
        locations[1][0].setScene(Scene.field);
        locations[1][1].setScene(Scene.field);
        locations[1][2].setScene(Scene.field);
        locations[1][3].setScene(Scene.marsh);
        locations[1][4].setScene(Scene.marsh);
        locations[1][4].setTribute(Tribute.fred);
        locations[1][5].setScene(Scene.marsh);
        locations[2][0].setScene(Scene.forest);
        locations[2][1].setScene(Scene.forest);
        locations[2][2].setScene(Scene.forest);
        locations[2][3].setScene(Scene.forest);
        locations[2][4].setScene(Scene.forest);
        locations[2][5].setScene(Scene.mountain);
        locations[2][5].setTribute(Tribute.bill);
        locations[3][0].setScene(Scene.forest);
        locations[3][1].setScene(Scene.sand);
        locations[3][1].setTribute(Tribute.kate);
        locations[3][2].setScene(Scene.sand);
        locations[3][3].setScene(Scene.grass);
        locations[3][3].setTribute(Tribute.george);
        locations[3][4].setScene(Scene.mountain);
        locations[3][5].setScene(Scene.mountain);
        locations[4][0].setScene(Scene.forest);
        locations[4][0].setTribute(Tribute.ted);
        locations[4][1].setScene(Scene.sand);
        locations[4][2].setScene(Scene.sand);
        locations[4][3].setScene(Scene.grass);
        locations[4][4].setScene(Scene.grass);
        locations[4][5].setScene(Scene.grass);
        locations[5][0].setScene(Scene.finish);
        locations[5][0].setTribute(Tribute.suzy);
        locations[5][1].setScene(Scene.field);
        locations[5][2].setScene(Scene.field);
        locations[5][2].setTribute(Tribute.ali);
        locations[5][3].setScene(Scene.mountain);
        locations[5][4].setScene(Scene.mountain);
        locations[5][5].setScene(Scene.mountain);
    }

    public static Location movePlayerToLocation(Player player, Point coordinates) throws MapControlException {


        // get map (location)
        Location[][] locations = HungerGames.getCurrentGame().getMap().getLocations();

        // if player == null, throw MapControlException
        if (player == null) {
            throw new MapControlException("Player is null");
        }

        //if coordinates x and y > 5 or < 0 throw exception
        if (coordinates.x > locations.length - 1 || coordinates.y > locations[0].length - 1 || coordinates.x < 0 || coordinates.y < 0) {
            throw new MapControlException("Location is out of map boundaries");
        }

        Location targetLocation = locations[coordinates.x][coordinates.y];

        //move out of current location
        player.getLocation().setPlayer(null);

        //put in new location[coordinates.x][coordinates.y]
        targetLocation.setPlayer(player);

        // Assign new location to player
        player.setLocation(targetLocation);

        //return the new location
        return targetLocation;
        
    }
    
    public static void assignItemToLocation(Map map) {
        Location[][] locations = map.getLocations();
        
        // create new assigned item
        AssignedItem waterItem = new AssignedItem(Item.water,1);
        // set AssignedItem to location
        locations[0][1].setAssignedItem(waterItem);
        locations[4][0].setAssignedItem(waterItem);
        
         // create new assigned item
        AssignedItem meatItem = new AssignedItem(Item.meat,2);
        // set AssignedItem to location
        locations[0][1].setAssignedItem(meatItem);
        locations[0][2].setAssignedItem(meatItem);
        locations[0][3].setAssignedItem(meatItem);
        locations[0][4].setAssignedItem(meatItem);
        locations[0][5].setAssignedItem(meatItem);
        locations[1][0].setAssignedItem(meatItem);
        locations[1][1].setAssignedItem(meatItem);
        locations[1][2].setAssignedItem(meatItem);
        locations[1][3].setAssignedItem(meatItem);
        locations[1][4].setAssignedItem(meatItem);
        locations[1][5].setAssignedItem(meatItem);
        locations[2][0].setAssignedItem(meatItem);
        locations[2][1].setAssignedItem(meatItem);
        locations[2][2].setAssignedItem(meatItem);
        locations[2][3].setAssignedItem(meatItem);
        locations[2][4].setAssignedItem(meatItem);
        locations[2][5].setAssignedItem(meatItem);
        locations[3][0].setAssignedItem(meatItem);
        locations[3][1].setAssignedItem(meatItem);
        locations[3][2].setAssignedItem(meatItem);
        locations[3][3].setAssignedItem(meatItem);
        locations[3][3].setAssignedItem(meatItem);
        locations[3][4].setAssignedItem(meatItem);
        locations[3][5].setAssignedItem(meatItem);
        locations[4][0].setAssignedItem(meatItem);
        locations[4][1].setAssignedItem(meatItem);
        locations[4][2].setAssignedItem(meatItem);
        locations[4][3].setAssignedItem(meatItem);
        locations[4][4].setAssignedItem(meatItem);
        locations[4][5].setAssignedItem(meatItem);
        locations[5][0].setAssignedItem(meatItem);
        locations[5][1].setAssignedItem(meatItem);
        locations[5][2].setAssignedItem(meatItem);
        locations[5][3].setAssignedItem(meatItem);
        locations[5][4].setAssignedItem(meatItem);
        locations[5][5].setAssignedItem(meatItem);
        
         // create new assigned item
        AssignedItem fruitItem = new AssignedItem(Item.fruit,1);
        // set AssignedItem to location
        locations[0][3].setAssignedItem(fruitItem);
        locations[2][0].setAssignedItem(fruitItem);
        locations[5][1].setAssignedItem(fruitItem);
        
        // create new assigned item
        AssignedItem knifeItem = new AssignedItem(Item.knife,1);
        // set AssignedItem to location
        locations[0][2].setAssignedItem(knifeItem);
        locations[3][1].setAssignedItem(knifeItem);
        locations[5][5].setAssignedItem(knifeItem);
        
        // create new assigned item
        AssignedItem batItem = new AssignedItem(Item.bat,1);
        // set AssignedItem to location
        locations[2][5].setAssignedItem(batItem);
        locations[3][0].setAssignedItem(batItem);
        
        // create new assigned item
        AssignedItem swordItem = new AssignedItem(Item.sword,1);
        // set AssignedItem to location
        locations[1][0].setAssignedItem(swordItem);
        locations[3][5].setAssignedItem(swordItem);
        
        // create new assigned item
        AssignedItem bowAndArrowItem = new AssignedItem(Item.bowAndArrow,1);
        // set AssignedItem to location
        locations[1][3].setAssignedItem(bowAndArrowItem);
        locations[4][5].setAssignedItem(bowAndArrowItem);
       
        // create new assigned item
        AssignedItem spearItem = new AssignedItem(Item.spear,1);
        // set AssignedItem to location
        locations[4][1].setAssignedItem(spearItem);
        locations[5][4].setAssignedItem(spearItem);
    }

}

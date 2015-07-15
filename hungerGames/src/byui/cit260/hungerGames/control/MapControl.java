/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hungerGames.control;

import byui.cit260.hungerGames.exceptions.MapControlException;
import byui.cit260.hungerGames.model.Game;
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

        return map;
    }
//
//    public static int moveTributesToStartingLocation(Map map) {
//        
//        Tribute[] tributes = Tribute.values();
//        
//        for (Tribute player : tributes) {
//            Point coordinates = Tribute.getLocation();
//            int returnValue = MapControl.movePlayerToLocation(player, coordinates);
//            if (returnValue < 0){
//                return returnValue;
//            }
//        }
//        return 0;
//    }

    private static void assignScenesToLocations(Map map) {
        Location[][] locations = map.getLocations();

        locations[0][0].setScene(Scene.start);
        locations[0][1].setScene(Scene.field);
        locations[0][2].setScene(Scene.marsh);
        locations[0][3].setScene(Scene.marsh);
        locations[0][4].setScene(Scene.marsh);
        locations[0][5].setScene(Scene.marsh);
        locations[1][0].setScene(Scene.field);
        locations[1][1].setScene(Scene.field);
        locations[1][2].setScene(Scene.field);
        locations[1][3].setScene(Scene.marsh);
        locations[1][4].setScene(Scene.marsh);
        locations[1][5].setScene(Scene.marsh);
        locations[2][0].setScene(Scene.forest);
        locations[2][1].setScene(Scene.forest);
        locations[2][2].setScene(Scene.forest);
        locations[2][3].setScene(Scene.forest);
        locations[2][4].setScene(Scene.forest);
        locations[2][5].setScene(Scene.mountain);
        locations[3][0].setScene(Scene.forest);
        locations[3][1].setScene(Scene.sand);
        locations[3][2].setScene(Scene.sand);
        locations[3][3].setScene(Scene.grass);
        locations[3][4].setScene(Scene.mountain);
        locations[3][5].setScene(Scene.mountain);
        locations[4][0].setScene(Scene.forest);
        locations[4][1].setScene(Scene.sand);
        locations[4][2].setScene(Scene.sand);
        locations[4][3].setScene(Scene.grass);
        locations[4][4].setScene(Scene.grass);
        locations[4][5].setScene(Scene.grass);
        locations[5][0].setScene(Scene.finish);
        locations[5][1].setScene(Scene.field);
        locations[5][2].setScene(Scene.field);
        locations[5][3].setScene(Scene.mountain);
        locations[5][4].setScene(Scene.mountain);
        locations[5][5].setScene(Scene.mountain);
    }

    public static Location movePlayerToLocation(Player player, Point coordinates) throws MapControlException {

//        Map map = HungerGames.getCurrentGame().getMap();
//        int newRow = coordinates.x - 1;
//        int newColumn = coordinates.y - 1;

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

//        if (newRow < 0 || newRow >= map.getNoOfRows() || newColumn < 0 || newColumn >= map.getNoOfColumns()) {
//            throw new MapControlException("Cannot move player to location."
//                    + coordinates.x + ", " + coordinates.y
//                    + " because that location is outside "
//                    + "the bounds of the map.");
//        }
//        return 0;
//    }
    }

}

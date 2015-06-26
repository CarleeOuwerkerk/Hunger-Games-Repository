/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hungerGames.control;

import byui.cit260.hungerGames.model.Location;
import byui.cit260.hungerGames.model.Map;
import byui.cit260.hungerGames.model.Scene;

/**
 *
 * @author Carlee Ouwerkerk
 */
public class MapControl {

    static Map createMap() {
        Map map = new Map(5, 5);
        
        Scene[] scenes = createScenes();
        
        GameControl.assignScenesToLocations(map, scenes);
        
        return map;
    }

    static void moveTributesToStartingLocation(Map map) {
        System.out.println("\n*** moveTributesToStartingLocation stub function called ***");
    }


    private static void assignScenesToLocations(Map map, Scene[] scenes) {
        Location[][] locations = map.getLocations();
        
        locations[0][0].setScene(scenes[Scene.start.ordinal()]);
        locations[0][1].setScene(scenes[Scene.field.ordinal()]);
        locations[0][2].setScene(scenes[Scene.marsh.ordinal()]);
        locations[0][3].setScene(scenes[Scene.marsh.ordinal()]);
        locations[0][4].setScene(scenes[Scene.marsh.ordinal()]);
        locations[0][5].setScene(scenes[Scene.marsh.ordinal()]);
        locations[1][0].setScene(scenes[Scene.field.ordinal()]);
        locations[1][1].setScene(scenes[Scene.field.ordinal()]);
        locations[1][2].setScene(scenes[Scene.field.ordinal()]);
        locations[1][3].setScene(scenes[Scene.marsh.ordinal()]);
        locations[1][4].setScene(scenes[Scene.marsh.ordinal()]);
        locations[1][5].setScene(scenes[Scene.marsh.ordinal()]);
        locations[2][0].setScene(scenes[Scene.forest.ordinal()]);
        locations[2][1].setScene(scenes[Scene.forest.ordinal()]);
        locations[2][2].setScene(scenes[Scene.forest.ordinal()]);
        locations[2][3].setScene(scenes[Scene.forest.ordinal()]);
        locations[2][4].setScene(scenes[Scene.forest.ordinal()]);
        locations[2][5].setScene(scenes[Scene.mountain.ordinal()]);
        locations[3][0].setScene(scenes[Scene.forest.ordinal()]);
        locations[3][1].setScene(scenes[Scene.sand.ordinal()]);
        locations[3][2].setScene(scenes[Scene.sand.ordinal()]);
        locations[3][3].setScene(scenes[Scene.grass.ordinal()]);
        locations[3][4].setScene(scenes[Scene.mountain.ordinal()]);
        locations[3][5].setScene(scenes[Scene.mountain.ordinal()]);
        locations[4][0].setScene(scenes[Scene.forest.ordinal()]);
        locations[4][1].setScene(scenes[Scene.sand.ordinal()]);
        locations[4][2].setScene(scenes[Scene.sand.ordinal()]);
        locations[4][3].setScene(scenes[Scene.grass.ordinal()]);
        locations[4][4].setScene(scenes[Scene.grass.ordinal()]);
        locations[4][5].setScene(scenes[Scene.grass.ordinal()]);
        locations[5][0].setScene(scenes[Scene.finish.ordinal()]);
        locations[5][1].setScene(scenes[Scene.field.ordinal()]);
        locations[5][2].setScene(scenes[Scene.field.ordinal()]);
        locations[5][3].setScene(scenes[Scene.mountain.ordinal()]);
        locations[5][4].setScene(scenes[Scene.mountain.ordinal()]);
        locations[5][5].setScene(scenes[Scene.mountain.ordinal()]);
    }

    private static Scene[] createScenes() throws MapControlException {
        
        Game game = HungerGames.getCurrentGame();
        
        Scene[] scenes = new Scene[Scene.values().length];
        
        Scene startingScene = new Scene();
        startingScene.setDescription(
                "\n Welcome to the Hunger Games, let the games BEGIN!");
        startingScene.setMapSymbol(" ST ");
        startingScene.setTravelTime(100);
        scenes[Scene.start.ordinal()] = startingScene;
        
        Scene finishScene = new Scene();
        finishScene.setDescription(
                "\n Congrats, you didn't die. You are numbered amogest the Victors");
        finishScene.setMapSymbol(" FN ");
        finishScene.setTravelTime(Double.POSITIVE_INFINITY);
        scenes[Scene.finish.ordinal()] = finishScene;
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

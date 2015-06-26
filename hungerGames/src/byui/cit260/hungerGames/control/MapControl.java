/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hungerGames.control;

import byui.cit260.hungerGames.model.Map;
import byui.cit260.hungerGames.model.Scene;

/**
 *
 * @author Carlee Ouwerkerk
 */
public class MapControl {

    static Map createMap() {
        Map map = new Map(10, 10);
        
        assignScenesToLocations(map);
        
        return map;
    }

    static void moveTributesToStartingLocation(Map map) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    private static void assignScenesToLocations(Map map) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

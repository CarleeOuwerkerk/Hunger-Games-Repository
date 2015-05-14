/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hungergames;

import byui.cit260.hungerGames.model.Player;
import byui.cit260.hungerGames.model.Scene;

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
    }
    
}
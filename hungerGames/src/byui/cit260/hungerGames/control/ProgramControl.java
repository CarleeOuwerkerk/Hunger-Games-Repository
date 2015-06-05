/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hungerGames.control;

import byui.cit260.hungerGames.model.Player;
import hungergames.HungerGames;

/**
 *
 * @author Zack
 */
public class ProgramControl {

    public static Player createPlayer(String playersName) {
        
        if (playersName == null){
            return null;
        }
        Player player= new Player();
        player.setName(playersName);
        
        HungerGames.setPlayer(player);
        
        return player;
    }
}
    

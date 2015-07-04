/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hungerGames.control;

import byui.cit260.hungerGames.exceptions.ProgramControlException;
import byui.cit260.hungerGames.model.Player;
import hungergames.HungerGames;
import java.lang.String;
/**
 *
 * @author Zack
 */
public class ProgramControl {

    public static Player createPlayer(String playersName) throws ProgramControlException {
        
        if (playersName == null){
            throw new ProgramControlException("Player's name is not valid."
                                            +" Please enter a name with atleast"
                                            +" two characters in it.");
        }
     
        Player player= new Player();
        player.setName(playersName);
        
        HungerGames.setPlayer(player);
        
        return player;
    }
}
    

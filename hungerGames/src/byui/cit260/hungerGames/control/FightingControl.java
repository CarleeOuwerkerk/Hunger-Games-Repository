/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hungerGames.control;

import java.util.Random;

/**
 *
 * @author Carlee Ouwerkerk
 */
public class FightingControl {
          
    
        Random playerRandomFactor = new Random();
        double randomNum = playerRandomFactor.nextInt(6 - 1);
        
        Random tributeRandomFactor = new Random();
        double randomNum = tributeRandomFactor.nextInt(4 - 1);
        
    static public boolean calculateSneak(double player, double scene, double tribute){
            
        //Sneak paramaters
        if (player < 0 || player > 51) {
            return false;
        }
        
        if (scene < -3 || scene > 3) {
            return false;
        }
        
        if (tribute < 5 || tribute > 45) {
            return false;
        }
        
        //Calculate sneak
        if ((player + scene) * playerRandomFactor) < (tribute * tributeRandomFactor) {
            return false;
        }
        
        if ((player + scene) * playerRandomFactor) > (tribute * tributeRandomFactor) {
            return true;
        }

    }
    
}
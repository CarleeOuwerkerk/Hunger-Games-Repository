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
          
    
    static public boolean calculateSneak(double player, double scene, double tribute){
        
        Random playerRandomFactor = new java.util.Random(); 
        Random tributeRandomFactor = new java.util.Random(); 
            
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
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hungerGames.control;

import byui.cit260.hungerGames.exceptions.FightingControlException;
import java.util.Random;

/**
 *
 * @author Carlee Ouwerkerk
 */
public class FightingControl {
          
        
    static public boolean calculateSneak(double player, double scene, double tribute) throws FightingControlException{

        //Sneak paramaters
        if (player < 0 || player >= 51) {
            throw new FightingControlException("The player's stats have to be greater "
                                              + "than zero and less than or equal to "
                                              + "fifty-one.");
        }                                       // There is no other function calling this function yet, so I 
                                                // couldn't add any throws or catch statements anywhere else.
        
        if (scene < -3 || scene > 3) {
            throw new FightingControlException("The environment factor has to be greater "
                                              + "than three and less than negative three.");
        }
        
        if (tribute < 5 || tribute >= 45) {
            return false;
        }
        
        Random randomNum1 = new Random();
        double playerRandomFactor = randomNum1.nextInt(6);
        
        Random randomNum2 = new Random();
        double tributeRandomFactor = randomNum2.nextInt(4);
        
        //Calculate sneak
        double playerFactor =(player + scene) * playerRandomFactor;
        double tributeFactor = tribute * tributeRandomFactor;
        
        //ignore the "if statement is redundant" comment on the left.
        if (playerFactor < tributeFactor) {
            return false;
        }
        
        else {
            return true;
        }
    }
    
    static public boolean calculateForcedFight(double player, double tribute){

        //forced fight paramaters
        if (player < 0 || player >= 51) {
            return false;
        }
        
        if (tribute < 5 || tribute > 45) {
            return false;
        }
        
        // As we make new random numbers with different ranges we should continue with the pattern of randomNum1, randomNum2, randomNum3, etc.
        Random randomNum1 = new Random();
        double RandomFactor = randomNum1.nextInt(4);
        
        //Calculate forced fight
        double playerFactor = ((player - 3) * RandomFactor);
        double tributeFactor = tribute * RandomFactor;
        
        //ignore the "if statement is redundant" comment on the left.
        if (playerFactor < tributeFactor) {
            return false;
        }
        
        else {
            return true;
        }
    }
    
    static public boolean calculateFight(double player, double tribute){

        //Sneak paramaters
        if (player < 0 || player >= 51) {
            return false;
        }
        
        if (tribute < 5 || tribute >= 45) {
            return false;
        }
        
        // As we make new random numbers with different ranges we should continue with the pattern of randomNum1, randomNum2, randomNum3, etc.
        Random randomNum1 = new Random();
        double RandomFactor = randomNum1.nextInt(4);

        //Calculate sneak
        double playerFactor = (player + 2) * RandomFactor;
        double tributeFactor = tribute * RandomFactor;
        
        //ignore the "if statement is redundant" comment on the left.
        if (playerFactor < tributeFactor) {
            return false;
        }
        
        else {
            return true;
        }
    }
    
    
}

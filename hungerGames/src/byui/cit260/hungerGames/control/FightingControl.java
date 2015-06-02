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

        //Sneak paramaters
        if (player < 0 || player >= 51) {
            return false;
        }
        
        if (scene < -3 || scene > 3) {
            return false;
        }
        
        if (tribute < 5 || tribute >= 45) {
            return false;
        }
        
        // As we make new random numbers with different ranges we should continue with the pattern of randomNum1, randomNum2, randomNum3, etc.
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
    
}
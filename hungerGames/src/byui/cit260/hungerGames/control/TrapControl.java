/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hungerGames.control;

/**
 *
 * @author Carlee Ouwerkerk
 */
public class TrapControl {
    
    static public boolean calculateAngle(int height, int distance, int angle) {
    
    
    if (height != 8) { 
        return false;
}
    
    if (distance != 6){
        return false;
}
    
    if (angle != 10){
        return false;
    }
    double heightDistance=  Math.pow(height, 2) + Math.pow(distance, 2);
    if (heightDistance == Math.pow(angle, 2)){
        return true;
    }
    else {
        return false;
    }
    
    }
}


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hungerGames.control;

import byui.cit260.hungerGames.model.Tribute;

/**
 *
 * @author Carlee Ouwerkerk
 */
public class TributeControl {
    
    //sort tributes by their stats, highest to lowest
    public static Tribute [] tribute = Tribute.values(); {
    
    for(int i = 0; i < tribute.length - 1; i++) {
        int index = 1;
        for (int j = i + 1; j < tribute.length; j++)
            if( tribute[j].compareToIgnoreCase(tribute[index]) < 0)
            index = j;
            
        Tribute smaller = tribute[index];
        tribute[index] = tribute[i];
        tribute[i] = smaller;
        }
    
    }
}
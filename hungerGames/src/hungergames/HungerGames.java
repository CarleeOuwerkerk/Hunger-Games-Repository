/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hungergames;

import byui.cit260.hungerGames.model.Player;

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
    }
    
}
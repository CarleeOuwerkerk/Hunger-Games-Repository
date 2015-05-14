/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hungergames;

import byui.cit260.hungerGames.model.Player;
import byui.cit260.hungerGames.model.Tributes;
import java.awt.Point;

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
        
        Tributes tributeOne = new Tributes();
        
        tributeOne.setName("Player One");
        tributeOne.setDistrict(11);
        tributeOne.setStats(7);
        tributeOne.setLocation(new Point(3, 7));
        tributeOne.setGender("male");
        
        String tributeInfo = tributeOne.toString();
        System.out.println(tributeInfo);
    }
    
}
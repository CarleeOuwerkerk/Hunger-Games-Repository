/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hungerGames.control;

import byui.cit260.hungerGames.exceptions.GameControlException;
import byui.cit260.hungerGames.model.Game;
import byui.cit260.hungerGames.model.Item;
import byui.cit260.hungerGames.model.Map;
import byui.cit260.hungerGames.model.Player;
import hungergames.HungerGames;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author Carlee Ouwerkerk
 */
public class GameControl {

    public static void createNewGame(Player player) {
        Game game = new Game();
        HungerGames.setCurrentGame(game);

        game.setPlayer(player);

        Map map = MapControl.createMap();
        game.setMap(map);

    }


    public static void saveGame(Game currentGame, String filePath) throws GameControlException {
        try(FileOutputStream fops = new FileOutputStream(filePath)){
            ObjectOutputStream output = new ObjectOutputStream(fops);
            
            output.writeObject(currentGame);
        }
        
        catch(IOException e){
            throw new GameControlException(e.getMessage());
        }
            
        
    }
public static Item[] items = Item.values();

    public static void continueGame(String filePath) throws GameControlException{
        
    }
{

        for (int i = 0; i < items.length - 1; i++) {
            int index = 1;
            for (int j = i + 1; j < items.length; j++) {
                if (items[j].compareToIgnoreCase(items[index]) < 0) {
                    index = j;
                }
            }

            Item smaller = items[index];
            items[index] = items[i];
            items[i] = smaller;

        }
    }

}

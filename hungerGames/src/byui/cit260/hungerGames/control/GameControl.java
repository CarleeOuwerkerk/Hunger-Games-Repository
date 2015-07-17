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
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
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

        player.setLocation(map.getLocations()[0][0]);

    }

    public static void saveGame(Game currentGame, String filePath) throws GameControlException {
        try (FileOutputStream fops = new FileOutputStream(filePath)) {
            ObjectOutputStream output = new ObjectOutputStream(fops);

            output.writeObject(currentGame);
        } catch (IOException e) {
            throw new GameControlException(e.getMessage());
        }

    }

    public static void continueGame(String filePath) throws GameControlException {
        Game game = null;

        try (FileInputStream fips = new FileInputStream(filePath)) {
            ObjectInputStream output = new ObjectInputStream(fips);

            game = (Game) output.readObject();
        } catch (FileNotFoundException fnfe) {
            throw new GameControlException(fnfe.getMessage());
        } catch (Exception e) {
            throw new GameControlException(e.getMessage());
        }

        HungerGames.setCurrentGame(game);
    }
    public static Item[] items = Item.values();

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

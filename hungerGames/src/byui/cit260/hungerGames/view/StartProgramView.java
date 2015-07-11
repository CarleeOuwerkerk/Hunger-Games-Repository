/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hungerGames.view;

import byui.cit260.hungerGames.control.ProgramControl;
import byui.cit260.hungerGames.exceptions.ProgramControlException;
import byui.cit260.hungerGames.model.Player;
import hungergames.HungerGames;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Zack
 */
public class StartProgramView{
    
    protected final BufferedReader keyboard = HungerGames.getInFile();
    protected final PrintWriter console = HungerGames.getOutFile();

    public void startProgram() throws ProgramControlException {

        //Display the banner scren
        this.displayBanner();
        //Get player's name
        String playersName = this.getPlayersName();
        //Create a new player
        Player player = ProgramControl.createPlayer(playersName);
        //DISPLAY a customized welcome message
        this.displayWelcomeMessage(player);
        //DISPLAY main menu
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.display();

    }

    private void displayBanner() {
       this.console.println("\n\n************************************************************"
                + "\n*                                                          *"
                + "\n* Welcome to the 67th annual Hunger Games!  In a few       *"
                + "\n* moments you will be placed in the arena with the rest of *"
                + "\n* the tributes.  Your objective is to be the last          *"
                + "\n* tribute standing.  You can achieve this by outlasting    *"
                + "\n* some tributes and killing others.                        *"
                + "\n*                                                          *"
                + "\n* You will begin by selecting a district and a name.       *"
                + "\n* Once in the arena, you will be able to move to different *"
                + "\n* locations. In each location, you will be provided with   *"
                + "\n* options of things that you are able to do. Each time     *"
                + "\n* that you move to another location, four elapse. Every 24 *"
                + "\n* hours means another tribute has been killed by a player. *"
                + "\n* As you move around, you are able to find supplies and    *"
                + "\n* weapons. You can use these supplies and weapons to help  *"
                + "\n* increase your skill points. You may also find objects,   *"
                + "\n* animals, or other things that may lower their skill      *"
                + "\n* points.                                                  *"
                + "\n*                                                          *"
                + "\n* There will be other tributes scattered throughout the    *"
                + "\n* arena. If you land on the same space as another tribute, *"
                + "\n* you have the option to either fight or attempt to sneak  *"
                + "\n* past.                                                    *"
                + "\n*                                                          *"
                + "\n* Once all the other tributes have been eliminated, the    *"
                + "\n* game will be over, and you will become the winner of the *"
                + "\n* 67th annual Hunger Games.                                *"
                + "\n*                                                          *"
                + "\n* May the odds be ever in your favour!                     *"
                + "\n*                                                          *"
                + "\n************************************************************");
    }


    private String getPlayersName() throws ProgramControlException {
        boolean valid = false;
        String playersName = null;

        while (!valid) {

            this.console.println("Enter your name");

            try {
                playersName = this.keyboard.readLine();
            } catch (IOException ex) {
               System.out.println("I/O Error: " + ex.getMessage());
            }
            playersName = playersName.trim();

            if (playersName.length() < 2) {
                try {
                    ProgramControl.createPlayer(playersName);
                } catch (ProgramControlException pe) {
                    this.console.println(pe.getMessage());
                }
                continue;
            }
            break;
        }

        return playersName;
    }
    
    public void displayWelcomeMessage(Player player) {

        this.console.println("\n\n============================================================");
        this.console.println("\tWelcome to the 67th annual Hunger Games, " + player.getName() + ".");
        this.console.println("\t    May the odds be ever in your favour!");
        this.console.println("============================================================");

    }

}

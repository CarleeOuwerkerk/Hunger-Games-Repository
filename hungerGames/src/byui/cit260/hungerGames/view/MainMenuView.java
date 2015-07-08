/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hungerGames.view;

import byui.cit260.hungerGames.control.GameControl;
import hungergames.HungerGames;
import java.util.Scanner;

/**
 *
 * @author Zack
 */
public class MainMenuView extends View {

    public MainMenuView() {
        super("\n"
                + "\n----------------------------------------------"
                + "\n| Main Menu                                  |"
                + "\n----------------------------------------------"
                + "\nN - New Game"
                + "\nC - Continue Saved Game"
                + "\nH - Help"
                + "\nQ - Quit"
                + "\n----------------------------------------------");
    }

    @Override
    public boolean doAction(Object obj) {

        String selection = (String) obj;
        selection = selection.toUpperCase();

        switch (selection) {
            case "N":
                this.startNewGame();
                break;
            case "C":
                this.continueExistingGame();
                break;
            case "H":
                this.displayHelpMenu();
                break;
            case "Q":
                return false;
            default:
                System.out.println("\n*** Invalid selection, please try again. ***");
                break;
        }

        return true;
    }

    private void startNewGame() {
        GameControl.createNewGame(HungerGames.getPlayer());

        GameMenuView gameMenu = new GameMenuView();
        gameMenu.display();
    }

    private void continueExistingGame() {
        System.out.println("*** continueExistingGame function called ***");
    }

    private void displayHelpMenu() {
        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.display();
    }

}

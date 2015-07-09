/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hungerGames.view;

import byui.cit260.hungerGames.control.FightingControl;
import hungergames.HungerGames;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Carlee Ouwerkerk
 */
public class FightView extends View {

    private final String SNEAK_OR_FIGHT = "\n"
            + "\n----------------------------------------------"
            + "\n| As you examine your location, you notice   |"
            + "\n| another tribute. They don't see you,       |"
            + "\n| however. Their skill point level is +       |"
            + "\n| skillPointLevel + .  You have the option   |"
            + "\n| to either fight them or to try to sneak    |"
            + "\n| past them.                                 |"
            + "\n|                                            |"
            + "\n| F - I want to fight the other tribute.     |"
            + "\n| S - I want to try to sneak past.           |"
            + "\n----------------------------------------------";

    @Override
    public void doAction(Object obj) {

        String selection = (String) obj;
        selection = selection.toUpperCase();

        switch (selection) {
            case "F":
                this.fightTribute();
                break;
            case "S":
                this.sneakPast();
                break;
            default:
                System.out.println("\n*** Invalid selection, please try again. ***");
                break;
        }
    }

    private void fightTribute() {
        System.out.println("*** fightTribute function called ***");
//        FightingControl.calculateFight(player, tribute);
    }

    private void sneakPast() {
        System.out.println("*** sneakPast function called ***");
//        FightingControl.calculateSneak(player, scene, tribute);
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hungerGames.control;

import static byui.cit260.hungerGames.model.Item.bat;
import static byui.cit260.hungerGames.model.Item.bowAndArrow;
import static byui.cit260.hungerGames.model.Item.fruit;
import static byui.cit260.hungerGames.model.Item.knife;
import static byui.cit260.hungerGames.model.Item.meat;
import static byui.cit260.hungerGames.model.Item.spear;
import static byui.cit260.hungerGames.model.Item.sword;
import static byui.cit260.hungerGames.model.Item.water;
import byui.cit260.hungerGames.model.Player;
import byui.cit260.hungerGames.view.GameMenuView;

/**
 *
 * @author Zack
 */
public class UseItemControl {

    public static void useItem(double stats, int amount, String description) {

        //change stats
        Player player = new Player();
        double skillPoints = player.getSkillPoints();

        double newStats = skillPoints + stats;

        //change amount in inventory
        switch (description) {
            case "Fruit":
                fruit.amount = fruit.getAmount() - 1;
                break;
            case "Meat":
                meat.amount = meat.getAmount() - 1;
                break;
            case "Water":
                water.amount = water.getAmount() - 1;
                break;
            case "Bat":
                bat.amount = bat.getAmount() - 1;
                break;
            case "Knife":
                knife.amount = knife.getAmount() - 1;
                break;
            case "Sword":
                sword.amount = sword.getAmount() - 1;
                break;
            case "Bow & Arrow":
                bowAndArrow.amount = bowAndArrow.getAmount() - 1;
                break;
            case "Spear":
                spear.amount = spear.getAmount() - 1;
                break;
        }

        System.out.println("Your skill points are now " + newStats);

        GameMenuView gameMenuView = new GameMenuView();
        gameMenuView.display();

    }
}

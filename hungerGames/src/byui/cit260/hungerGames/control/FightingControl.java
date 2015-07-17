/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hungerGames.control;

import byui.cit260.hungerGames.exceptions.FightingControlException;
import byui.cit260.hungerGames.model.Tribute;
import byui.cit260.hungerGames.view.GameMenuView;
import java.util.Random;

/**
 *
 * @author Carlee Ouwerkerk
 */
public class FightingControl {

    double skillPoints;
    double environFactor;
    double tributeSkillPoints;
    Tribute tribute;

    public boolean calculateSneak(double skillPoints, double environFactor, double tributeSkillPoints, Tribute tribute) throws FightingControlException {

        this.skillPoints = skillPoints;
        this.environFactor = environFactor;
        this.tributeSkillPoints = tributeSkillPoints;
        this.tribute = tribute;

        //Sneak paramaters
        if (skillPoints < 0) {
            throw new FightingControlException("The player's stats have to be greater "
                    + "than zero.");
        }                                       // There is no other function calling this function yet, so I 
        // couldn't add any throws or catch statements anywhere else.

        if (environFactor < -3 || environFactor > 3) {
            throw new FightingControlException("The environment factor has to be greater "
                    + "than three and less than negative three.");
        }

        if (tributeSkillPoints < 5 || tributeSkillPoints >= 45) {
            throw new FightingControlException("The tribute's stats have to be greater "
                    + "than five and less than or equal to "
                    + "forty-five.");
        }

        Random randomNum1 = new Random();
        double playerRandomFactor = randomNum1.nextInt(6);

        Random randomNum2 = new Random();
        double tributeRandomFactor = randomNum2.nextInt(4);

        //Calculate sneak
        double playerFactor = (skillPoints + environFactor) * playerRandomFactor;
        double tributeFactor = tributeSkillPoints * tributeRandomFactor;

        if (playerFactor < tributeFactor) {
            System.out.println("You weren't careful enough. " + tribute + " spotted you!"
                    + "\nYou have no choice now, but to fight.");
            this.calculateForcedFight();
            return false;
        } else {

            return true;
        }
    }

    public boolean calculateForcedFight() throws FightingControlException {

        //forced fight paramaters
        if (this.skillPoints < 0 || this.skillPoints >= 51) {
            throw new FightingControlException("The player's stats have to be greater "
                    + "than zero.");
        }

        if (this.tributeSkillPoints < 5 || this.tributeSkillPoints > 45) {
            throw new FightingControlException("The tribute's stats have to be greater "
                    + "than five and less than or equal to "
                    + "forty-five.");
        }

        // As we make new random numbers with different ranges we should continue with the pattern of randomNum1, randomNum2, randomNum3, etc.
        Random randomNum1 = new Random();
        double RandomFactor = randomNum1.nextInt(4);

        //Calculate forced fight
        double playerFactor = ((skillPoints - 3) * RandomFactor);
        double tributeFactor = tributeSkillPoints * RandomFactor;

        //ignore the "if statement is redundant" comment on the left.
        if (playerFactor < tributeFactor) {
            System.out.println("You have been killed by " + tribute + "."
                    + "\n GAME OVER.");
            return false;
        } else {
            System.out.println("Congratulations!  You have successfully killed " + tribute + " .");
            GameMenuView gameMenuView = new GameMenuView();
            gameMenuView.display();
            return true;
        }
    }

    public boolean calculateFight() throws FightingControlException {

        //Sneak paramaters
        if (skillPoints < 0 || skillPoints >= 51) {
            throw new FightingControlException("The player's stats have to be greater "
                    + "than zero.");
        }

        if (tributeSkillPoints < 5 || tributeSkillPoints >= 45) {
            throw new FightingControlException("The tribute's stats have to be greater "
                    + "than five and less than or equal to "
                    + "forty-five.");
        }

        // As we make new random numbers with different ranges we should continue with the pattern of randomNum1, randomNum2, randomNum3, etc.
        Random randomNum1 = new Random();
        double RandomFactor = randomNum1.nextInt(4);

        //Calculate sneak
        double playerFactor = (skillPoints + 2) * RandomFactor;
        double tributeFactor = tributeSkillPoints * RandomFactor;

        //ignore the "if statement is redundant" comment on the left.
        if (playerFactor < tributeFactor) {
            System.out.println("You have been killed by " + tribute + "."
                    + "\n GAME OVER.");
            return false;
        } else {
            System.out.println("Congratulations!  You have successfully killed " + tribute + " .");
            GameMenuView gameMenuView = new GameMenuView();
            gameMenuView.display();
            return true;
        }
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hungerGames.view;

import byui.cit260.hungerGames.control.FightingControl;
import byui.cit260.hungerGames.exceptions.FightingControlException;
import byui.cit260.hungerGames.model.Location;
import byui.cit260.hungerGames.model.Player;
import byui.cit260.hungerGames.model.Scene;
import byui.cit260.hungerGames.model.Tribute;

/**
 *
 * @author Carlee Ouwerkerk
 */
public class FightView extends View {

    Location location;
    Tribute tribute;
    double tributeStats;
    String tributeName;
    Scene scene;

    public FightView(Location location, String promptMessage) {
        super(promptMessage);

        this.location = location;
        this.tribute = location.getTribute();
        this.tributeName = tribute.getName();
        this.tributeStats = tribute.getStats();
        this.scene = location.getScene();
        
        promptMessage = "\n"
                + "\n-----------------------------------------------"
                + "\n As you examine your location, you notice    "
                + "\n another tribute. It's " + this.tributeName + ". They don't see "
                + "\n you, however. Their skill point level is    "
                + "\n " + tributeStats + ".                       "
                + "\n                                             "
                + "\n You have the option to either fight them or "
                + "\n to try to sneak past them.                  "
                + "\n                                             "
                + "\n F - I want to fight the other tribute.      "
                + "\n S - I want to try to sneak past.            "
                + "\n-----------------------------------------------"
                + "\n \n What do you choose?";

        this.setPromptMessage(promptMessage);
  
    }

    @Override
    public boolean doAction(Object obj) {
        String selection = (String) obj;
        char choice = selection.trim().charAt(0);
        switch (choice) {
            case 'F':
                this.fightTribute();
                return true;
            case 'S':
                this.sneakPast();
                return true;
            default:
                ErrorView.display(this.getClass().getName(), "\n*** Invalid selection, please try again. ***");
                return false;
        }
    }

    private void fightTribute() {

        Player player = new Player();
        double skillPoints = player.getSkillPoints();

        double environFactor = this.scene.getStats();

        double tributeSkillPoints = this.tributeStats;
        
        FightingControl fightingControl = new FightingControl();

        try {
            fightingControl.calculateFight(skillPoints, tributeSkillPoints, this.tributeName);
        } catch (FightingControlException fce) {
            ErrorView.display("FightView", fce.getMessage());
        }
        return;

    }

    private void sneakPast() {

        Player player = new Player();
        double skillPoints = player.getSkillPoints();

        double environFactor = this.scene.getStats();

        double tributeSkillPoints = this.tributeStats;

        FightingControl fightingControl = new FightingControl();

        try {
            fightingControl.calculateSneak(skillPoints, environFactor, tributeSkillPoints, this.tributeName);
        } catch (FightingControlException fce) {
            ErrorView.display("FightView", fce.getMessage());
        }
        return;
    }
}
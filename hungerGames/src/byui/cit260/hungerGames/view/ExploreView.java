/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hungerGames.view;

import byui.cit260.hungerGames.model.Location;
import byui.cit260.hungerGames.model.Scene;

/**
 *
 * @author Zack
 */
public class ExploreView extends View {

    Location location;
    Scene scene;

    public ExploreView(Location location, Scene scene, String promptMessage) {
        super(promptMessage);

        String description = scene.getDescription();

        promptMessage = "" + description + "\n\nWould you like to "
                + "\ncheck this area for items or for tributes?"
                + "\nI - Items"
                + "\nT - Tributes"
                + "\nB - Back";

        this.setPromptMessage(promptMessage);

        this.location = location;
        this.scene = scene;

    }

    @Override
    public boolean doAction(Object obj) {
        String selection = (String) obj;
        selection = selection.toUpperCase();

        switch (selection) {
            case "I":
                this.checkForItems();
                break;
            case "T":
                this.checkForTributes();
                break;
            case "B":
                return false;
            default:
                ErrorView.display(this.getClass().getName(), "\n*** Invalid selection, try again. ***");
                break;
        }
        return true;
    }

    // For Zack and Carlee to-do:
    // end user will explore the location - done
    // location needs to get scene - done, but doesn't work
    // description of scene will display - done, but doesn't work
    // scene needs to get items available - put this into stub function below
    // scene needs to get tribute if applicable - put this into stub function below - done
    // end user has to fight or sneak by if tribute is located - call fighting view in stub function to do this - done
    // once explore has been done retrun end user to GameMenuView
    
    private void checkForItems() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void checkForTributes() {
        
        //check if there's a tribute in location
        //if not, print "There are no tributes in this location"
        if (location.getTribute() == null){
            this.console.print("There are no tributes in this location.");
            return;
        }
        
        //if yes, call fightview
        else {
            FightView fightView = new FightView(location, null);
            fightView.display();
            return;
        }
    }

}

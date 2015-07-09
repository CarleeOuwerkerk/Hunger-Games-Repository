/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hungerGames.view;


/**
 *
 * @author Zack
 */
public class HelpMenuView extends View {

    public HelpMenuView() {
        super("\n"
                + "\n----------------------------------------------"
                + "\n| Help Menu                                  |"
                + "\n----------------------------------------------"
                + "\nO - Objective"
                + "\nC - Controls "
                + "\nG - Gathering supplies"
                + "\nV - View inventory"
                + "\nB - Back"
                + "\n----------------------------------------------");

    }

    @Override
    public boolean doAction(Object obj) {

        String value = (String) obj;
        char selection = value.charAt(0);

        switch (selection) {
            case 'O':
                this.viewObjectives();
                break;
            case 'C':
                this.viewControls();
                break;
            case 'G':
                this.gatherSupplies();
                break;
            case 'V':
                this.viewInventoryHelp();
                break;
            case 'B':
                return false;
            default:
                this.console.println("\n*** Invalid selection, try again. ***");
                break;
        }
        return true;
    }

    private void viewObjectives() {
        this.console.println("\n\n********************************************"
                + "\n************** The Objective ***************"
                + "\n* The objective of the game is to be the   *"
                + "\n* last tribute standing. You do this by    *"
                + "\n* killing the other 23 tributes with       *"
                + "\n* weapons you collect during the game.     *"
                + "\n* After you kill the last tribute you will *"
                + "\n* be declared the winner of the 67th annual*"
                + "\n* Hunger Games!                            *"
                + "\n********************************************");

    }

    private void viewControls() {
        this.console.println("\n\n********************************************"
                + "\n************** The Controls ****************"
                + "\n* In order to move to a new location, you  *"
                + "\n* must first consult your map. This is     *"
                + "\n* done by going to the Gameplay Menu and   *"
                + "\n* entering the letter 'M' Here you will be *"
                + "\n* able to view your current location as    *"
                + "\n* well as the locations you have previously*"
                + "\n* visited. Areas you have not yet visited  *"
                + "\n* will appear with question marks on them, *"
                + "\n* while the areas that you have visited    *"
                + "\n* will have the terrain listed, as well as *"
                + "\n* the name of any  tribute you have snuck  *"
                + "\n* past while in that location.             *"
                + "\n********************************************");

    }

    private void gatherSupplies() {
        this.console.println("\n\n********************************************"
                + "\n************* Gather Supplies **************"
                + "\n* To gather supplies, you must explore     *"
                + "\n* locations. Some locations are empty,     *"
                + "\n* others have weapons, supplies, or food   *"
                + "\n* that will help you with your objective.  *"
                + "\n* When you reach a location that has an    *"
                + "\n* item, you will be given the option to    *"
                + "\n* pick the item pick and add it to your    *"
                + "\n* inventory or leave the item behind.      *"
                + "\n********************************************");
    }

    private void viewInventoryHelp() {
        this.console.println("\n\n********************************************"
                + "\n*************** Inventory ******************"
                + "\n* In order to view your inventory, you must*"
                + "\n* go to the Gameplay menu and enter the    *"
                + "\n* letter 'I' This will take you right to   *"
                + "\n* your inventory where you may view the    *"
                + "\n* items by category: Food, Weapons, and    *"
                + "\n* Supplies.                                *"
                + "\n********************************************");
    }

    private void viewMainMenu() {
        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.display();
    }

}

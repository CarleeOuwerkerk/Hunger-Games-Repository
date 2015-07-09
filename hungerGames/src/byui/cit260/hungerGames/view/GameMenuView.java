/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hungerGames.view;

import byui.cit260.hungerGames.control.TributeControl;
import byui.cit260.hungerGames.model.Location;
import hungergames.HungerGames;

/**
 *
 * @author Zack
 */
public class GameMenuView extends View {

    public GameMenuView() {
        super("\n"
                + "\n----------------------------------------------"
                + "\n| Game Play Menu                             |"
                + "\n----------------------------------------------"
                + "\nI - Inventory"
                + "\nT - Set Trap"
                + "\nM - Map"
                + "\nR - Remaining Tributes"
                + "\nS - Save Game"
                + "\nH - Help"
                + "\nQ - Quit"
                + "\n----------------------------------------------");

    }

    /**
     *
     * @param obj
     * @return
     */
    @Override
    public boolean doAction(Object obj) {

        String value = (String) obj;
        char selection = value.charAt(0);

        switch (selection) {
            case 'I':
                this.viewInventoryMenu();
                break;
            case 'T':
                this.setTrap();
                break;
            case 'M':
                this.viewMap();
                break;
            case 'R':
                this.viewRemainingTributes();
                break;
            case 'S':
                this.saveGame();
                break;
            case 'H':
                this.displayHelpMenu();
                break;
            case 'Q':
                return false;
            default:
                this.console.println("\n*** Invalid selection, please try again. ***");
                break;
        }
        return true;
    }

    private void viewInventoryMenu() {

        InventoryMenuView inventoryMenuView = new InventoryMenuView(null);
        inventoryMenuView.display();

    }

    private void setTrap() {
        TrapView trapView = new TrapView();
        trapView.display();
    }

    private void viewMap() {

        Location[][] locations = HungerGames.getCurrentGame().getMap().getLocations();

        this.console.println("\n***** Welcome to the 67th Annual Hunger Games ******");
        this.console.println("   |  0 |  1 |  2 |  3 |  4 |  5 |");

        for (int i = 0; i < locations[0].length; i++) {
            this.console.println("\n----------------------------------");
            this.console.format("%2d", i);
            for (int j = 0; j < locations[0].length; j++) {
                this.console.print(" | ");
               this.console.print(locations[i][j].getScene().getMapSymbol());

            }
            this.console.print(" | ");
        }
        this.console.println("\n----------------------------------");

        MapView mapView = new MapView();
        mapView.display();
    }

    private void viewRemainingTributes() {
        TributeControl.sortTribute();

    }

    private void saveGame() {
        System.out.println("*** saveGame function called ***");
    }

    private void displayHelpMenu() {

        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.display();
    }

}

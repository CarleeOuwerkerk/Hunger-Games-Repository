/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hungerGames.view;

import byui.cit260.hungerGames.control.GameControl;
import byui.cit260.hungerGames.model.Location;
import byui.cit260.hungerGames.model.Tribute;
import hungergames.HungerGames;
import java.io.IOException;
import java.io.PrintWriter;

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
                + "\nP - Print Tribute List"
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

        String selection = (String) obj;

        switch (selection) {
            case "I":
                this.viewInventoryMenu();
                break;
            case "T":
                this.setTrap();
                break;
            case "M":
                this.viewMap();
                break;
            case "R":
                this.sortTribute();
                break;
            case "S":
                this.saveGame();
                break;
            case "H":
                this.displayHelpMenu();
                break;
            case "P":
                this.printTributeList();
                break;
            case "Q":
                return false;
            default:
                ErrorView.display(this.getClass().getName(), "\n*** Invalid selection, please try again. ***");
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

    public Tribute[] sortTribute() {
        Tribute[] tribute = Tribute.values();

        for (int i = 0; i < tribute.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < tribute.length; j++) {
                if (tribute[j].getName().compareToIgnoreCase(tribute[index].getName()) < 0) {
                    index = j;
                }
                Tribute smaller = tribute[index];
                tribute[index] = tribute[i];
                tribute[i] = smaller;

            }
        }
        for (Tribute i : tribute) {
            this.console.println(i);

        }
        return tribute;
    }

    private void saveGame() {
        this.console.println("\n\n Please enter the file path where you would like this game to be saved.");
        String filePath = this.getInput();

        try {
            GameControl.saveGame(HungerGames.getCurrentGame(), filePath);
        } catch (Exception ex) {
            ErrorView.display("MainMenuView", ex.getMessage());
        }
    }

    private void displayHelpMenu() {

        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.display();
    }

    private void printTributeList() {
        PrintTributeListView printTributeList = new PrintTributeListView();
        printTributeList.display();
    }

}
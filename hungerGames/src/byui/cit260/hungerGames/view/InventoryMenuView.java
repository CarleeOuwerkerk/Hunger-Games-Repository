/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hungerGames.view;

import byui.cit260.hungerGames.control.UseItemControl;
import byui.cit260.hungerGames.exceptions.UseItemException;
import byui.cit260.hungerGames.model.AssignedItem;
import byui.cit260.hungerGames.model.Item;
import static byui.cit260.hungerGames.model.Item.bat;
import static byui.cit260.hungerGames.model.Item.bowAndArrow;
import static byui.cit260.hungerGames.model.Item.fruit;
import static byui.cit260.hungerGames.model.Item.knife;
import static byui.cit260.hungerGames.model.Item.meat;
import static byui.cit260.hungerGames.model.Item.spear;
import static byui.cit260.hungerGames.model.Item.sword;
import static byui.cit260.hungerGames.model.Item.water;
import hungergames.HungerGames;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Zack
 */
public class InventoryMenuView extends View {

        private Item selectedItem;
        
        
    public InventoryMenuView(String promptMessage) {

        super(promptMessage);

        promptMessage = "\n"
                + "\n----------------------------------------------"
                + "\n| Inventory Menu                              |"
                + "\n----------------------------------------------"
                + "\nP-PrintInventory List                         "
                + "\n----------------------------------------------"
                + "\nB- Back                                       ";

        ArrayList<AssignedItem> assignedItems = sortItem(HungerGames.getCurrentGame().getItemList());

        promptMessage += "\n----------------------------------------------";

        for (AssignedItem assignedItem : assignedItems) {
            String firstCharacter = assignedItem.getItem().getDescription().substring(0, 2);
            
            
            String itemText = "\n" + firstCharacter + " - " + assignedItem.getItem().getDescription();

            promptMessage += itemText;

            promptMessage += "\n----------------------------------------------";

            this.setPromptMessage(promptMessage);

        }

    }

    @Override
    public boolean doAction(Object obj) {

        int amount;
        double stats;
        String description;

        String selection = (String) obj;
        selection = selection.toUpperCase();

        switch (selection) {
            case "FR":
                this.selectedItem = Item.fruit;
                break;
            case "ME":
                this.selectedItem = Item.meat;
                break;
            case "WA":
                this.selectedItem = Item.water;
                break;
            case "BA":
                this.selectedItem = Item.bat;
            case "KN":
                this.selectedItem = Item.knife;
                break;
            case "SW":
                this.selectedItem = Item.sword;
            case "BO":
                this.selectedItem = Item.bowAndArrow;
            case "SP":
                this.selectedItem = Item.spear;
            case "P":
                this.printInventoryList();
            case "B":
                return false;
            default:
                ErrorView.display(this.getClass().getName(), "\n*** Invalid selection, try again. ***");
                break;
        }
            try {
                UseItemControl.useItem(selectedItem);
            } catch (UseItemException ex) {
                ErrorView.display(this.getClass().getName(), ex.getMessage());
                return false;
            }
            
            this.console.println("Your skill points are now " + HungerGames.getPlayer().getSkillPoints());
        return true;
    }

    public ArrayList<AssignedItem> sortItem(ArrayList<AssignedItem> itemList) {

        for (int i = 0; i < itemList.size() - 1; i++) {
            int index = i;
            for (int j = i + 1; j < itemList.size(); j++) {

                AssignedItem itemOne = itemList.get(j);
                AssignedItem itemTwo = itemList.get(index);

                if (itemOne.getItem().getDescription().compareToIgnoreCase(itemTwo.getItem().getDescription()) < 0) {
                    index = j;
                }
                AssignedItem smaller = itemTwo;
                itemList.set(index, itemTwo);
                itemList.set(i, smaller);

            }

        }
        return itemList;
    }

    private void printInventoryList() {
        PrintInventoryView printInventory = new PrintInventoryView();
        printInventory.display();
    }

}




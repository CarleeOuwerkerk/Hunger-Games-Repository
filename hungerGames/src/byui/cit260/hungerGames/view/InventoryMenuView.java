/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hungerGames.view;

import byui.cit260.hungerGames.control.DiscardItemControl;
import byui.cit260.hungerGames.control.UseItemControl;
import byui.cit260.hungerGames.exceptions.DiscardItemException;
import byui.cit260.hungerGames.exceptions.UseItemException;
import byui.cit260.hungerGames.model.Item;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Zack
 */
public class InventoryMenuView extends View {

    public InventoryMenuView(String promptMessage) {

        super(promptMessage);

        promptMessage = "\n"
                + "\n----------------------------------------------"
                + "\n| Inventory Menu                              |"
                + "\n----------------------------------------------";

        Item[] items = sortItem();

        for (Item item : items) {
            String firstCharacter = item.getDescription().substring(0, 2);
            String itemText = "\n" + firstCharacter + " - " + item.getDescription();

            promptMessage += itemText;

            promptMessage += "\n----------------------------------------------";

            this.setPromptMessage(promptMessage);

        }

    }

    @Override
    public boolean doAction(Object obj) {

        String selection = (String) obj;
        selection = selection.toUpperCase();

        switch (selection) {
            case "FR":
                this.view();
                break;
            case "ME":
                this.view();
                break;
            case "WA":
                this.view();
                break;
            case "BA":
                this.view();
                break;
            case "KN":
                this.view();
                break;
            case "SW":
                this.view();
                break;
            case "BO":
                this.view();
                break;
            case "SP":
                this.view();
                break;
            case "RO":
                this.view();
                break;
            case "B":
                return false;
            default:
                System.out.println("\n*** Invalid selection, try again. ***");
                break;
        }
        return true;
    }

//    private void viewFood() {
//        FoodItemsView foodItemsView = new FoodItemsView();
//        foodItemsView.display();
//    }
//
//    private void viewWeapons() {
//        WeaponsView weaponsView = new WeaponsView();
//        weaponsView.display();
//        
//    }
//        
//    private void viewSupplies() {
//        SupplyItemsView supplyItemsView = new SupplyItemsView();
//        supplyItemsView.display();
//    }
    private void view() {

        ViewItem viewItem = new ViewItem("\n Do you want to equip or discard item?");
        viewItem.display();
    }

    private Item[] sortItem() {
        Item[] item = Item.values();

        for (int i = 0; i < item.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < item.length; j++) {
                if (item[j].getDescription().compareToIgnoreCase(item[index].getDescription().substring(0, 2)) < 0) {
                    index = j;
                }
                Item smaller = item[index];
                item[index] = item[i];
                item[i] = smaller;

            }
        }
        for (Item i : item) {
            System.out.println(i);

        }
        return item;
    }

    class ViewItem extends View {

        public ViewItem(String promptMessage) {
            super("\n\n********************************************"
                    + "\n* Do you wish to use or discard item?    *"
                    + "\n*                                          *"
                    + "\n* U- Use                                 *"
                    + "\n* D- Discard                               *"
                    + "\n* B- Back                                  *"
                    + "\n********************************************");
        }

        @Override
        public boolean doAction(Object obj) {

            String selectedItem = (String) obj;
            selectedItem = selectedItem.toUpperCase();

            switch (selectedItem) {
                case "U": {
                    try {
                        UseItemControl.useItem(obj);
                    } catch (UseItemException ex) {
                        Logger.getLogger(InventoryMenuView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                break;
                case "D": {
                    try {
                        DiscardItemControl.discardItem(obj);
                    } catch (DiscardItemException ex) {
                        Logger.getLogger(InventoryMenuView.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                break;
                case "B":
                    return false;
                default:
                    System.out.println("\n*** Invalid selection, please try again. ***");
                    break;
            }

            return true;
        }
    }

}

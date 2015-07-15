/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hungerGames.view;

import byui.cit260.hungerGames.model.Item;
import static byui.cit260.hungerGames.model.Item.bat;
import static byui.cit260.hungerGames.model.Item.bowAndArrow;
import static byui.cit260.hungerGames.model.Item.fruit;
import static byui.cit260.hungerGames.model.Item.knife;
import static byui.cit260.hungerGames.model.Item.meat;
import static byui.cit260.hungerGames.model.Item.rope;
import static byui.cit260.hungerGames.model.Item.spear;
import static byui.cit260.hungerGames.model.Item.sword;
import static byui.cit260.hungerGames.model.Item.water;

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
                + "\n----------------------------------------------"
                + "\nP - PrintInventory List                         "
                + "\nB - Back                                       ";

        Item[] items = sortItem();

        promptMessage += "\n----------------------------------------------";

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

        int amount;
        double stats;

        String selection = (String) obj;
        selection = selection.toUpperCase();

        switch (selection) {
            case "FR":
                amount = fruit.getAmount();
                stats = fruit.getStats();
                this.view(amount, stats);
                break;
            case "ME":
                amount = meat.getAmount();
                stats = meat.getStats();
                this.view(amount, stats);
                break;
            case "WA":
                amount = water.getAmount();
                stats = water.getStats();
                this.view(amount, stats);
                break;
            case "BA":
                amount = bat.getAmount();
                stats = bat.getStats();
                this.view(amount, stats);
                break;
            case "KN":
                amount = knife.getAmount();
                stats = knife.getStats();
                this.view(amount, stats);
                break;
            case "SW":
                amount = sword.getAmount();
                stats = sword.getStats();
                this.view(amount, stats);
                break;
            case "BO":
                amount = bowAndArrow.getAmount();
                stats = bowAndArrow.getStats();
                this.view(amount, stats);
                break;
            case "SP":
                amount = spear.getAmount();
                stats = spear.getStats();
                this.view(amount, stats);
                break;
            case "RO":
                amount = rope.getAmount();
                stats = rope.getStats();
                this.view(amount, stats);
                break;
            case "P":
                this.printInventoryList();
            case "B":
                return false;
            default:
                ErrorView.display(this.getClass().getName(), "\n*** Invalid selection, try again. ***");
                break;
        }
        return true;
    }

    private void view(int amount, double stats) {

        ItemView itemView = new ItemView(amount, stats, null);
        itemView.display();
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
            this.console.println(i);

        }
        return item;
    }

    private void printInventoryList() {
        PrintInventoryView printInventory = new PrintInventoryView();
        printInventory.display();
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hungerGames.view;

import byui.cit260.hungerGames.control.UseItemControl;

/**
 *
 * @author Carlee Ouwerkerk
 */
public class ItemView extends View {

    double stats = 0;
    int amount = 0;
    String description = null;

    public ItemView(int amount, double stats, String description, String promptMessage) {

        super(promptMessage);

        promptMessage = "\n\n********************************************"
                + "\n* You have " + amount + " of this item.                  *"
                + "\n*                                           *"
                + "\n* U- Use                                    *"
                + "\n* B- Back                                   *"
                + "\n*********************************************";

        this.setPromptMessage(promptMessage);

        this.stats = stats;
        this.amount = amount;
        this.description = description;
    }

    @Override
    public boolean doAction(Object obj) {

        String selectedItem = (String) obj;
        selectedItem = selectedItem.toUpperCase();

        switch (selectedItem) {
            case "U":
                this.useItem();
                break;
            case "B":
                return false;
            default:
                ErrorView.display(this.getClass().getName(), "\n*** Invalid selection, please try again. ***");
                break;
        }

        return true;
    }

    private void useItem() {

        if (amount == 0) {
            this.console.print("You don't have any of this item to use.");
        } else {
            UseItemControl.useItem(this.stats, this.amount, this.description);
        }

    }
}
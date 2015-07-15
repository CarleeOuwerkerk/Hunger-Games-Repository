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

    public ItemView(int amount, double stats, String promptMessage) {

        super(promptMessage);

        promptMessage = "\n\n********************************************"
                + "\n* You have " + amount + " of this item.                  *"
                + "\n*                                           *"
                + "\n* U- Use                                    *"
                + "\n* B- Back                                   *"
                + "\n*********************************************";

        this.setPromptMessage(promptMessage);

    }

    @Override
    public boolean doAction(Object obj) {
        
//        double stats = ;

        String selectedItem = (String) obj;
        selectedItem = selectedItem.toUpperCase();

        switch (selectedItem) {
            case "U":
//                UseItemControl.useItem(obj, stats);

                break;
            case "B":
                return false;
            default:
                ErrorView.display(this.getClass().getName(), "\n*** Invalid selection, please try again. ***");
                break;
        }

        return true;
    }
}

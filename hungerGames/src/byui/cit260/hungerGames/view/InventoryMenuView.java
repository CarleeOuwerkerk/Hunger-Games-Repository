/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hungerGames.view;

import java.util.Scanner;

/**
 *
 * @author Zack
 */
public class InventoryMenuView extends View{
    
        public InventoryMenuView(){
                super("\n"
            +"\n----------------------------------------------"
            +"\n| Inventory Menu                                  |"
            +"\n----------------------------------------------"
            +"\nF - Food"
            +"\nW - Weapons"
            +"\nS - Supplies"
            +"\nB - Back"
            +"\n----------------------------------------------");
                
        }
            
        @Override
    public boolean doAction(Object obj) {
        
        char selection = (char) obj;
        
        switch(selection){
            case 'F':
            case 'f':
                this.viewFood();
                break;
            case 'W':
            case 'w':
                this.viewWeapons();
                break;
            case 'S':
            case 's':
                this.viewSupplies();
                break;
            case 'B':
            case 'b':
                return false;
            default:
                System.out.println("\n*** Invalid selection, try again. ***");
                break;
        }
        return true;
    }

    private void viewFood() {
                System.out.println("\n\n******************************************"
                            +"\n************** Food Items ****************"
                            +"\n* Food items will help you increase your *"
                            +"\n* skill points. As you explore each      *"
                            +"\n* location you will find various food    *"
                            +"\n* types that will increase your skill    *"
                            +"\n* points in a different way. For example:*"
                            +"\n* Fruits will increase your skill points *"
                            +"\n* by 3 points. While meat will increase  *"
                            +"\n* your skill points by 5.                *"
                            +"\n******************************************");
    }

    private void viewWeapons() {
        WeaponsView weaponsView = new WeaponsView();
        weaponsView.display();

    }

    private void viewSupplies() {
               System.out.println("\n\n*******************************************"
                            +"\n************* Supply Items ****************"
                            +"\n* Supply items will help you increase your*"
                            +"\n* skill points. As you explore each       *"
                            +"\n* location you will find various supply   *"
                            +"\n* types that will increase your skill     *"
                            +"\n* points or be used to set a trap. Each   *"
                            +"\n* item will be identified and used        *"
                            +"\n* correctly depending on it's use.        *"
                            +"\n*******************************************");
    }
    
}

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
        FoodItemsView foodItemsView = new FoodItemsView();
        foodItemsView.display();
    }

    private void viewWeapons() {
                System.out.println("\n\n********************************************"
                            +"\n************** Weapon Items ****************"
                            +"\n* Weapon items will help you increase your *"
                            +"\n* skill points by 1, 3, or 5. As you find  *"
                            +"\n* and equip these weapons, your skill      *"
                            +"\n* points will go up. A bat, plank, and     *"
                            +"\n* knife will raise your skill points by 1; *"
                            +"\n* a sword or crossbow will increase your   *"
                            +"\n* skill points by 3; and a bow and arrow   *"
                            +"\n* or spear will increase your skill points *"
                            +"\n* by 5.                                    *"
                            +"\n********************************************");
    }

    private void viewSupplies() {
               System.out.println("\n\n*******************************************"
                            +"\n************* Supply Items ****************"
                            +"\n* Supply items will help you increase your*"
                            +"\n* skill points. As you explore each       *"
                            +"\n* location, you will find various supply  *"
                            +"\n* types that will increase your skill     *"
                            +"\n* points or be used to set a trap. Each   *"
                            +"\n* item will be identified and used        *"
                            +"\n* correctly depending on its use.         *"
                            +"\n*******************************************");
    }
    
}

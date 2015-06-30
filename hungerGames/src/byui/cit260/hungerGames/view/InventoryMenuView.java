/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hungerGames.view;

import byui.cit260.hungerGames.model.Item;
import java.util.Scanner;

/**
 *
 * @author Zack
 */
public class InventoryMenuView extends View{
    
    
    
        public InventoryMenuView(String promptMessage){
            
            super(promptMessage);
            
            promptMessage = "\n"
            +"\n----------------------------------------------"
            +"\n| Inventory Menu                              |"
            +"\n----------------------------------------------";
            
            Item [] items = Item.values();
            
            for (Item item : items) {
                String firstCharacter = item.getDescription().substring(0, 2);
                String itemText = "\n" + firstCharacter + " - " + item.getDescription();
                
              promptMessage += itemText; 
            
            promptMessage += "\nB- Back                                     |" +
                    "\n----------------------------------------------";
            
            this.setPromptMessage(promptMessage);
            
            }
        }
            
        @Override
    public boolean doAction(Object obj) {
        
        String selection = (String) obj;
        selection = selection.toUpperCase();
        
        switch(selection){
            case "FR":
                this.viewFruit();
                break;
            case "ME":
                this.viewMeat();
                break;
            case "WA":
                this.viewWater();
                break;
            case "BA":
                this.viewBat();
                break;
            case "KN":
                this.viewKnife();
                break;
            case "SW":
                this.viewSword();
                break;
            case "BO":
                this.viewBowAndArrow();
                break;
            case "SP":
                this.viewSpear();
                break;
            case "RO":
                this.viewRope();
                break;
            case "B":
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
        WeaponsView weaponsView = new WeaponsView();
        weaponsView.display();
        
    }
        
    private void viewSupplies() {
        SupplyItemsView supplyItemsView = new SupplyItemsView();
        supplyItemsView.display();
    }

    private void viewFruit() {
        System.out.println("\n*** viewFruit Stub Function Called ***");
    }

    private void viewMeat() {
       System.out.println("\n*** viewMeat Stub Function Called ***");
    }

    private void viewWater() {
        System.out.println("\n*** viewWater Stub Function Called ***");
    }

    private void viewBat() {
        System.out.println("\n*** viewBat Stub Function Called ***");
    }

    private void viewKnife() {
        System.out.println("\n*** viewKnife Stub Function Called ***");
    }

    private void viewSword() {
        System.out.println("\n*** viewSword Stub Function Called ***");
    }

    private void viewBowAndArrow() {
        System.out.println("\n*** viewBowAndArrow Stub Function Called ***");
    }

    private void viewSpear() {
       System.out.println("\n*** viewSpear Stub Function Called ***");
    }

    private void viewRope() {
       System.out.println("\n*** viewRope Stub Function Called ***");
    }
    
}

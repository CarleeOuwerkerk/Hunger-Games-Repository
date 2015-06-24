/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hungerGames.view;

import byui.cit260.hungerGames.control.DiscardItem;
import byui.cit260.hungerGames.control.EquipItem;
import hungergames.HungerGames;

/**
 *
 * @author Zack
 */
public class WeaponsView extends View{
    
        private String item = null;
    
    public WeaponsView() {
        super("\n\n********************************************"
            +"\n************** Weapon Items ****************"
            +"\n* Weapon items will help you increase your *"
            +"\n* skill points by 1, 3, or 5. As you find  *"
            +"\n* and equip these weapons your skill points*"
            +"\n* will go up. A bat, or knife will raise   *"
            +"\n* your skill points by 1. A sword will     *"
            +"\n* increase your skill points by 3. And bow *"
            +"\n* and arrow, or spear will increase your   *"
            +"\n* skill points by 5.                       *"
            +"\n*                                          *"
            +"\n* -------- Weapon choices are: ----------- *"
            +"\n*                                          *"
            +"\n* T- Bat                                   *"
            +"\n* K- Knife                                 *"
            +"\n* S- Sword                                 *"
            +"\n* A- Bow and Arrow                         *"
            +"\n* P- Spear                                 *"
            +"\n* B- Back                                  *"
            +"\n********************************************");
    }
    
    /**
     *
     * @param obj
     * @return
     */
    @Override
    public boolean doAction(Object obj) {
        
        String selection = (String) obj;
        selection = selection.toUpperCase();

        switch(selection){
            case "T":
                this.item = "bat";
                this.view();
                break;
            case "K":
                this.item = "knife";
                this.view();
                break;
            case "S":
                this.item = "sword";
                this.view();
                break;
            case "A":
                this.item = "bow and arrow";
                this.view();
                break;
            case "P":
                this.item = "spear";
                this.view();
                break;
            case "B":
                return false;
            default:
                System.out.println("\n*** Invalid selection, please try again. ***");
                break;
        }
        
        return true;
    }

    private void view() {
                
        ViewItem viewItem = new ViewItem("\n Do you want to equip or discard item?");
        viewItem.display();
    }



    class ViewItem extends View {

        
        public ViewItem(String promptMessage) {
            super("\n\n********************************************"
                   +"\n* Do you wish to equip or discard item?    *"
                   +"\n*                                          *"
                   +"\n* E- Equip                                 *"
                   +"\n* D- Discard                               *"
                   +"\n* B- Back                                  *"
                   +"\n********************************************");
        }

        @Override
        public boolean doAction(Object obj) {
            String selectedItem = item;
            selectedItem = selectedItem.toUpperCase();
            
           
            switch (selectedItem) {
                case "E":
                  EquipItem.equipItem(obj);
                  System.out.println("Item was equipped");  
                    break;
                case "D":
                  EquipItem.equipItem(obj);
                  System.out.println("Item was discarded");  
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


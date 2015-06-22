/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hungerGames.view;

/**
 *
 * @author Carlee Ouwerkerk
 */
public class SupplyItemsView extends View{
    
    
        public SupplyItemsView(){
        super("\n\n******************************************"
               +"\n************* Supply Items ***************"
               +"\n* Supply items will help you to increase *"
               +"\n* your skill points. As you explore      *"
               +"\n* various locations, you will find       *"
               +"\n* various supply items. Some of these    *"     
               +"\n* may be used to set a trap. Select a    *"
               +"\n* supply item below to get a description,*"
               +"\n* see how many you have, use the item,   *"
               +"\n* or discard the item.                   *"
               +"\n*                                        *"
               +"\n* R - Rope                               *"
               +"\n* M - Meat                               *"
               +"\n* W - Water                              *"
               +"\n* B - Back                               *"
               +"\n******************************************");
    }
    
    @Override
    public boolean doAction(Object obj) {
        
        char selection = (char) obj;

        switch(selection){
            case 'R':
            case 'r':
                this.viewFruit();
                break;
            case 'M':
            case 'm':
                this.viewMeat();
                break;
            case 'W':
            case 'w':
                this.viewWater();
                break;
            case 'B':
            case 'b':
                return false;
            default:
                System.out.println("\n*** Invalid selection, please try again. ***");
                break;
        }
        
        return true;
    }

    private void viewFruit() {
        System.out.println("\n\n********************************************"
                            +"\n******************* Rope *******************"
                            +"\n* H - See how many you have                *"
                            +"\n* D - Description                          *"
                            +"\n* U - Use the item                         *"
                            +"\n* X - Discard                              *"
                            +"\n* B - Back                                 *"
                            +"\n********************************************");
    }

    private void viewMeat() {
        System.out.println("\n\n********************************************"
                            +"\n****************** Meat ********************"
                            +"\n* H - See how many you have                *"
                            +"\n* D - Description                          *"
                            +"\n* E - Use the item                         *"
                            +"\n* X - Discard                              *"
                            +"\n* B - Back                                 *"
                            +"\n********************************************");
    }

    private void viewWater() {
        System.out.println("\n\n********************************************"
                            +"\n****************** Water *******************"
                            +"\n* H - See how many you have                *"
                            +"\n* D - Description                          *"
                            +"\n* E - Use the item                         *"
                            +"\n* X - Discard                              *"
                            +"\n* B - Back                                 *"
                            +"\n********************************************");
    }
           
    
}

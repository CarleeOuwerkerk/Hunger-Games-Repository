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
public class FoodItemsView extends View{
    
    public FoodItemsView(){
        super("\n\n******************************************"
               +"\n************** Food Items ****************"
               +"\n* Food items will help you to increase   *"
               +"\n* your skill points. As you explore      *"
               +"\n* various locations, you will find       *"
               +"\n* various food items.  Select a food     *"
               +"\n* item below to get a description, see   *"
               +"\n* how many you have, eat the item, or    *"
               +"\n* discard the item.                      *"
               +"\n*                                        *"
               +"\n* F - Fruit                              *"
               +"\n* M - Meat                               *"
               +"\n* W - Water                              *"
               +"\n* B - Back                               *"
               +"\n******************************************");
    }
    
    @Override
    public boolean doAction(Object obj) {
        
        char selection = (char) obj;

        switch(selection){
            case 'F':
            case 'f':
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
                            +"\n****************** Fruit *******************"
                            +"\n* H - See how many you have                *"
                            +"\n* D - Description                          *"
                            +"\n* E - Eat the item                         *"
                            +"\n* D - Discard                              *"
                            +"\n* B - Back                                 *"
                            +"\n********************************************");
    }

    private void viewMeat() {
        System.out.println("\n\n********************************************"
                            +"\n****************** Meat ********************"
                            +"\n* H - See how many you have                *"
                            +"\n* D - Description                          *"
                            +"\n* E - Eat the item                         *"
                            +"\n* D - Discard                              *"
                            +"\n* B - Back                                 *"
                            +"\n********************************************");
    }

    private void viewWater() {
        System.out.println("\n\n********************************************"
                            +"\n****************** Water *******************"
                            +"\n* H - See how many you have                *"
                            +"\n* D - Description                          *"
                            +"\n* E - Eat the item                         *"
                            +"\n* D - Discard                              *"
                            +"\n* B - Back                                 *"
                            +"\n********************************************");
    }
                       
                    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hungerGames.view;

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
                this.viewBat();
                break;
            case "K":
                this.item = "knife";
                this.viewKnife();
                break;
            case "S":
                this.item = "sword";
                this.viewSword();
                break;
            case "A":
                this.item = "bow and arrow";
                this.viewBow();
                break;
            case "P":
                this.item = "spear";
                this.viewSpear();
                break;
            case "B":
                return false;
            default:
                System.out.println("\n*** Invalid selection, please try again. ***");
                break;
        }
        
        return true;
    }

    
    
    
//    private void view() {
//                
//        ViewItem viewItem = new ViewItem("\n Do you want to equip or discard item?");
//        viewItem.display();
//    }
//
//
//
//    class ViewItem extends View {

        
        
        
//        public ViewItem(String promptMessage) {
//            super(promptMessage);
//        }
//
//        @Override
//        public boolean doAction(Object obj) {
//            String selectedItem = item;
//            
//            // downcast obj to String
//            
//            // if equip then
//                // call control function to equip
//                // didslau item was equipred
//            // else if discard then
//                // call control function to discard
//                // display item was discardd
//            // else 
//                // display "invalid selection"
//                // returm fa;se
//
//            return true;
//
//        }
//
//
//    }

    private void viewBat() {
        System.out.println("*** viewBat function called ***");
    }

    private void viewKnife() {
        System.out.println("*** viewKnife function called ***");
    }

    private void viewSword() {
        System.out.println("*** viewSword function called ***");
    }

    private void viewBow() {
        System.out.println("*** viewBow function called ***");
    }

    private void viewSpear() {
        System.out.println("*** viewSpear function called ***");
    }

}
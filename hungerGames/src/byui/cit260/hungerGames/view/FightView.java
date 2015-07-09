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
public class FightView extends View {

    public FightView(String promptMessage) {
        super("\n"
                + "\n----------------------------------------------"
                + "\n| As you examine your location, you notice   |"
                + "\n| another tribute. They don't see you,       |"
                + "\n| however. Their skill point level is +       |"
                + "\n| skillPointLevel + .  You have the option   |"
                + "\n| to either fight them or to try to sneak    |"
                + "\n| past them.                                 |"
                + "\n|                                            |"
                + "\n| F - I want to fight the other tribute.     |"
                + "\n| S - I want to try to sneak past.           |"
                + "\n----------------------------------------------"
                + "\n \n What do you choose?");
    }

    @Override
    public boolean doAction(Object obj) {
        String selection = (String) obj;
        char choice = selection.trim().charAt(0);
        switch (choice) {
            case 'F':
                this.fightTribute();
                return true;
            case 'S':
                this.sneakPast();
                return true;
            default:
                this.console.println("\n*** Invalid selection, please try again. ***");
                return false;
        }
    }

    private void fightTribute() {
        System.out.println("*** fightTribute function called ***");
//        FightingControl.calculateFight(player, tribute);
    }

    private void sneakPast() {
        System.out.println("*** sneakPast function called ***");
//        FightingControl.calculateSneak(player, scene, tribute);
    }
}

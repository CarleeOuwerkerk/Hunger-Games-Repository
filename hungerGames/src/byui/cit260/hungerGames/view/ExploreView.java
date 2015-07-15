/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hungerGames.view;

import byui.cit260.hungerGames.model.Location;
import byui.cit260.hungerGames.model.Scene;

/**
 *
 * @author Zack
 */
public class ExploreView extends View{
    
    Location location;
    Scene scene;
    

    public ExploreView(Location location, Scene scene, String promptMessage) {
        super(promptMessage);
        
        promptMessage = "welcome";
        
        this.setPromptMessage(promptMessage);
        
        this.location = location;
        this.scene = scene;
        String description = scene.getDescription();
        
    }

    @Override
    public boolean doAction(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    // For Zack and Carlee to-do:
    // end user will explore the location - done
    // description of scene will display
    // location needs to get scene
    // scene needs to get items available
    // scene needs to get tribute if applicable
    // end user has to fight or sneak by if tribute is located
    // once explore has been done retrun end user to GameMenuView
    
    
}

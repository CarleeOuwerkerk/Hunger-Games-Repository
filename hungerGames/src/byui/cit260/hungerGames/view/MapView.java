/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hungerGames.view;

import byui.cit260.hungerGames.control.MapControl;

/**
 *
 * @author Carlee Ouwerkerk
 */
public class MapView extends View {

    public MapView() {
        super("\n"
                + "\n----------------------------------------------"
                + "\nPlease enter the coordinates of a location on "
                + "\nthe map. (row, column)"
                + "\n"
                + "\nB - Back"
                + "\n----------------------------------------------");

    }

    
    @Override
    public boolean doAction(Object obj) {
        String input = (String) obj;
        String[] coordinates = input.split(",");
        String inputOne = coordinates[0];
        String inputTwo = coordinates[1];

        int row = Integer.parseInt(inputOne);
        int col = Integer.parseInt(inputTwo);
        
        MapControl.movePlayerToLocation(row, col);

    }

}

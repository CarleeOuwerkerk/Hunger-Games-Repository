/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hungerGames.control;

import byui.cit260.hungerGames.model.Tribute;
import java.util.Arrays;

/**
 *
 * @author Carlee Ouwerkerk
 */
public class TributeControl {

    //sort tributes alphabetically
    public static Tribute[] sortTribute() {
        Tribute[] tribute = Tribute.values();

        for (int i = 0; i < tribute.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < tribute.length; j++) {
                if (tribute[j].getName().compareToIgnoreCase(tribute[index].getName()) < 0) {
                    index = j;
                }
                Tribute smaller = tribute[index];
                tribute[index] = tribute[i];
                tribute[i] = smaller;

            }
        }
        for (Tribute i : tribute) {
            System.out.println(i);

        }
        return tribute;
    }

}

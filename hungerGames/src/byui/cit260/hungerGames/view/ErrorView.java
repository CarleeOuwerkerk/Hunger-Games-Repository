/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hungerGames.view;

import hungergames.HungerGames;
import java.io.PrintWriter;

/**
 *
 * @author Carlee Ouwerkerk
 */
public class ErrorView {
    
    private static final PrintWriter errorFile = HungerGames.getOutFile();
    private static final PrintWriter logFile = HungerGames.getLogFile();
    
    public static void display(String className, String errorMessage){
        
        errorFile.println(
                        "--------------------------------------------------------"
                       +"\n- Error - " + errorMessage
                       +"--------------------------------------------------------");
        
        logFile.println(className + " - " + errorMessage);
    }
}

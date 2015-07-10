/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hungerGames.view;

import byui.cit260.hungerGames.model.Tribute;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Carlee Ouwerkerk
 */
public class PrintTributeListView extends View{

    public PrintTributeListView() {
        super("\n\nEnter the file path where you would like the report to be printed."
             +"\nB - Back");
    }


    @Override
    public boolean doAction(Object obj) {
        String filePath = (String) obj;
        
        try (PrintWriter out = new PrintWriter(filePath)) {
 
            out.println("\n\n           Tribute List           ");
            out.printf("%n%-20s%10s", "Name", "District");
            out.printf("%n%-20s%10s", "____", "________");
            
            for (Tribute tribute : Tribute.values()){
                out.printf("%n%-20s%10d", tribute.getName()
                                             , tribute.getDistrict());
            }
        } catch (IOException ex){
            this.console.println("I/O Error: " + ex.getMessage());
        }
        this.console.println("You have successfully printed the tribute list.");
        return true;
    }
    
    
}

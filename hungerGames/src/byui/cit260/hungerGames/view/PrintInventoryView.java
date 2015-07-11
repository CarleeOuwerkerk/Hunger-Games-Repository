/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hungerGames.view;

import byui.cit260.hungerGames.model.Item;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Zack
 */
public class PrintInventoryView extends View {
    
public PrintInventoryView() {
        super("\n\nEnter the file path where you would like the report to be printed."
             +"\nB - Back");
    }


    @Override
    public boolean doAction(Object obj) {
        String filePath = (String) obj;
        
        try (PrintWriter out = new PrintWriter(filePath)) {
 
            out.println("\n\n             Inventory List             ");
            out.printf("%n%-20s%10d%10s", "Item Description", "Stats", "Amount" );
            out.printf("%n%-20s%10d%10s", "________________", "_____", "______");
            
            for (Item item : Item.values()){
                out.printf("%n%-20s%10d%10d", item.getDescription()
                                            , item.getStats()
                                            , item.getAmount());
            }
        } catch (IOException ex){
            this.console.println("I/O Error: " + ex.getMessage());
        }
        this.console.println("You have successfully printed the Inventory list.");
        return true;
    }
    
    
}

